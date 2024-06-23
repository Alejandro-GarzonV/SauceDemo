package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.OverviewPage;
import pages.CartPage;
import pages.InformationCheckoutPage;
import pages.InventoryPage;

public class SauceDemoSteps {

    LoginPage login = new LoginPage();
    InventoryPage inventory = new InventoryPage();
    CartPage cart = new CartPage();
    InformationCheckoutPage inf = new InformationCheckoutPage();
    OverviewPage over = new OverviewPage();
    
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
    @And("el usuario introduce los datos {word},{word},{word} y continua")
    public void InserShippingInformation(String name,String lastName,String Cod) {
        inf.enterShippingInformation(name,lastName,Cod);
        inf.clickContinueButton();
    }
    @And("el usuario finaliza la compra")
    public void completePurchase() {
        over.clickfinishButton();
    }
    @Then("el usuario ve la página de confirmación de la orden")
    public void verifyOrderConfirmation() {
        //inventory.verifyOrderConfirmation();
    }
    @But("no debería retornar al home")
    public void verifyNotReturnToHome() {
        // Implementar lógica para verificar que no se retorne al home
    }
}
