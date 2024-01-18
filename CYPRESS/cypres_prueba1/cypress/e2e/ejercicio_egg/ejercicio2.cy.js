describe('Pruebas', () => {
    
    before.skip(() => {
        Cypress.on('uncaught:exception', () => false);
    });


    it('should go to  url .', () => {
        cy.visit('https://qavalidation.com/demo-form/').then(() => {
            cy.url().should('eq', 'https://qavalidation.com/demo-form/');
        });

        cy.get('#g4072-fullname').type('alan gonzalez').should('have.value', 'alan gonzalez');
        cy.get('#g4072-email').type('tuCorreo@example.com').should('have.value', 'tuCorreo@example.com');
        cy.get('#g4072-phonenumber').type('234567').should('have.value', '234567');
        cy.get('#g4072-gender').select("Female", {force: true});
        cy.get('#contact-form-comment-g4072-otherdetails').type('blablablabla').should('have.value', 'blablablabla');
        cy.get('input[type="radio"][value="4"]').check().should('be.checked');
        cy.get('input[value="API testing"]').check().should('be.checked');
        cy.get('button.wp-block-button__link').contains('Submit!').click().then(() => {
            cy.get('#contact-form-success-header').should('contain.text', 'Your message has been sent');
        });
    });

    /*
    it.skip('should go to URL', () => {
        cy.visit('https://qavalidation.com/demo-form/');
        cy.url().should('eq', 'https://qavalidation.com/demo-form/');
    });

    it('should fill name field', () => {
        cy.get('#g4072-fullname')
            .type('alan gonzalez')
            .should('have.value', 'alan gonzalez');
            
    });

    it('should fill email field', () => {
        cy.get('#g4072-email')
            .type('tuCorreo@example.com')
            .should('have.value', 'tuCorreo@example.com');
    });

    it('should fill phone number field', () => {
        cy.get('#g4072-phonenumber')
            .type('234567')
            .should('have.value', '234567');
    });

    it('should select gender', () => {
        cy.get('#g4072-gender').select("Female", {force: true});
    });

    it('should fill comment field', () => {
        cy.get('#contact-form-comment-g4072-otherdetails')
            .type('blablablabla')
            .should('have.value', 'blablablabla');
    });

    it('should check radio button', () => {
        cy.get('input[type="radio"][value="4"]').check().should('be.checked');
    });

    it('should check checkbox', () => {
        cy.get('input[value="API testing"]').check().should('be.checked');
    });

    it('should submit the form and verify success message', () => {
        cy.get('button.wp-block-button__link').contains('Submit!').click();
        cy.get('#contact-form-success-header').should('contain.text', 'Your message has been sent');
    });

    */
});
