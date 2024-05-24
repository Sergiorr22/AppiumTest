Feature: Sendbox

  @box
  Scenario: Envio de mensaje en box
    Given Sergio ingresa al box
    When envia el mensaje
    Then muestra la confirmacion del mensaje