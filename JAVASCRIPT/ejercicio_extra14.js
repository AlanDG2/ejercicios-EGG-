/*  Escribe una función de JavaScript para convertir una cantidad en monedas.*/

function cantidadToCoins(cantidad, monedas) {
    monedas.sort((a, b) => b - a); // Ordena las monedas de mayor a menor

    let resultado = [];
    for (let i = 0; i < monedas.length; i++) {
        while (cantidad >= monedas[i]) {
            resultado.push(monedas[i]);
            cantidad -= monedas[i];
        }
    }

    return resultado.join(', ');
}

// Ejemplo de uso:
const cantidad = 46;
const monedasDisponibles = [25, 10, 5, 2, 1];
const resultado = cantidadToCoins(cantidad, monedasDisponibles);
console.log(resultado); // Esto mostrará "25, 10, 10, 1"