import {Given, When, Then} from "cypress-cucumber-preprocessor/steps";

Given('visit  page' ,() => {
    cy.visit("https://practicetestautomation.com/practice-test-login/")
})

When('escribo el usuario {string}', user =>{
    cy.get("#username").type(user).should('have.value', user);
})

When('escribo la contraseña {string}', Password =>{
    cy.get("#password").type(Password).should('have.value', Password);
})

Then('hago click en el boton' , () =>{
    return cy.get("#submit").click();
})