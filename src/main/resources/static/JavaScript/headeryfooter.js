const navbar = `<nav class="navbar navbar-expand-lg bg-primary px-4" id="navBar" data-bs-theme="dark">
   <div class="container d-flex align-items-center">
   
      <!-- Logo-->
       <a href="./index.html">
       <img src="https://res.cloudinary.com/dte9mtmma/image/upload/v1755824177/Logo_Nadia__solo_Isotipo_p55llq.png" alt="NAD Logo" width="70" height="70">
      </a>

      <!-- -->
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
        aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <!-- Navegacion -->
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav mx-auto gap-4">
          <li class="nav-item mx-5" id="acercaNosotras">
            <a class="nav-link text-white fw-medium" href="./Acercadenosotras.html">Acerca de Nosotras</a>
          </li>
          <li class="nav-item mx-5" id="listaProductos">
            <a class="nav-link text-white fw-medium" href="./listaProductos.html">Paquetes</a>
          </li>
          <li class="nav-item mx-5" id="contactanos">
            <a class="nav-link text-white fw-medium" href="./contactanos.html">Contáctanos</a>
          </li>
        </ul>
<div class="d-flex gap-2">

        <!-- iconos -->
        <div class="d-flex">
        <a href="./Registro.html ">
          <button class="btn btn-outline-light me-2" type="button">
         <svg  xmlns="http://www.w3.org/2000/svg"  width="24"  height="24"  viewBox="0 0 24 24"  fill="none"  stroke="currentColor"  stroke-width="2"  stroke-linecap="round"  stroke-linejoin="round"  class="icon icon-tabler icons-tabler-outline icon-tabler-user-plus"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0" /><path d="M16 19h6" /><path d="M19 16v6" /><path d="M6 21v-2a4 4 0 0 1 4 -4h4" /></svg>
          </button>
          </a>
          <a href="./formulario.html">
          <button class="btn btn-outline-light me-2" type="button">
            <svg  xmlns="http://www.w3.org/2000/svg"  width="24"  height="24"  viewBox="0 0 24 24"  fill="none"  stroke="currentColor"  stroke-width="2"  stroke-linecap="round"  stroke-linejoin="round"  class="icon icon-tabler icons-tabler-outline icon-tabler-settings"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M10.325 4.317c.426 -1.756 2.924 -1.756 3.35 0a1.724 1.724 0 0 0 2.573 1.066c1.543 -.94 3.31 .826 2.37 2.37a1.724 1.724 0 0 0 1.065 2.572c1.756 .426 1.756 2.924 0 3.35a1.724 1.724 0 0 0 -1.066 2.573c.94 1.543 -.826 3.31 -2.37 2.37a1.724 1.724 0 0 0 -2.572 1.065c-.426 1.756 -2.924 1.756 -3.35 0a1.724 1.724 0 0 0 -2.573 -1.066c-1.543 .94 -3.31 -.826 -2.37 -2.37a1.724 1.724 0 0 0 -1.065 -2.572c-1.756 -.426 -1.756 -2.924 0 -3.35a1.724 1.724 0 0 0 1.066 -2.573c-.94 -1.543 .826 -3.31 2.37 -2.37c1 .608 2.296 .07 2.572 -1.065z" /><path d="M9 12a3 3 0 1 0 6 0a3 3 0 0 0 -6 0" /></svg>
          </button>
          <a href="./login.html" id="btnRegistro">
          <button class="btn btn-outline-light me-2"type="button">
            <svg  xmlns="http://www.w3.org/2000/svg"  width="24"  height="24"  viewBox="0 0 24 24"  fill="none"  stroke="currentColor"  stroke-width="2"  stroke-linecap="round"  stroke-linejoin="round"  class="icon icon-tabler icons-tabler-outline icon-tabler-user"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M8 7a4 4 0 1 0 8 0a4 4 0 0 0 -8 0" /><path d="M6 21v-2a4 4 0 0 1 4 -4h4a4 4 0 0 1 4 4v2" /></svg>
          </button>
          </a>
          <button class="btn btn-outline-light me-2" type="button" id="cerrarSesion">
            <svg  xmlns="http://www.w3.org/2000/svg"  width="24"  height="24"  viewBox="0 0 24 24"  fill="none"  stroke="currentColor"  stroke-width="2"  stroke-linecap="round"  stroke-linejoin="round"  class="icon icon-tabler icons-tabler-outline icon-tabler-logout"><path stroke="none" d="M0 0h24v24H0z" fill="none"/><path d="M14 8v-2a2 2 0 0 0 -2 -2h-7a2 2 0 0 0 -2 2v12a2 2 0 0 0 2 -2v-2" /><path d="M9 12h12l-3 -3m0 6l3 -3" /></svg>
          </button>
          
        </div>
      </div>
    </div>
  </nav>
  <style>
/* Estilo para el link activo en la navbar */
#navBar .nav-link.active {
  border: none !important;              
  background-color:rgba(0, 0, 0, 0.15) !important; 
  border-radius: 999px !important;      
  padding: 6px 16px !important;          
}
#navBar {
  background: linear-gradient(90deg, #4caf61ff, #27538C);
  position: relative; 
  box-shadow: 0 12px 12px rgba(0, 0, 0, 0.3) !important; 
  padding: 0.5rem 1rem;
  z-index: 1050;    
}

/* Texto de los links de la navbar */
#navBar .nav-link {
  color: #FFFFFF !important;   /* blanco sólido */
}

/* Texto del brand (logo) */
#navBar .navbar-brand {
  color: #FFFFFF !important;   /* blanco sólido */
}

/* Botones de la navbar */
#navBar .btn-outline-light {
  color: #FFFFFF !important;
  border-color: #FFFFFF !important;
}

/* Hover de los links */
#navBar .nav-link:hover {
  color: #A9D943 !important;  /* verde suave como acento */
} 
   .nav-item {
  font-size: 25px;
  font-family: "Inter", sans-serif;
  font-optical-sizing: auto;
  gap: 4rem;
}
  #navBar .btn-outline-light:hover {
  background-color: rgba(255, 255, 255, 0.15) !important; 
  color: #FFFFFF !important; 
  border-color: #FFFFFF !important;
}

  </style>`;

