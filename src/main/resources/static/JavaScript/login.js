document.getElementById("loginForm").addEventListener("submit", function (event) {
  event.preventDefault();

  const email = document.getElementById("correoLogin").value;
  const password = document.getElementById("contrasenaLogin").value;
  const alertLogin = document.getElementById("alertLogin");

  const login = { correo: email, contrasena: password };

  const requestOptions = {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(login)
  };

  fetch("http://localhost:8080/api/login/", requestOptions)
    .then((response) => {
      if (!response.ok) {
        throw new Error("❌ Usuario o contraseña incorrectos");
      }
      return response.json();
    })
    .then((result) => {
      console.log("Respuesta del backend:", result);

      if (result && result.accessToken) {
        alertLogin.className = "alert alert-success";
        alertLogin.innerHTML = `✅ Bienvenido`;

        // Guardar token en sessionStorage o localStorage
        sessionStorage.setItem("token", result.accessToken);

        setTimeout(() => {
          window.location.href = "index.html";
        }, 2000);
      } else {
        alertLogin.className = "alert alert-danger";
        alertLogin.innerHTML = `❌ Credenciales inválidas.`;
      }
    })
    .catch((error) => {
      console.error(error);
      alertLogin.className = "alert alert-danger";
      alertLogin.innerHTML = error.message || `❌ Error al conectar con el servidor.`;
    });
});





