/* Escribe una función de JavaScript para calcular los factores de un número entero positivo. */

function factores(numero) {
    const factoresEncontrados = [];
    for (let i = 1; i <= Math.floor(numero / 2); i++) {
        if (numero % i === 0) {
            factoresEncontrados.push(i);
        }
    }
    factoresEncontrados.push(numero);
    return factoresEncontrados;
}


const numero = 12;
console.log('Factores de', numero, 'son:', factores(numero));