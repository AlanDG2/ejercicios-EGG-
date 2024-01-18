
/*Escriba una función de JavaScript que acepte una cadena como parámetro y convierta la primera letra de cada palabra a mayúscula
*/
const texto = 'hola alan andres';
const palabras = texto.split(' ');
for (let i = 0; i < palabras.length; i++) { //i =0 = hola
    let letras  = palabras[i].split('');
    letras[0]=letras[0].toUpperCase();
    palabras[i]=letras.join('');

}

let textomodificado= palabras.join(' ');
console.log(textomodificado); 


