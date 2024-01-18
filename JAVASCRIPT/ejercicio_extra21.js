
/*  Escriba una función de JavaScript para obtener todas las combinaciones posibles de subconjuntos con una longitud fija (por ejemplo, 2) en una matriz.*/

function combinacionesSubconjuntos(matriz, longitudSubconjunto) {
    const resultados = [];

    function generarCombinaciones(subconjunto, indice) {
        if (subconjunto.length === longitudSubconjunto) {
            resultados.push(subconjunto);
        } else {
            for (let i = indice; i < matriz.length; i++) {
                generarCombinaciones([...subconjunto, matriz[i]], i + 1);
            }
        }
    }

    generarCombinaciones([], 0);
    return resultados;
}

// Ejemplo de uso:
const muestra = [1, 2, 3];
const longitud = 2;
const subconjuntos = combinacionesSubconjuntos(muestra, longitud);
console.log(subconjuntos); // Mostrará los subconjuntos de longitud 2 de la matriz [1, 2, 3]
