document.getElementById("loginForm").addEventListener("submit", function (event) {
  event.preventDefault(); // Evita que se recargue la página

  const email = document.getElementById("correoLogin").value;
  const password = document.getElementById("contrasenaLogin").value;
  const alertLogin = document.getElementById("alertLogin");

  // Recuperar usuarios guardados
  let usuarios = JSON.parse(localStorage.getItem("usuarios")) || [];

  // Buscar usuario que coincida
  const usuarioEncontrado = usuarios.find(
    u => u.email === email && u.contraseña === password
  );
if (usuarioEncontrado) {
    alertLogin.className = "alert alert-success";
    alertLogin.innerHTML = `✅ Bienvenido, ${usuarioEncontrado.nombre}.`;

    // Guardar el usuario autenticado como usuarioActivo
    localStorage.setItem("usuarioActivo", JSON.stringify(usuarioEncontrado));

    // Redirigir a index.html
    setTimeout(() => {
      window.location.href = "index.html";
    }, 2000);

  } else {
    alertLogin.className = "alert alert-danger";
    alertLogin.innerHTML = `❌ Correo o contraseña incorrectos.`;
  }
});



