Feature: Buscar en Google
  Como usuario de Google
  Quiero buscar una palabra clave
  Para obtener resultados relevantes

  Scenario: Buscar "cypress"
    Given que estoy en la página de Google
    When escribo "cypress" en el campo de búsqueda
    And presiono el botón de buscar
    Then veo los resultados relacionados con "cypress"