const body = document.getElementsByTagName("body").item(0);
body.insertAdjacentHTML("afterbegin", navbar);
// --- Marcar link activo según la página ---
(function marcarActivo() {
  const here = new URL(location.href);
  const current = (here.pathname.split("/").pop() || "index.html").toLowerCase();

  document.querySelectorAll("#navBar .nav-link").forEach(a => {
    const href = (a.getAttribute("href") || "").toLowerCase();
    if (href.includes(current)) {
      a.classList.add("active");
      a.setAttribute("aria-current", "page");
    } else {
      a.classList.remove("active");
      a.removeAttribute("aria-current");
    }
  });
})();


// footer 
const footerElement = document.createElement("footer");
footerElement.className = "footer";
footerElement.style.background = "linear-gradient(to right, #27538C, #A9D943)";
footerElement.style.padding = "2rem 1rem";
footerElement.style.color = "white";
footerElement.style.display = "flex";
footerElement.style.flexDirection = "column";
footerElement.style.gap = "1rem";
footerElement.style.boxShadow = "0 -10px 20px rgba(0,0,0,0.3)";

// Contenido del footer
footerElement.innerHTML = `
  <div class="footer-container" style="display:flex; align-items:center; justify-content:space-between; gap:20px; flex-wrap:wrap; padding:0 1rem;">

    <!-- Avión 3D -->
    <div class="footer-avion">
      <img src="https://res.cloudinary.com/dbewlikyu/image/upload/v1757056885/vuelos_da4ttq.svg" alt="Avión" style="width:140px; height:auto;">
    </div>

    <!-- Redes sociales -->
    <div class="footer-socials" style="flex:1; text-align:center;">
      <p style="color:white; margin-bottom:10px;">Da click en los íconos para encontrarnos en:</p>
      <div class="social-icons" style="display:flex; gap:15px; justify-content:center; align-items:center; flex-wrap:wrap;">
        <a href="https://instagram.com/nadbestdreamsvacations" target="_blank">
          <img src="https://res.cloudinary.com/dbewlikyu/image/upload/v1757059220/Instagram_chnloq.svg" style="width:40px; height:40px;" alt="Instagram">
        </a>
        <a href="https://www.facebook.com/share/1LBy2YZcR4/" target="_blank">
          <img src="https://res.cloudinary.com/dbewlikyu/image/upload/v1757060843/facebook_zosnk0.svg" style="width:40px; height:40px;" alt="Facebook">
        </a>
        <a href="https://www.tiktok.com/@nadbestdreamsvacations" target="_blank">
          <img src="https://res.cloudinary.com/dbewlikyu/image/upload/v1757059224/tiktok_bb95c1.svg" style="width:40px; height:40px;" alt="TikTok">
        </a>
        <a href="https://wa.me/5277134742377" target="_blank">
          <img src="https://res.cloudinary.com/dbewlikyu/image/upload/v1757059230/whatsapp_cf1ajj.svg" style="width:40px; height:40px;" alt="WhatsApp">
        </a>
        <a href="https://mail.google.com/mail/?view=cm&fs=1&to=bestdreamsvacations@gmail.com" target="_blank">
          <img src="https://res.cloudinary.com/dbewlikyu/image/upload/v1757059218/correo_feyei7.svg" style="width:40px; height:40px;" alt="Correo">
        </a>
        <img id="pin-icon" src="https://res.cloudinary.com/dbewlikyu/image/upload/v1757059228/pin_d8eg0v.svg" style="width:40px; height:40px; cursor:pointer;" alt="Mapa">
      </div>
    </div>

    <!-- Logo NAD BLANCO -->
    <div class="footer-logo">
      <img src="https://res.cloudinary.com/dte9mtmma/image/upload/v1755824177/Logo_Nadia__solo_Isotipo_p55llq.png" alt="Logo NAD" style="width:100px; height:auto;">
    </div>

  </div>

  <!-- Contenedor mapa (oculto al inicio) -->
  <div class="mapa" id="mapa" style="display:none; text-align:center; margin-top:10px;">
    <iframe
      src="https://www.google.com/maps/embed?pb=!1m17!1m12!1m3!1d3747.6172923766026!2d-98.75963952476924!3d20.066466681352868!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m2!1m1!2zMjDCsDAzJzU5LjMiTiA5OMKwNDUnMjUuNCJX!5e0!3m2!1ses!2smx!4v1755744663016!5m2!1ses!2smx"
      width="300"
      height="100"
      style="border:0;"
      allowfullscreen=""
      loading="lazy"
      referrerpolicy="no-referrer-when-downgrade">
    </iframe>
  </div>

  <!-- Enlaces de políticas -->
  <div class="footer-links" style="display:flex; gap:15px; justify-content:center; align-items:center; margin-top:10px;">
    <a href="https://www.megatravel.com.mx/info/politica-de-privacidad" target="_blank" style="color:white !important; text-decoration:none; font-weight:bold;">Política de Privacidad</a>
    <a href="https://www.megatravel.com.mx/info/terminos-y-condiciones" target="_blank" style="color:white !important; text-decoration:none; font-weight:bold;">Términos y Condiciones</a>
  </div>

  <div class="footer-bottom" style="text-align:center; color:white; margin-top:2rem;">
    © 2025 NADBestDreamsVacations - derechos reservados
  </div>
`;

