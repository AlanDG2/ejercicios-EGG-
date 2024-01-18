describe('pruebas ', () => {
  it.skip(' iniciar sesión ', () => {
    // Visitar la página de inicio de sesión
    cy.visit('http://uitestingplayground.com/sampleapp');

    // Ingresa el correo electrónico
    cy.get('input[name="UserName"]').type('tuCorreo@example.com');

    // Ingresa la contraseña
    cy.get('input[name="Password"]').type('pwd');

    // Hacer clic en el botón de enviar
    cy.get('#login').click();

    // Agregar comprobaciones, assertions, para verificar que has iniciado sesión exitosamente
    // Por ejemplo, podrías verificar si la página redirige a un dashboard o si muestra algún mensaje de éxito.
  });

  it.skip('assertion', () => {

    cy.visit('https://qavalidation.com/');


   // cy.get('#g4072-email').type('tuCorreo@example.com');


  })
});