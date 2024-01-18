/* Escriba una función de JavaScript que devuelva elementos de matriz mayores que un número.*/



function elements(arr, n) {


    arr.forEach(element => {
        if (element > n) {
            console.log(element)
        }
    });
}

const arrayOrdenado = [2, 4, 6, 8, 10, 12, 14, 16];
const elementoBuscado = 10;
const resultado = elements(arrayOrdenado, elementoBuscado);