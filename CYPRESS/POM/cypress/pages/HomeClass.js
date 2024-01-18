class Home {


    elements = {
        visit: () => cy.visit("/"),
        loginBtn: () => cy.get('#login-button'),
        searchInput: () => cy.get('input[name="search"]').first(),
        getSearchButton: () => cy.get("#search > div.search-button > button").first,
        getHomeButton: () => cy.get("#widget-navbar-217834 > ul > li:nth-child(1) > a > div > span"),
        getSpecialButton: () => cy.get("#widget-navbar-217834 > ul > li:nth-child(2) > a > div > span"),
        getBlogButton: () => cy.get("#widget-navbar-217834 > ul > li:nth-child(3) > a > div > span"),
        getMegaMenuButton: () => cy.get("#widget-navbar-217834 > ul > li.nav-item.dropdown.dropdown-hoverable.mega-menu.position-static > a > div > span"),
        getAddOnsButton: () => cy.get("#widget-navbar-217834 > ul > li:nth-child(5) > a > div > span"),
        getMyAccountLink: () => cy.get("#widget-navbar-217834 > ul > li:nth-child(6) > a > div > span")
    }

    clickLoginBtn(){
        this.elements.loginBtn().click
    }
    visitUrl() {
        this.elements.visit();
    }

    typeSearchInput(text){
        this.elements.searchInput().type(text);
    }
    clickSearchButton(){
        this.elements.getSearchButton().click();
    }

    clickHomeButton() {
        this.elements.getHomeButton().click();
        }
        clickSpecialButton() {
            this.elements.getSpecialButton().click();
        }

    
        clickBlogButton() {
            this.elements.getBlogButton().click();
        }

        clickMegaMenuButton() {
            this.elements.getMegaMenuButton().click();
        }
        clickAddOnsButton() {
            this.elements.getAddOnsButton().click();
        }

        clickMyAccountLink() {
            this.elements.getMyAccountLink().click();
            }
}


module.exports = new Home();


