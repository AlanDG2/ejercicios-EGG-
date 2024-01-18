/*Escriba una función de JavaScript que acepte un argumento y devuelva el tipo.
*/
function tipoDeDato(valor) {
    return typeof valor;
  }

  console.log(tipoDeDato(5)); // Devuelve 'number'
console.log(tipoDeDato('Hola')); // Devuelve 'string'
console.log(tipoDeDato(true)); // Devuelve 'boolean'
console.log(tipoDeDato({})); // Devuelve 'object'
console.log(tipoDeDato([])); // Devuelve 'object'
console.log(tipoDeDato(null)); // Devuelve 'object'
console.log(tipoDeDato(undefined)); // Devuelve 'undefined'