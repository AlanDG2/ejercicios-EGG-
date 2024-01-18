/* Escriba una función de JavaScript que tome una matriz de números y encuentre el segundo número más bajo y el segundo más grande, respectivamente.*/


function segundo(arr) {
    arr.sort((a, b) => a - b);
    console.log(arr);
    console.log(arr[1] );
    console.log(arr[arr.length-2]);
}

let numeros= [23,56,34,2,56,7,3,2,6,87,34]
segundo(numeros);