// Añadir estilo responsivo
const styleResponsive = document.createElement("style");
styleResponsive.innerHTML = `
  @media (max-width: 768px) {
    .footer-container {
      flex-direction: column;
      align-items: center;
      gap: 15px;
      padding:0.5rem;
    }
    .footer-avion img {
      width: 100px !important;
    }
    .footer-socials {
      width: 100%;
    }
    .footer-socials .social-icons {
      justify-content: center !important;
      flex-wrap: wrap !important;
    }
    .footer-logo img {
      width: 80px !important;
      margin-top: 10px;
    }
    .footer-links {
      flex-direction: column !important;
      gap: 5px !important;
    }
    .footer-links a {
      font-size: 14px !important;
    }
    .footer-bottom {
      font-size: 12px !important;
    }
  }

  @media (max-width: 480px) {
    .footer-avion img {
      width: 80px !important;
    }
    .footer-socials .social-icons img {
      width: 35px !important;
      height: 35px !important;
    }
    .footer-logo img {
      width: 70px !important;
    }
  }
`;
document.head.appendChild(styleResponsive);

// Añadir al body
document.body.appendChild(footerElement);

// Función para mostrar/ocultar mapa
function mostrarMapa() {
  const mapa = document.getElementById("mapa");
  mapa.style.display = mapa.style.display === "none" ? "block" : "none";
}

