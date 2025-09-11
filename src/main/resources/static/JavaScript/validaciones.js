//Funciones para las validaciones 

export function validarNombre(nombre) {
  if (typeof nombre !== 'string') return false;
  if (nombre.trim().length < 3) return false;
  return true;
}

export function validarEmail(email) {
  const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return regex.test(email);
}

export function validarTelefono(telefono) {
  const regex = /^(?!(\d)\1{9}$)[1-9]\d{9}$/;
  if (!regex.test(telefono)) return false;

  const primerDigito = telefono[0];
  const todosIguales = telefono.split('').every(d => d === primerDigito);
  if (todosIguales) return false;

  return true;
}

export function validarMensaje(mensaje) {
  return typeof mensaje === 'string' && mensaje.trim().length > 0 && mensaje.trim().length <= 150;
}


