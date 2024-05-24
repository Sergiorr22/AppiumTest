Feature: Log in

  Scenario: Ingreso con credenciales correctas
    Given Sergio ingresa al login
    When ingresa las credenciales
    Then puede ver el mensaje de logueado