Feature: Buscar en Bing
  Como usuario de Bing
  Quiero buscar información en la web
  Para satisfacer mi curiosidad

  Scenario: Buscar una palabra clave
    Given Estoy en la página principal de Bing
    When Ingreso "cypress" en el campo de búsqueda
    And Hago clic en el botón "Buscar"
    Then Veo los resultados relacionados con "cypress"