import { validarNombre, validarMensaje, validarTelefono, validarEmail } from "./validaciones.js";

// Variables referidas desde el HTML
const iptName = document.getElementById("iptName");
const iptEmail = document.getElementById("iptEmail");
const iptTelefono = document.getElementById("iptTelefono");
const iptMensaje = document.getElementById("iptMensaje");
const checkNewsletter = document.getElementById("checkNewsletter");
const alertResultado = document.getElementById("alertResultado");

// Botón y formulario
const btnEnviar = document.querySelector("#btnEnviar button");
const form = document.getElementById("form");
const btn = document.getElementById("button"); // EmailJS button 

// Orejita del botón
form.addEventListener("submit", function(event) {
  event.preventDefault();

  // Limpiar mensaje de alerta
  alertResultado.classList.remove("alert-success");
  alertResultado.classList.add("alert-danger");
  alertResultado.style.display = "none";

  let mensajesError = [];

  //Condiciones de validaciones 
  if (!validarNombre(iptName.value)) {
    mensajesError.push("El nombre debe tener al menos 3 caracteres y ser texto.");
  }

  if (!validarEmail(iptEmail.value)) {
    mensajesError.push("El correo electrónico ingresado no es válido.");
  }

  if (!validarTelefono(iptTelefono.value)) {
    mensajesError.push("El teléfono debe contener 10 dígitos numéricos, no puede ser el mismo número 10 veces y no puede empezar con cero.");
  }

  if (!validarMensaje(iptMensaje.value)) {
    mensajesError.push("El mensaje debe tener entre 1 y 150 caracteres.");
  }

  if (mensajesError.length > 0) {
    // Mostrar errores en los campos
    alertResultado.style.display = "block";
    alertResultado.innerHTML = mensajesError.join("<br>");
    return;
  }

  // Cambiar texto del botón durante envío
  btnEnviar.value = "Enviando...";

  // Envío con EmailJS
  const serviceID = "default_service";
  const templateID = "template_ujjgpyf";

  emailjs.sendForm(serviceID, templateID, form)
    .then(() => {
      btnEnviar.value = "Enviar";

      // Mostrar mensaje de éxito
      alertResultado.style.display = "block";
      alertResultado.classList.remove("alert-danger");
      alertResultado.classList.add("alert-success");
      alertResultado.innerHTML = "¡Formulario enviado correctamente!";

      // Limpiar campos
      iptName.value = '';
      iptEmail.value = '';
      iptTelefono.value = '';
      iptMensaje.value = '';
      checkNewsletter.checked = false;

      // Recargar la página después de 3 segundos
      setTimeout(() => location.reload(), 3000);
    }, (err) => {
      btn.value = "Enviar";
      alertResultado.style.display = "block";
      alertResultado.innerHTML = "Error al enviar el correo: " + JSON.stringify(err);
    });
});


 