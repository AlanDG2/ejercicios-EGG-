/*  Escriba una función de JavaScript para obtener el número de apariciones de cada letra en una cadena específica. */



function apariciones(str) {
    let textoOrdenado = str.split('').sort();
    let aux = 1; // Iniciar el contador en 1 ya que al menos se encuentra una aparición de la letra

    for (let i = 0; i < textoOrdenado.length; i++) {
        // Verificar si la letra actual es igual a la siguiente letra
        if(textoOrdenado[i] !=" "){
    
        if (textoOrdenado[i] === textoOrdenado[i + 1]) {
            aux++; // Incrementar el contador si la letra actual es igual a la siguiente
        } else {
            console.log(`${textoOrdenado[i]}: ${aux}`); // Mostrar la letra y su cantidad de apariciones
            aux = 1; // Reiniciar el contador para la siguiente letra
        }
    }
    }

}

// Ejemplo de uso:
apariciones('Hola esto es un ejemplo');


apariciones('Hola esto es un ejemplo de conteo de letras');
/*
function contarLetras(cadena) {
  const contador = {};

  // Recorre cada carácter de la cadena
  for (let i = 0; i < cadena.length; i++) {
    const letra = cadena[i].toLowerCase(); // Convierte la letra a minúsculas para contar sin distinguir entre mayúsculas y minúsculas

    // Si la letra es una letra del alfabeto
    if (/^[a-zA-Z]$/.test(letra)) {
      if (contador[letra]) {
        contador[letra]++;
      } else {
        contador[letra] = 1;
      }
    }
  }

  return contador;
}

// Ejemplo de uso:
const texto = 'Hola, esto es un ejemplo de conteo de letras.';
const resultado = contarLetras(texto);

console.log(resultado); // Mostrará un objeto con el conteo de apariciones de cada letra

*/ 