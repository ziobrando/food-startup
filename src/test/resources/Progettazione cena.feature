Feature: progettazione cena

  Scenario: Cena monopiatto
    Given ricetta Cacio e Pepe è presente nel catalogo
    When clicco 'progetta cena' sulla ricetta Cacio e Pepe
    Then la cena chiamata Cacio e Pepe dovrebbe essere creata
    And la cena dovrebbe contenere il piatto Cacio e Pepe per 2 persone