import * as login from "../pages/login"
//"../cypress/pages/login.js"

const credential = require('../fixtures/credentials.json')


  describe('login page', () => {

    credential.forEach(test => {
      beforeEach('visit login page ', () => { login.loginPage() })
      it(test.name, () => {
        login.typeUserName(test.username);
        login.typePassword(test.password);
        login.clickSubmitBtn();

        if (login.verifierText(test.verifer)) {
          cy.log(" incorrect user or password")
        } else {
          login.verifyTitle(test.verifer)
        }

      })

    })

  })

