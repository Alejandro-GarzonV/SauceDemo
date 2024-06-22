@Navigation
Feature: Realizar compra con usuario logeado

    Background: un usuario esta en la pagina principal para logearse y comprar
    Given un usuario navega a www.saucedemo.com

   @Plans
   Scenario Outline:Completar el proceso de compra desde el inicio de sesión hasta la confirmación de la orden
    When un usuario inicia sesión con las credenciales <username> y <password> 
    And el usuario añade "Sauce Labs Backpack" al carrito de compras y navega a el
    And el usuario procede al checkout
    And el usuario introduce los datos de envío y continua
    And el usuario finaliza la compra
    Then el usuario ve la página de confirmación de la orden
    But No debería retornar al home
    | username      | password     | nombre    | apellido |codpostal|
    | standard_user | secret_sauce | alejandro | garzon   | 110421  |