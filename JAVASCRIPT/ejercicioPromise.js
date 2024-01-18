function fetchData(url) {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            const randomNumber = Math.random();
            if (randomNumber < 0.5) {
                const mockData = { message: 'Datos obtenidos exitosamente desde ' + url };
                resolve(mockData); // Resuelve la promesa con datos simulados
            } else {
                reject(new Error('Error al obtener datos desde ' + url)); // Rechaza la promesa con un error simulado
            }
        }, 2000); // Simula un retardo de 2 segundos
    });
}

// Llamada a fetchData con una URL
const apiUrl = 'https://swapi.dev/';
fetchData(apiUrl)
    .then((data) => {
        console.log('Datos obtenidos exitosamente:', data);
    })
    .catch((error) => {
        console.error('Error al obtener datos:', error.message);
    });