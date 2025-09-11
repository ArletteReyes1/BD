import {
  validarNombre,
  validarPrecio,
  validarDias,
  validarNoches,
  validarLugar,
} from "./valform.js";



document.addEventListener("DOMContentLoaded", () => {
  // Botones del HTML
  const botonCrear = document.getElementById("botoncrear");
  const botonguardar = document.getElementById("btnGuardar");
  const btnCerrar = document.getElementById("btnCerrar");

  // Inputs del Modal
  const iptName = document.getElementById("iptName");
  const iptPrecio = document.getElementById("iptPrecio");
  const iptLugar = document.getElementById("iptLugar");
  const iptDias = document.getElementById("iptDias");
  const iptNoches = document.getElementById("iptNoches");
  const iptAlerta = document.getElementById("iptAlerta");
  const iptNoIncluye = document.getElementById("iptNoIncluye");
  const iptIncluye = document.getElementById("iptIncluye");
  const iptImagen = document.getElementById("iptImagen");

  // previsualizacion de la imagen
  const preview = document.getElementById("imagePreview");

  // Tarjetas de información
  const cardTotalPaquetes = document.getElementById("total-paquetes");
  const cardPaquetesActivos = document.getElementById("paquetes-activos");

  // Tabla con lista de paquetes
  const tablaListaPaquetes = document.getElementById("tablaListaPaquetes");

  // Creamos el modal y escuchamos el evento de click para abrirlo
  const modal = new bootstrap.Modal(document.getElementById("formModal"));
  botonCrear.addEventListener("click", () => modal.show());

  // Evento para mostrar vista previa de la imagen al seleccionar un archivo
  iptImagen.addEventListener("change", vistaPreviaImagen);

  // Evento para guardar el paquete al hacer clic en el botón "Guardar"
  botonguardar.addEventListener("click", async function () {
    // se extraen valores de los inputs y se quita espacios vacios al inicio y final
    const titulo = iptName.value.trim();
    const precio = iptPrecio.value.trim();
    const lugar = iptLugar.value.trim();
    const dias = iptDias.value.trim();
    const noches = iptNoches.value.trim();
    const noincluye = iptNoIncluye.value.trim();
    const incluye = iptIncluye.value.trim();
    const archivo = iptImagen.files[0];

    // se limpia la alerta por si habia una previa
    limpiarAlerta();

    let mensajesError = [];
    // si un campo falta se agrega a la lista de errores
    if (!titulo || !precio || !lugar || !dias || !noches || !noincluye || !incluye || !archivo) {
      mensajesError.push("Todos los campos son obligatorios.");
    }
    if (!validarNombre(titulo)) mensajesError.push("El nombre debe tener al menos 3 caracteres");
    if (!validarPrecio(precio)) mensajesError.push("El precio debe de ser un dato numérico");
    if (!validarLugar(lugar)) mensajesError.push("El lugar debe tener al menos 3 caracteres");
    if (!validarDias(dias)) mensajesError.push("Los días deben ser un dato numérico");
    if (!validarNoches(noches)) mensajesError.push("Las noches deben ser un dato numérico");
    if (!archivo) mensajesError.push("Debes seleccionar una imagen antes de guardar");

    // si hay algun valor en la lista de errores se muestra en la alerta
    if (mensajesError.length > 0) {
      crearAlerta("danger", mensajesError.join("<br>"));
      return;
    }

    // se desactiva el botón de guardar para evitar múltiples envíos
    botonguardar.disabled = true;

    // se muestra un mensaje de carga
    limpiarAlerta();
    crearAlerta("info", "Subiendo imagen, por favor espera...");

    let urlCloudinary = "";
    try {
      const formData = new FormData();
      formData.append("file", archivo);
      formData.append("upload_preset", "project");
      formData.append("folder", "folder/sub-folder");
      const response = await fetch("https://api.cloudinary.com/v1_1/dnweilptt/image/upload", {
        method: "POST",
        body: formData
      });
      const data = await response.json();
      urlCloudinary = data.secure_url;
      if (!urlCloudinary) throw new Error("No pudimos obtener la URL de Cloudinary");

      //console.log("URL ", urlCloudinary);

      const nuevopaquete = {
            titulo,
            imagenUrl:urlCloudinary,
            precio,
            lugares:lugar,
            dias,
            noches,
            incluye,
            noIncluye:noincluye
          };
      
      //console.log("BOdy;",JSON.stringify(nuevopaquete))
      const response1 = await fetch("http://localhost:8080/api/Productos/", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
            "Authorization": "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjcmlzdGluYS5sb3BlekBvdXRsb29rLmNvbSIsInJvbGUiOiJBZG1pbmlzdHJhZG9yIiwiaWF0IjoxNzU3NTQzMTE5LCJleHAiOjE3NTc2Mjk1MTl9.JLRgwhYA9HgxhN1j4HlCA9FZGhqIHlvQ8W1gIzoBzjg"
        },
        body: JSON.stringify(nuevopaquete)
        //redirect: "follow"
      });

      if (!response1.ok) throw new Error("Error al registrar el paquete");

        //const paqueteGuardado = await response.json();

        // agrega el nuevo paquete directamente a la tabla
        //agregarPaqueteATabla(paqueteGuardado);
        //actualizarContadoresPaquetes();


        // Se trae lo que ya hay en el localStorage
        //const paquetes = JSON.parse(localStorage.getItem("paquetes")) || [];
        // creamos un Id para el nuevo paquete
        //const nuevoId = nuevopaquete.length + 1;
        // agregamos el nuevo paquete a la lista
        //nuevopaquete.push({ id: nuevoId, titulo, precio, lugar, dias, noches, noincluye, incluye, img: urlCloudinary , duracion: `${dias} días | ${noches} noches` });
        // actualizamos el localStorage con el nuevo paquete
        //localStorage.setItem("paquetes", JSON.stringify(paquetes));

        //agregarPaqueteATabla({ id: nuevoId, titulo, precio, lugar, dias, noches, img: urlCloudinary });
        //actualizarContadoresPaquetes();
        //cargarPaquetesEnTabla();

        // Limpiar campos
        iptName.value = "";
        iptPrecio.value = "";
        iptLugar.value = "";
        iptDias.value = "";
        iptNoches.value = "";
        iptNoIncluye.value = "";
        iptIncluye.value = "";
        iptImagen.value = "";
        preview.innerHTML = "";

        setTimeout(() => {
          limpiarAlerta();
          modal.hide();
          botonguardar.disabled = false; // Reactivar el botón de guardar
        }, 1000);


    } catch (error) {
      console.log("errror", error);
      limpiarAlerta();
      crearAlerta("danger", "Error al subir la imagen a Cloudinary.");
      return;
    }

    
    limpiarAlerta();
    crearAlerta("success", "¡Formulario enviado correctamente!");





    
  });

  document.getElementById("btnCerrar").addEventListener("click", () => {
    limpiarAlerta();
    iptName.value = "";
    iptPrecio.value = "";
    iptLugar.value = "";
    iptDias.value = "";
    iptNoches.value = "";
    iptNoIncluye.value = "";
    iptIncluye.value = "";
    iptImagen.value = "";
    preview.innerHTML = "";
  });

  // crea elemento "tr" agrega los td con la informacion y añáde como hijo a la tabla
  function agregarPaqueteATabla(nuevopaquete) {
      
    const fila = document.createElement("tr");
    fila.id = `fila-${nuevopaquete.id}`;
    fila.innerHTML = `
      <td>${nuevopaquete.id}</td>
      <td>${nuevopaquete.titulo}</td>
      <td>${nuevopaquete.precio}</td>
      <td>${nuevopaquete.lugares}</td>
      <td>${nuevopaquete.dias}</td>
      <td>${ nuevopaquete.noches}</td>
      <td><img src="${nuevopaquete.imagenUrl}" style="width:60px; border-radius:6px;"></td>
      <td>
        <button class="btn btn-danger rounded-pill px-lg-4"
            style=" background-color: #d94375 !important; border-color: #d94375;" onclick="eliminarPaquete(${nuevopaquete.id})">Eliminar</button>
      </td>
    `;
    tablaListaPaquetes.appendChild(fila);
  }

  window.eliminarPaquete = async function(id) {
    if (!confirm("¿Seguro que deseas eliminar este paquete?")) return;
  try {
    crearAlerta("info", "Eliminando paquete...");
    const token = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjcmlzdGluYS5sb3BlekBvdXRsb29rLmNvbSIsInJvbGUiOiJBZG1pbmlzdHJhZG9yIiwiaWF0IjoxNzU3NTQzMTE5LCJleHAiOjE3NTc2Mjk1MTl9.JLRgwhYA9HgxhN1j4HlCA9FZGhqIHlvQ8W1gIzoBzjg"; // <- ajusta aquí si tomas token de localStorage
    const url = `http://localhost:8080/api/Productos/${id}`; // prueba sin slash final

    const response = await fetch(url, {
      method: "DELETE",
      mode: "cors",
      headers: {
        "Authorization": token
        // No pongas "Content-Type" si no envías body (evita preflight innecesario salvo que uses Authorization)
      }
    });

    // debug: imprimir status y cabeceras
    console.log("DELETE", url, "status:", response.status, response.statusText);

    if (response.ok) {
      // Si el backend devuelve 204 No Content o 200 OK
      const fila = document.querySelector(`#fila-${id}`);
      if (fila) fila.remove();
      crearAlerta("success", "Paquete eliminado correctamente.");
      // opcional: recargar la tabla desde el servidor
      // cargarPaquetesEnTabla();
      return;
    }

    // si no ok, intentar leer texto/JSON devuelto por el servidor para mostrar mensaje claro
    let textoRespuesta = "";
    try {
      textoRespuesta = await response.text();
      console.error("Respuesta del servidor:", textoRespuesta);
    } catch (e) {
      console.error("No se pudo leer body de la respuesta");
    }

    // Mensajes específicos según status
    if (response.status === 404) {
      crearAlerta("danger", "Paquete no encontrado (404).");
    } else if (response.status === 401 || response.status === 403) {
      crearAlerta("danger", "No autorizado. Revisa el token o permisos (401/403).");
    } else if (response.status === 405) {
      crearAlerta("danger", "Método no permitido en el servidor (405).");
    } else {
      crearAlerta("danger", `Error al eliminar: ${response.status} ${response.statusText}. ${textoRespuesta}`);
    }

  } catch (error) {
    console.error("Error de red o CORS:", error);
    crearAlerta("danger", "Error de red o CORS. Revisa la consola y la pestaña Network.");
  }
  };

  // saca los paquetes del local storage mira el ".length" y lo asigna a las tarjetas
  function actualizarContadoresPaquetes(paquetes) {
    console.log("paquetes; ", paquetes)
    //const paquetes = JSON.parse(localStorage.getItem("paquetes")) || [];
    const total = paquetes.length??0;
    cardTotalPaquetes.textContent = total;
    cardPaquetesActivos.textContent = total;
  }
  // extrae los datos del local storage, vacia la tabla y luego los agrega
  function cargarPaquetesEnTabla() {
   fetch("http://localhost:8080/api/Productos/", {
  method: "GET",
  redirect: "follow"
})
  .then((response) => response.json())
  .then((result) => { result.forEach(p=>agregarPaqueteATabla(p))
  })
  .catch((error) => console.error(error));
    //tablaListaPaquetes.innerHTML = "";
    //paquetes.forEach(paquete => agregarPaqueteATabla(paquete));
  }

  // pasa el display a none y quita las clases si las tenia, y el contenido
  function limpiarAlerta() {
    iptAlerta.style.display = "none";
    iptAlerta.classList.remove("alert-danger", "alert-success", "alert-info");
    iptAlerta.innerHTML = "";
  }

  // Crea una alerta con lo que recibe ejemplo danger, success o info mas el mensaje
  function crearAlerta(tipo, mensaje){
    iptAlerta.style.display = "block";
    iptAlerta.classList.add(`alert-${tipo}`);
    iptAlerta.innerHTML = mensaje;
  }

  // Muestra una vista previa de la imagen seleccionada en el input
  function vistaPreviaImagen() {
    // Obtener el archivo seleccionado al cual se le agrego el evento "change"
    const file = this.files[0];
    if (file) {
      // si el tamaño del archivo es mayor a 2MB
      if (file.size > 2 * 1024 * 1024) {
        iptAlerta.style.display = "block";
        iptAlerta.classList.add("alert-danger");
        iptAlerta.innerHTML = "La imagen es demasiado grande. Máximo 2MB.";
        iptImagen.value = "";
        preview.innerHTML = "";
        return;
      }
      // Si no es mayor a 2MB se lee y se muestra la vista previa
      const reader = new FileReader();
      reader.onload = function (e) {
        preview.innerHTML = `<img src="${e.target.result}" alt="preview" style="max-width:100%; border-radius:8px; margin-top:10px;">`;
      };
      reader.readAsDataURL(file);
      limpiarAlerta();
    }
  }

  // Actualiza los contadores de paquetes al entrar a la web
  actualizarContadoresPaquetes([]);

  // Carga los paquetes en la tabla al ingresar al sitio
  cargarPaquetesEnTabla();
  
});