// Asignar evento al pin de ubicación
const pinIcon = document.getElementById("pin-icon");
if (pinIcon) {
  pinIcon.addEventListener("click", mostrarMapa);
}




// document.addEventListener("DOMContentLoaded", () => {
//   const mensajeUsuario = document.getElementById("mensajeUsuario");
//   let usuarioActivo = JSON.parse(localStorage.getItem("usuarioActivo"));

//   if (usuarioActivo) {
//     mensajeUsuario.innerHTML = `👤 Sesión iniciada como: <strong>${usuarioActivo.nombre}</strong>`;
//   } else {
//     mensajeUsuario.innerHTML = `⚠ No hay sesión activa.`;
//   }
// });

// OCULTA EL BOTON DE REGISTRO SI HAY SESION INICIADA
document.addEventListener("DOMContentLoaded", () => {
  const btnRegistro = document.getElementById("btnRegistro");
  let usuarioActivo = JSON.parse(localStorage.getItem("usuarioActivo"));

  if (usuarioActivo) {
    btnRegistro.style.display = "none"; // Oculta el botón si hay sesión activa
  } else {
    btnRegistro.style.display = "block"; // Muestra el botón si no hay sesión activa
  }
});

// FUNCIONALIDAD DEL BOTON CERRAR SESION CUANDO HAY SESION INICIADA
document.addEventListener("DOMContentLoaded", () => {
  const cerrarSesion = document.getElementById("cerrarSesion");
  let usuarioActivo = JSON.parse(localStorage.getItem("usuarioActivo"));
  if (usuarioActivo) {
    cerrarSesion.style.display = "block"; // Muestra el botón si hay sesión activa
    cerrarSesion.insertAdjacentHTML("afterbegin", `Cerrar sesión, ${usuarioActivo.nombre.split(" ")[0]}`); // Muestra el nombre del usuario
  } else {
    cerrarSesion.style.display = "none"; // Oculta el botón si no hay sesión activa
  }
  cerrarSesion.addEventListener("click", () => {
    const body = document.getElementsByTagName("body").item(0);
    body.insertAdjacentHTML("afterbegin", `<div class="alert alert-success alert-dismissible fade show" role="alert" style="text-align: center;">
    <strong>✔ Has cerrado sesión correctamente.</strong> Redirigiendo a la página de inicio...
    </div>`);
    cerrarSesion.style.display = "none"; // Oculta el botón al cerrar sesión
    localStorage.removeItem("usuarioActivo"); // Elimina la sesión activa
    setTimeout(() => {
      window.location.href = "index.html"; // Redirige a la página de inicio después de 2 segundos
    }, 1200);
  });
});


// -- funcion para el mapa --

const footer = document.getElementsByTagName("footer").item(0);
footer.insertAdjacentHTML("afterbegin", piePagina);

function mostrarMapa() {
  let mapa = document.getElementById("mapa");
  // Alterna entre mostrar y ocultar
  if (mapa.style.display === "none") {
    mapa.style.display = "block";
  } else {
    mapa.style.display = "none";
  }
}



