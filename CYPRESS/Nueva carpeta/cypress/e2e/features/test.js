import { Given, When, Then } from "cypress-cucumber-preprocessor/steps";

Given("que estoy en la página de Google", () => {
  cy.visit("https://www.google.com");
});

When("escribo {string} en el campo de búsqueda", (palabra) => {
  cy.get("[name=q]").type(palabra);
});

When("presiono el botón de buscar", () => {
  cy.get("[name=btnK]").click();
});

Then("veo los resultados relacionados con {string}", (palabra) => {
  cy.get("#search").should("contain.text", palabra);
});
