describe('Commands Example', function(){

    beforeEach(function(){
        cy.visit('https://www.saucedemo.com/')

    })

    it('Success Login Test', function(){
        cy.typeLogin('standard_user','secret_sauce')
        cy.get('.title').should('contain.text', 'Products')
        cy.logout();
        cy.url().should('eq', 'https://www.saucedemo.com/')
    })

    it('Failed Login Test', function(){
        cy.typeLogin('standard_user', 'DummyPassword');
        cy.get('.error').should('contain.text','Epic sadface: Username and password do not match any user in this service');
    })

    

})