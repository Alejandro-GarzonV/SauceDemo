package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.CartPage;
import pages.InventoryPage;

public class SauceDemoSteps {

    LoginPage login = new LoginPage();
    InventoryPage inventory = new InventoryPage();
    CartPage cart = new CartPage();
    
    @Given("un usuario navega a www.saucedemo.com")
    public void UserNavigateSD(){
        login.navegaSauceDemo();
    }
    @When ("el usuario inicia sesion con las credenciales {word} y {word}")
    public void loginCredentials(String user, String pwd){
        login.insertCredentials(user,pwd);
        login.clickLoginButton();
    }
    @And ("el usuario agrega Sauce Labs Backpack al carrito de compras y navega al cart")
    public void selectProduct(){
        inventory.addProductToCart();
    }
    @And("el usuario procede al checkout")
    public void proceedToCheckout() {
        cart.clickCheckoutButton();
    }

}
