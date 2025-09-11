export function validarNombre(Nombre) {
    if (typeof Nombre !== 'string') return false;

    // Quitar espacios al inicio y final
    const limpio = Nombre.trim();

    // Debe tener mínimo 3 caracteres
    if (limpio.length < 3) return false;

    // Letras (con acentos, ñ), espacios y algunos caracteres especiales
    const regex = /^[A-Za-zÁÉÍÓÚáéíóúÑñ\s]+$/;

    if (!regex.test(limpio)) return false;

    return true;
}
// El nombre debe tener al menos 3 caracteres, ser texto y no contener carácteres especiales

// export function validarNumTelefono(numTelefono) {
//     const regex = /^\d{10}$/;
//     if (!regex.test(numTelefono)) return false;

//     // Validar que no sean 10 dígitos iguales en el teléfono
//     const primerDigito = numTelefono[0];
//     const todosIguales = numTelefono.split('').every(d => d === primerDigito);
//     if (todosIguales) return false;

//     return true;
// } 

export function validarNumTelefono(numTelefono) {
    const regex = /^(?!(\d)\1{9}$)[1-9]\d{9}$/;
    if (!regex.test(numTelefono)) return false;

    // Validar que no sean 10 dígitos iguales en el teléfono
    const primerDigito = numTelefono[0];
    const todosIguales = numTelefono.split('').every(d => d === primerDigito);
    if (todosIguales) return false;

    return true;
}

//El telefono debe de ser un dato numérico, debe tener 10 digitos, y no puede empezar con cero

export function validarEmail(email) {
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email);
}
// El correo electrónico ingresado no es valido
export function validarContraseña(contraseña) {
    const regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&]{8,15}/;
    return regex.test(contraseña);
}
// La contraseña debe contener un caracter especial, una mayuscula, una minuscula, un numero y tener entre 
// 8 y 15 caracteres, $@$!%*?& y uno de estos caracteres especiales

export function validarConfirmarContraseña(confirmarContraseña, contraseña) {
    if (contraseña !== confirmarContraseña) {
        // alert("La contraseña no coincide");
        return false;
    }
    return true;
}
// La contraseña no coincide, favor de verificar


// regexp_password

