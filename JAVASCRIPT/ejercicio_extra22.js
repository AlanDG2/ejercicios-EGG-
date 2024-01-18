/* . Escriba una función de JavaScript que acepte dos argumentos, una cadena y una letra, y la función contará el número de apariciones de la letra especificada dentro de la cadena.*/





function apariciones(str,letra) {
    let textoOrdenado = str.split('').sort();
    let aux = 0; 

    for (let i = 0; i < textoOrdenado.length; i++) {
        if (textoOrdenado[i] === letra) {
            aux++; 
        }
    
    }

    console.log("en " +str + " " +letra + "  se repite " +aux+ "    veces"  )
}


apariciones("w3resource.com","o");