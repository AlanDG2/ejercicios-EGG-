/* Escribe una función de JavaScript que verifique si un número es perfecto.*/ 


function perfect(n) {
    let aux =0;
    for (let i = 1; i < n; i++) {
        if (n % i == 0) {
            aux+=i
        }
        
    }
    if (aux == n ) {
        console.log(n + " es un  numero perfecto " );
    }else{
        console.log(n + " NO es un  numero perfecto " )
    }
}


perfect(6);