//What is the retry ability in Cypress
//-> The retry-ability allows the tests to complete each command as soon as the assertion passes, 
//without hard-coding waits. If your application takes a few milliseconds or even seconds to render each DOM element - no big deal, 
//the test does not have to change at all.

describe('Retry-Ability Session', function () {

    beforeEach(function () {
        cy.visit('http://192.168.0.15:8888'); // Command

        //Get -> Get one or more DOM elements by selector or alias.
        cy.get('.new-todo')                 // command - Get one or more DOM elements by selector or alias.
            .type('todo A{enter}')            // command
            .type('todo B{enter}')            // command
    });


    it.only('should create two items', () => {
        cy.get('.todo-list li')             // command
            .should('have.length', 2)         // assertion
    });


    //A single command followed by multiple assertions retries each one of them – in order. Thus when the first assertion passes, the command will be retried with 
    //first and second assertion. When the first and second assertion pass, then the command will be retried with the first, second, and third assertion, and so on.
    it('should match the content of the <li> elements', () => {
        cy.get('.todo-list li')     // command
            .should('have.length', 2) // assertion
            .and(($li) => {  //And is an alias of should 
                // 2 more assertions
                expect($li.get(0).textContent, 'first item').to.equal('todo A')
                expect($li.get(1).textContent, 'second item').to.equal('todo B')
            })
    });



    it('should be a demonstration of a built in assertion', () => {
        cy.get('.todo-list li')     // command
            .should('have.length', 2) // assertion
            .eq(1)                    // command -> Get A DOM element at a specific index in an array of elements.
    })





});