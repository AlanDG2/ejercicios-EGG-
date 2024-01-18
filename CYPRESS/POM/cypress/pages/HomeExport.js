
/*() export const visit = () =>{
     cy.visit("/")
 }

 export const  typeSearchInput = (text) =>{
     cy.get('input[name="search"]').first().type(text)
 }

 export const clickSearchButton = () =>{
     cy.get("#search > div.search-button > button").first().click()
 }*/

export const visitUrl = () => {
    return cy.visit("/");
};

export const loginBtn = () => {
    return cy.get('#login-button');
};

export const typeSearchInput = (text) => {
    return cy.get('input[name="search"]').first().type(text);
};

export const clickSearchButton = () => {
    return cy.get('button[type="submit"][class="type-text"]').click();
};

export const getHomeButton = () => {
    return cy.get("#widget-navbar-217834 > ul > li:nth-child(1) > a > div > span");
};

export const getSpecialButton = () => {
    return cy.get("#widget-navbar-217834 > ul > li:nth-child(2) > a > div > span");
};

export const getBlogButton = () => {
    return cy.get("#widget-navbar-217834 > ul > li:nth-child(3) > a > div > span");
};

export const getMegaMenuButton = () => {
    return cy.get("#widget-navbar-217834 > ul > li.nav-item.dropdown.dropdown-hoverable.mega-menu.position-static > a > div > span");
};

export const getAddOnsButton = () => {
    return cy.get("#widget-navbar-217834 > ul > li:nth-child(5) > a > div > span");
};

export const getMyAccountLink = () => {
    return cy.get("#widget-navbar-217834 > ul > li:nth-child(6) > a > div > span");
};

// Agrega el resto de funciones para los elementos faltantes según tus necesidades

/*
    elements = {
        visit: () => cy.visit("/"),
        loginBtn: () => cy.get('#login-button'),
        searchInput: () => cy.get('input[name="search"]').first(),
        getSearchButton: () => cy.get("#search > div.search-button > button").first(),
        getHomeButton: () => cy.get("#widget-navbar-217834 > ul > li:nth-child(1) > a > div > span"),
        getSpecialButton: () => cy.get("#widget-navbar-217834 > ul > li:nth-child(2) > a > div > span"),
        getBlogButton: () => cy.get("#widget-navbar-217834 > ul > li:nth-child(3) > a > div > span"),
        getMegaMenuButton: () => cy.get("#widget-navbar-217834 > ul > li.nav-item.dropdown.dropdown-hoverable.mega-menu.position-static > a > div > span"),
        getAddOnsButton: () => cy.get("#widget-navbar-217834 > ul > li:nth-child(5) > a > div > span"),
        getMyAccountLink: () => cy.get("#widget-navbar-217834 > ul > li:nth-child(6) > a > div > span")
    }

    visit() {
        this.elements.visit();
    }

    typeSearchInput(text){
        this.elements.searchInput().type(text);
    }
    clickSearchButton(){
        this.elements.getSearchButton().click();
    }

*/