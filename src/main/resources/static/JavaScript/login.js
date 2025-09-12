document.getElementById("loginForm").addEventListener("submit", function (event) {
  event.preventDefault(); // Evita que se recargue la página

  const email = document.getElementById("correoLogin").value;
  const password = document.getElementById("contrasenaLogin").value;
  const alertLogin = document.getElementById("alertLogin");

  const login = {
    correo: email,
    contrasena: password
  };

  const requestOptions = {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      "Authorization": "Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhcmxldHRlMTIzNEBnbWFpbC5jb20iLCJyb2xlIjoiQWRtaW5pc3RyYWRvciIsImlhdCI6MTc1NzYzOTYyMywiZXhwIjoxNzU3NzI2MDIzfQ.SGJS6h3loreB2tbI"
    },
    body: JSON.stringify(login),
  };

  fetch("http://localhost:8080/api/login/", requestOptions)
    .then((response) => {
      if (!response.ok) {
        throw new Error("Error en el login");
      }
      return response.json();
    })
    .then((result) => {
      console.log("Respuesta del backend:", result);

      // Aquí depende de lo que devuelva tu backend
      // Ejemplo: { id: 1, nombre: "Arlette", correo: "arlette@gmail.com", rol: "Admin" }
      if (result && result.id) {
        alertLogin.className = "alert alert-success";
        alertLogin.innerHTML = `✅ Bienvenido, ${result.nombre}.`;

        // Guardar usuario logueado en sesión (opcional, si no quieres usar localStorage)
        // sessionStorage.setItem("usuarioActivo", JSON.stringify(result));

        // Redirigir a index.html
        setTimeout(() => {
          window.location.href = "index.html";
        }, 2000);
      } else {
        alertLogin.className = "alert alert-danger";
        alertLogin.innerHTML = `❌ Correo o contraseña incorrectos.`;
      }
    })
    .catch((error) => {
      console.error(error);
      alertLogin.className = "alert alert-danger";
      alertLogin.innerHTML = `❌ Error al conectar con el servidor.`;
    });
});



