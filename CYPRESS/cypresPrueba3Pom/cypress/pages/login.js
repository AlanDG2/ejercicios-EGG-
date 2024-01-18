
export const  loginPage = () =>{
    return  cy.visit("https://practicetestautomation.com/practice-test-login/")
}

export const typeUserName = (user) =>{
    return cy.get("#username").type(user).should('have.value', user);
}

export const typePassword = (Password) =>{
    return cy.get("#password").type(Password).should('have.value', Password);
}

export const clickSubmitBtn = () => {
    return cy.get("#submit").click();
}

export const verifierText = (text) =>{
    return cy.get("#error").should('have.text',text);

}

export const verifyTitle = (text) =>{
    return cy.title().should("contain.text",text);
}