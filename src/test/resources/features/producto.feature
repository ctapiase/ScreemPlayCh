Feature: registro en la pagina
  Yo como usuario
  Quiero registrarme en la pagina STORE
  Para comprar productos y servicios

  Scenario Outline: registro en la pagina
    Given el usuario ingresa a la pagina STORE
    When el usuario ingresa a la opcion de registrarse
    And ingresa el usuario usermotorola y la contrasena password
      | user   | pass   |
      | <user> | <pass> |
    Then el usuario vera en la parte superior <username>
    Examples:
      | user       | pass     | username   |
      | motorolaxl | password | motorolaxl |