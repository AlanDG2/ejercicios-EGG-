/* Escriba una función de JavaScript para encontrar el primer carácter no repetido. */ 


function primerNoRepetido(cadena) {
    const contador = {};
  
    // Contar las ocurrencias de cada carácter
    for (let caracter of cadena) {
      contador[caracter] = (contador[caracter] || 0) + 1;
    }
  
    // Encontrar el primer carácter con una ocurrencia única
    for (let caracter of cadena) {
      if (contador[caracter] === 1) {
        return caracter; // Retorna el primer carácter no repetido
      }
    }
  
    return null; // Retorna null si no se encuentra ningún carácter no repetido
  }
  
  // Ejemplo de uso:
  const cadenaEjemplo = 'aabxbccddeeffg';
  const resultado = primerNoRepetido(cadenaEjemplo);
  
  if (resultado) {
    console.log('Primer carácter no repetido:', resultado);
  } else {
    console.log('No se encontró ningún carácter no repetido.');
  }