package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class SauceDemoSteps {

    LoginPage login = new LoginPage();
    
    @Given("un usuario navega a www.saucedemo.com")
    public void UserNavigateSD(){
        login.navegaSauceDemo();
    }
    @When ("un usuario inicia sesion con las credenciales {word} y {word}")
    public void loginCredentials(String user, String pwd){
        login.insertCredentials(user,pwd);
        login.clickLoginButton();
    }


}
