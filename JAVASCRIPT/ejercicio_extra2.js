/* * Escribir una función de JavaScript que verifique si una cadena pasada es un palíndromo o */ 

function palindromo(palabra){
    
    let reverse = palabra.split('').reverse().join('');
    if (reverse == palabra) {
        console.log(palabra + "  es palindromo ");
    } else {
        console.log(palabra + "  no es palindromo ")
    }

}

palindromo("madam");