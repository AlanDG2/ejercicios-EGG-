describe('Login test', () => {
    // Cargar los datos de prueba antes de cada prueba
    beforeEach(() => {
        cy.fixture('fixtures-demo\\ejercicio3Credential').as('creds');
    })

    // Iterar sobre los datos de prueba usando .each()
    it('Test login functionality with different credentials', function () {
        cy.visit('http://uitestingplayground.com/sampleapp'); // Visitar el sitio web
        cy.get('@creds').each((cred) => { // Para cada conjunto de credenciales
            cy.get('[name="UserName"]').clear().type(cred.username); // Ingresar el nombre de usuario
            cy.get('[name="Password"]').clear().type(cred.password); // Ingresar la contraseña
            cy.get('#login').click(); // Hacer clic en el botón de iniciar sesión

            cy.get('#loginstatus').should('be.visible').then(($status) => {
                if ($status.text().includes('Welcome')) { // Si se muestra el mensaje de bienvenida
                    expect($status.text()).to.include('Welcome'); // Verificar que se muestra el mensaje de bienvenida
                } else if ($status.text().includes('Invalid username/password')) { // Si se muestra el mensaje de error de credenciales inválidas
                    expect($status.text()).to.include('Invalid username/password'); // Verificar que se muestra el mensaje de error
                } else { // Si se muestra el mensaje de usuario desconectado
                    expect($status.text()).to.include('User logged out.'); // Verificar que se muestra el mensaje de usuario desconectado
                }
            });
        });
    });
})