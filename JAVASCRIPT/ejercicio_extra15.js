/* Escribe una función JavaScript para calcular el valor de bn donde n es el exponente y b es la base. Acepte b y n del usuario y muestre los resultados.*/ 

function calcularExponente(base, exponente) {
    return Math.pow(base, exponente);
  }
  
  // Ejemplo de uso:
  const base = parseFloat(prompt("Ingresa la base (b):"));
  const exponente = parseFloat(prompt("Ingresa el exponente (n):"));
  
  const resultado = calcularExponente(base, exponente);
  console.log(`El resultado de elevar ${base} a la potencia ${exponente} es: ${resultado}`);