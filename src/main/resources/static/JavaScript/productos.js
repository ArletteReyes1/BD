const requestOptions = {
  method: "GET",
  redirect: "follow"
};

fetch("http://localhost:8080/api/Productos/", requestOptions)
  .then((response) => response.json())
  .then((result) => { result.forEach(p=>addItem(p))
  })
  .catch((error) => console.error(error));
function addItem(item) {
  const itemHTML = 
  '<div class="col-lg-4 col-md-6 col-12 mb-4 col-sm">\n' +
              '<article class="card fondo-color-card h-100 shadow-sm">\n' +
              '<div class="card-body">\n' +
              '<h5 class="card-title">' + item.titulo + '</h5>\n' +       
              '<img\n' +
              'src="' + item.imagenUrl + '"\n' +
              'class="card-img-top fixed-img" alt="Imagen de destino">\n' +
              '<h5 class="card-title" style="font-size:1.4rem"><p>Desde $' + item.precio + ' USD por persona en habitación doble + IMP </p></h5> <!--aqui-->\n' +
  
    '<div class="row">\n' +
        '<div class="col-lg-6 col-sm">\n' +
          '<ul>\n' +
            '<li class="list-group-item"><i class="bi bi-airplane"></i> Vuelos</li>\n' +
            '<li class="list-group-item"><i class="bi bi-buildings"></i> Hospedaje</li>\n' +
            '<li class="list-group-item"><i class="bi bi-cup-hot"></i> Alimentos</li>\n' +
            '<li class="list-group-item"><i class="bi bi-chat-dots"></i> Guía de habla hispana</li>\n' +
            '<li class="list-group-item"><i class="bi bi-car-front"></i> Traslado</li>\n' +
            '<li class="list-group-item"><i class="bi bi-geo-alt"></i> Visitas Guiadas</li>\n' +
          '</ul>\n' +
        '</div>\n' +
        '<div class="col-lg-6 col-sm">\n' +
            '<ul class="list-unstyled mb-2 mb-md-0">\n' +
            '<i class="bi bi-sun-fill" id="dia"></i>' + item.dias + ' Días\n' +
            '<i class="bi bi-moon" id="noches"></i>' + item.noches + ' Noches\n' +
            '</ul>\n' +
        '</div>\n' +
      '</div>\n' +

   
            '<!-- boton -->\n' +
            '<div class="row">\n' +
            '<div class="card-body" style="display: flex; justify-content: flex-start; align-items: end;">\n' +
            `<button id="btnReservar" type="button" class="btn btn-light" data-bs-toggle="modal" data-bs-target="#modal${item.id}">\n` +
            'Reservar\n' +
            '</button>\n' +
            '</div>\n' +
            '</div>\n' +
    '</article>\n' +
  '</div>\n' +

    '<!-- modal -->\n' +
        `<div class="modal" id="modal${item.id}" tabindex="-1">\n` +
            '<div class="modal-dialog">\n' +
              '<div class="modal-content">\n' +
                  '<div class="modal-header">\n' +
                    '<h5 class="modal-title">' + item.titulo + '</h5>\n' +
                    '<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>\n' +
                  '</div>\n' +
                  '<div class="modal-body">\n' +
                    '<p>' + item.incluye + item.noincluye + '</p>\n' +
                    '<p><strong>Duración:</strong> ' + item.duracion + '</p>\n' +
                    '<p><strong>Lugares:</strong> ' + item.lugar + '</p>\n' +
                    '<p>Para más información, por favor contactanos.</p>\n' +
                    '<p>¡Gracias por tu interés en nuestros paquetes turísticos!</p>\n' +
                  '</div>\n' +
                  '<div class="modal-footer">\n' +
                    '<a href="./contactanos.html">\n' +
                    '<button type="button" id="btnContactanos" class="btn btn-primary">Contáctanos</button>\n' +
                    '</a>\n' +
                  '</div>\n' +
              '</div>\n' +
            '</div>\n' +
        '</div>\n' +
    '<br/>';

  const itemsContainer = document.getElementById("list-items");
  itemsContainer.innerHTML += itemHTML;
  //const itemsModal = document.getElementById("modal");
  //itemsModal.innerHTML += itemHTML;

}



function cargarPaquetes() {
  const paquetesGuardados = JSON.parse(localStorage.getItem("paquetes")) || [];
  // Mostrar los guardados primero
  paquetesGuardados.forEach(addItem);

  fetch("./JavaScript/paquetes.json")
    .then(response => response.json())
    .then(data => {
      // Filtrar los que ya existen por id
      const idsGuardados = new Set(paquetesGuardados.map(p => p.id));
      const nuevosPaquetes = data.filter(p => !idsGuardados.has(p.id));
      if (nuevosPaquetes.length > 0) {
        // Agregar los nuevos al DOM
        nuevosPaquetes.forEach(addItem);
        // Guardar en localStorage la suma de ambos
        const actualizados = paquetesGuardados.concat(nuevosPaquetes);
        localStorage.setItem("paquetes", JSON.stringify(actualizados));
        console.log("Nuevos paquetes agregados y guardados en localStorage.");
      } else {
        console.log("No hay paquetes nuevos para agregar.");
      }
    })
    .catch(error => console.error("Error al cargar los paquetes:", error));
}

//cargarPaquetes();
