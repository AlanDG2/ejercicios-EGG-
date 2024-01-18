/* Escriba una función de JavaScript que acepte una cadena como parámetro y cuente el número de vocales dentro de la cadena*/ 

const frase = 'Hola, cómo estás?';
const vocalesEncontradas = frase.match(/[aeiou]/gi);
console.log(vocalesEncontradas);


/*
const frase = 'Hola, cómo estás?';
const vocales = 'aeiouAEIOU';
const vocalesEncontradas = [];

for (let i = 0; i < frase.length; i++) {

  if (vocales.includes(frase[i])) { //if (vocales.index[i]!== 1 ) { 
    vocalesEncontradas.push(frase[i]);
}
}

console.log(vocalesEncontradas);
*/