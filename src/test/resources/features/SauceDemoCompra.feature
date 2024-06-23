@Navigation
Feature: Realizar compra con usuario logeado

    Background: un usuario esta en la pagina principal para logearse y comprar
    Given un usuario navega a www.saucedemo.com

   Scenario Outline:Completar el proceso de compra desde el inicio de sesion hasta la confirmacion de la orden
    When el usuario inicia sesion con las credenciales <username> y <password>
    And el usuario agrega Sauce Labs Backpack al carrito de compras y navega al cart
    And el usuario procede al checkout
    And el usuario introduce los datos <nombre>,<apellido>,<codpostal> y continua
    And el usuario finaliza la compra
    Then el usuario ve la pagina de confirmacion de la orden
    But no deberia retornar al home
    Examples:
      | username      | password     | nombre    | apellido | codpostal |
      | standard_user | secret_sauce | alejandro | garzon   | 110421    |
      