/*Escriba una función de JavaScript que genere todas las combinaciones de una cadena.
 */

function generarCombinaciones(cadena) {
    const resultados = [''];

    for (let i = 0; i < cadena.length; i++) {
        const longitudResultados = resultados.length;

        for (let j = 0; j < longitudResultados; j++) {
            resultados.push(resultados[j] + cadena[i]);
        }
    }

    // resultados.shift(); // Elimina el elemento vacío añadido inicialmente
    return resultados;
}

const cadenaEjemplo = 'abc';
const combinaciones = generarCombinaciones(cadenaEjemplo);
console.log(combinaciones);
