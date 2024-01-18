import { Given, When, Then } from 'cypress-cucumber-preprocessor/steps'

Given('Estoy en la página principal de Bing', () => {
  cy.visit('https://www.bing.com')
})

When('Ingreso {string} en el campo de búsqueda', (keyword) => {
  cy.get('#sb_form_q').type(keyword)
})

When('Hago clic en el botón "Buscar"', () => {
  cy.get('#sb_form_go').click()
})

Then('Veo los resultados relacionados con {string}', (keyword) => {
  cy.get('#b_results').should('contain', keyword)
})