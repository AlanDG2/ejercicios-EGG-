const url = 'https://swapi.dev/api/';
const endPointC3PO = 'people/2/';
const film7 = 'films/7/';
let lastMovie;
let planetUrl;
let gravity;
let terrain;





describe('requesApi', () => {

    it('verify color and movies  response', () => {
        cy.request('GET', `${url}${endPointC3PO}`)
            .then((response) => {
                expect(response.status).to.eq(200); // Verificar respuesta exitosa
                expect(response.body.skin_color).to.eq('gold'); // Verificar color de piel
                expect(response.body.films).to.have.lengthOf(6);
                lastMovie = response.body.films[5];

            });

        cy.request('GET', `${url}${endPointC3PO}`)
            .its('status')
            .should('eq', 200);


        cy.request('GET', `${url}${endPointC3PO}`)
            .should('have.property', 'status', 200);
    });

    it('verify second movie ', () => {
        cy.request('GET', `${url}${endPointC3PO}`)
            .its('body.films')
            .should('have.length.gt', 2)
            .then((films) => {
                cy.log(films[1]); // Imprimir en la consola los datos de la propiedad 'films'
                cy.request('GET', films[1])
                    .its('body.characters')

            });

        cy.request('GET', `${url}${endPointC3PO}`)
            .then((response) => {
                expect(response.status).to.eq(200);

                cy.request('GET', response.body.films[1])
                    .then((response) => {
                        expect(response.body.characters).to.have.length.greaterThan(2);
                        expect(response.body.planets).to.have.length.greaterThan(2);
                        expect(response.body.starships).to.have.length.greaterThan(2);
                        expect(response.body.vehicles).to.have.length.greaterThan(2);
                        expect(response.body.species).to.have.length.greaterThan(2);
                        //  expect(response.body.release_date).to.match(/^\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$/);
                        expect(response.body.release_date).to.match(/\d{4}-\d{2}-\d{2}/);


                    });

            });

    })

    it('frist planet', () => {

        cy.request('GET', lastMovie)
            .then((response) => {
                expect(response.status).to.eq(200);

                cy.request('GET', response.body.planets[0])
                    .then((response) => {
                        planetUrl = response.body.url;
                        gravity = response.body.gravity;
                        terrain = response.body.terrain;
                        cy.log(` ${planetUrl}\n ${gravity}\n ${terrain}`);


                        cy.request('GET', planetUrl)
                            .then((response) => {
                                expect(response.body.gravity).to.eq(gravity);
                                expect(response.body.terrain).to.eq(terrain);
                            })
                    });

            });


    })

    it("err film ", () => {
        cy.request({
            method: 'GET',
            url: 'https://swapi.dev/api/films/7/',
            failOnStatusCode: false // Para permitir que la prueba continúe aunque obtenga un código de estado no exitoso
        }).then((response) => {
            expect(response.status).to.equal(404);
        })
    })





})