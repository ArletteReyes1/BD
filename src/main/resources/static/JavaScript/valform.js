export function validarNombre(nombre) {
    if (typeof nombre !== 'string') return false;
    // Quitar espacios al inicio y final
    const limpio = nombre.trim();
    // Debe tener mínimo 3 caracteres
    if (limpio.length < 3) return false;
    // Letras (con acentos, ñ), espacios y algunos caracteres especiales (coma incluida)
    const regex = /^[A-Za-zÁÉÍÓÚáéíóúÑñ\s\-\.'´,]+$/;
    if (!regex.test(limpio)) return false;

    return true;
}
//El nombre debe tener al menos 3 caracteres y ser texto. CUMPLE

export function validarPrecio(precio) {
    if (isNaN(precio) || precio === '') { // Changed 'input' to 'precio'
        // alert('Por favor ingrese sólo números.');
        return false;
    }
    return true;
}

export function validarLugar(lugar) {
   if (typeof lugar !== 'string') return false;
    const limpio = lugar.trim();
    if (limpio.length < 3) return false;
    const regex = /^[A-Za-zÁÉÍÓÚáéíóúÑñ\s\-\.'´,]+$/;
    if (!regex.test(limpio)) return false;
    return true;
}
// El lugar debe tener al menos 3 caracteres y ser texto

export function validarDias(dias) {
    if (isNaN(dias) || dias.trim() === "") {
        // alert("Por favor ingrese sólo número.");
        return false;
    }
    return true;

}

export function validarNoches(noches) {
    if (isNaN(noches) || noches.trim() === "") {
        // alert("Por favor ingrese sólo número.");
        return false;
    }
    return true;
}
