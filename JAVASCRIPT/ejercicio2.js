function celsiusToFahrenheit(celsius) {
    return (celsius * 9 / 5) + 32;
}
var temperaturasCelsius = [0, 10, 20, 30, 40];

function fahrenheitTemperatures(temperaturasCelsius) {
    return temperaturasCelsius.map(celsiusToFahrenheit);

}
function imprimir() {
    console.log(temperaturasCelsius);
    console.log(fahrenheitTemperatures(temperaturasCelsius));
}


