
Cypress.on('uncaught:exception', (err, runnable) => {
    // retornar false aquí evita que Cypress
    // falle la prueba
    return false;
});