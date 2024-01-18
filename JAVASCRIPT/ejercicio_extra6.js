/* . Escriba una función de JavaScript que acepte una cadena como parámetro y encuentre la palabra más larga dentro de la cadena. */ 

const texto = " buscar la palabra mas larga watsdfsdsasasas ";

function buscarPalabra(frase) {

    let palabras = frase.split(' ');
    let mayor = 0;
    let pos

    for (let i = 0; i < palabras.length; i++) {
        if (palabras[i].length > mayor) {
            mayor = palabras[i].length
            pos = i;

        }

    }
    console.log("la palabra mas larga es " + palabras[pos])


}


buscarPalabra(texto);