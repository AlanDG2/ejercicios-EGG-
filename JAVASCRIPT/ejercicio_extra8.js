/*  Escriba una función de JavaScript que acepte un número como parámetro y verifique si es primo o no.*/ 

let flag = true;

function primo(n) {
    for (let i = 2; i < n; i++) {
        if (n % i ===0) {
            flag = false; 
            console.log(n + " no es un numero primo")
            return flag
        }
    }
    console.log(n + " es un numero primo ");
}

primo(7);