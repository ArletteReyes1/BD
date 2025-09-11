import { validarNombre, validarNumTelefono, validarEmail, validarContraseña, validarConfirmarContraseña } from "./valregistro.js";

const alertRegistro = document.getElementById("alertRegistro");
const Nombre = document.getElementById("Nombre");
const numTelefono = document.getElementById("numTelefono");
const email = document.getElementById("email");
const contraseña = document.getElementById("contraseña");
const confirmarContraseña = document.getElementById("confirmarContraseña");
const btnEnviar = document.getElementById("btnEnviar");



// orejita de boton
btnEnviar.addEventListener("click", function (event) {
        event.preventDefault();
        const nombre_completo = Nombre.value.trim();
        const numeroDeTelefono = numTelefono.value.trim();
        const correo = email.value.trim();
        const password = contraseña.value.trim();
        const confpassword = confirmarContraseña.value.trim();

        // Ocultar alerta al iniciar
        alertRegistro.style.display = "none";
        alertRegistro.classList.remove("alert-danger", "alert-success");
        alertRegistro.innerHTML = "";

        let mensajesError = [];

        //condiciones de validaciones
        if (!nombre_completo || !numeroDeTelefono || !correo || !password || !confpassword) {
                mensajesError.push("Todos los campos son obligatorios.");
        }

        if (!validarNombre(nombre_completo)) {
                mensajesError.push("El nombre debe tener al menos 3 caracteres, ser texto y no contener caracteres especiales.");
        }

        if (!validarNumTelefono(numeroDeTelefono)) {
                mensajesError.push("El teléfono debe de ser un dato numérico, debe tener 10 dígitos, y no puede contener espacios ni guiones ni iniciar con 0.");
        }

        if (!validarEmail(correo)) {
                mensajesError.push("El correo electrónico ingresado no es válido, name@example.com");
        }

        if (!validarContraseña(password)) {
                mensajesError.push("La contraseña debe cumplir con los requisitos especificados.");
        }

        if (!validarConfirmarContraseña(confpassword, password)) {
                mensajesError.push("La contraseña no coincide, favor de verificar.");
        }

        if (mensajesError.length > 0) {
                alertRegistro.style.display = "block";
                alertRegistro.classList.add("alert-danger");
                alertRegistro.innerHTML = mensajesError.join("<br>");
                return;
        }

        // ya existe el usuario con ese email
        let usuariosBusqueda = JSON.parse(localStorage.getItem("usuarios")) || [];
        const usuarioExistente = usuariosBusqueda.find(usuario => usuario.email === correo);
        if (usuarioExistente) {
                alertRegistro.style.display = "block";
                alertRegistro.classList.add("alert-danger");
                alertRegistro.innerHTML = "El correo electrónico ya está registrado. Por favor, utiliza otro.";
                return;
        }

        // Mostrar mensaje de éxito
        alertRegistro.style.display = "block";
        alertRegistro.classList.add("alert-success");
        alertRegistro.innerHTML = "¡Formulario enviado Correctamente!";

        // Limpiar campos
        Nombre.value = '';
        numTelefono.value = '';
        email.value = '';
        contraseña.value = '';
        confirmarContraseña.value = '';


        const usuario = {
                nombre: nombre_completo,
                telefono: numeroDeTelefono,
                email: correo,
                contraseña: password
        };

        // Recuperar array anterior o crear uno nuevo
        let usuarios = JSON.parse(localStorage.getItem("usuarios")) || [];

        // Agregar el nuevo usuario
        usuarios.push(usuario);

        // Guardar en localStorage
        localStorage.setItem("usuarios", JSON.stringify(usuarios));

        // Mostrar mensaje de éxito
        alertRegistro.style.display = "block";
        alertRegistro.classList.add("alert-success");
        alertRegistro.innerHTML = "¡Usuario registrado correctamente!";

        // Limpiar campos
        Nombre.value = '';
        numTelefono.value = '';
        email.value = '';
        contraseña.value = '';
        confirmarContraseña.value = '';
});

