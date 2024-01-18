describe('waits', () => {


    beforeEach(() => {

        cy.visit('https://uitestingplayground.com/ajax');
    });

    it('Esperar un tiempo específico para el mensaje de éxito', () => {


        // Hacer clic en el botón para simular una solicitud AJAX
        cy.get('#ajaxButton').click();

        // Esperar un tiempo específico (por ejemplo, 5 segundos)
        cy.wait(16000);

        // Verificar que el mensaje de éxito se muestra
        cy.get('.bg-success').should('be.visible');

    });

    it('Esperar con expectativa BDD para el mensaje de éxito', () => {


        // Hacer clic en el botón para simular una solicitud AJAX
        cy.get('#ajaxButton').click();

        // Esperar usando una expectativa BDD
        cy.get('.bg-success', { timeout: 16000 }).should('be.visible');
        // Esperar hasta 10 segundos para que aparezca el mensaje de éxito y verificar su visibilidad
    });


    it('Esperar mensaje de éxito con cy.intercept()', () => {


        cy.intercept('GET', '/ajaxdata').as('ajaxRequest'); // Intercepta la solicitud AJAX

        cy.get('#ajaxButton').click(); // Simula la solicitud

        cy.wait('@ajaxRequest').its('response.statusCode').should('eq', 200); // Espera a que la solicitud se complete

        cy.get('.bg-success').should('be.visible'); // Verifica que el mensaje de éxito esté presente
    });




})