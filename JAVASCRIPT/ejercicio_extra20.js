/*  Escriba una función de JavaScript que genere una ID de cadena (longitud especificada) de caracteres aleatorios.
Lista de caracteres de muestra : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

*/

function generarID(longitud) {
    const caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    let id = '';
 
    for (let i = 0; i < longitud; i++) {
        const indiceAleatorio = Math.floor(Math.random() * caracteres.length);
        id += caracteres.charAt(indiceAleatorio);
    }

    return id;
}

// Ejemplo de uso: Generar una ID de longitud 10
const idGenerada = generarID(10);
console.log(idGenerada); // Mostrará una cadena aleatoria de 10 caracteres