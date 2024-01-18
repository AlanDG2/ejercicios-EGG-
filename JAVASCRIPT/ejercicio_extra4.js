/* Escriba una función de JavaScript que devuelva una cadena que tenga letras en orden alfabético.*/

const texto = 'hola';

const textoOrdenado = texto.split('').sort().join('');
console.log(textoOrdenado); // Mostrará 'ahlo'
