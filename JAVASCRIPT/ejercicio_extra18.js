/* Escriba una función para buscar matrices de JavaScript con búsquedas binarias. */


function busquedaBinaria(matriz, elemento) {
    let inicio = 0;
    let fin = matriz.length - 1;

    while (inicio <= fin) {
        let mitad = Math.floor((inicio + fin) / 2);

        if (matriz[mitad] === elemento) {
            return mitad; // Se encontró el elemento, devuelve su índice
        } else if (matriz[mitad] < elemento) {
            inicio = mitad + 1; // Busca en la mitad derecha de la matriz
        } else {
            fin = mitad - 1; // Busca en la mitad izquierda de la matriz
        }
    }

    return -1; // El elemento no se encontró en la matriz
}

// Ejemplo de uso:
const arrayOrdenado = [2, 4, 6, 8, 10, 12, 14, 16];
const elementoBuscado = 10;
const resultado = busquedaBinaria(arrayOrdenado, elementoBuscado);

if (resultado !== -1) {
    console.log(`El elemento ${elementoBuscado} se encuentra en el índice ${resultado}.`);
} else {
    console.log(`El elemento ${elementoBuscado} no se encuentra en la matriz.`);
}