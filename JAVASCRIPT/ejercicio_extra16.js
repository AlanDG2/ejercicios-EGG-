

function caracteresUnicos(cadena) {
    const caracteresSet = new Set(cadena);
    return [...caracteresSet].join('');
}

// Ejemplo de uso:
const cadena = "thequickbrownfoxjumpsoverthelazydog";
const caracteresUnicosDeCadena = caracteresUnicos(cadena);
console.log('Caracteres únicos:', caracteresUnicosDeCadena); // Mostrará los caracteres únicos de la cadena


/* function caracteresUnicos(cadena) {
  let caracteresUnicos = '';

  for (let i = 0; i < cadena.length; i++) {
    if (caracteresUnicos.indexOf(cadena[i]) === -1) {
      caracteresUnicos += cadena[i];
    }
  }

  return caracteresUnicos;
}

// Ejemplo de uso:
const cadena = 'hola hola mundo';
const caracteresUnicosDeCadena = caracteresUnicos(cadena);
console.log('Caracteres únicos:', caracteresUnicosDeCadena);*/ 

