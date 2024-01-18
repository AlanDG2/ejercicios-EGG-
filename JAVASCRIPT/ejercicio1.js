function sumNumbers(arr) {
    let sum = 0;

    for (let i = 0; i < arr.length; i++) {
        if (typeof arr[i] === 'number') {
            sum += arr[i];
        }
    }

    console.log(sum);
    return sum;
}

sumNumbers([10, "hello", 5, true, 8]); // Salida en consola: 23