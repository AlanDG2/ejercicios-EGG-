/* Write a JavaScript function which returns the n rows by n columns identity matrix.*/
function matrizIdentidad(n) {
    const matriz = [];
    for (let i = 0; i < n; i++) {
        matriz[i] = [];
        for (let j = 0; j < n; j++) {

            if (i == j) { matriz[i][j] = 1 }
            else { matriz[i][j] = 0 }
            
            
        }
        console.log(matriz[i]);
    }
    return matriz;
}

// Ejemplo: matriz identidad de 3x3
const matriz3x3 = matrizIdentidad(3);
