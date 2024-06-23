package pages;

public class LoginPage extends BasePage {

    private String usernameT = "//input[@id='user-name']";
    private String passwordT = "//input[@id='password']";
    private String loginButton = "//input[@id='login-button']";
    
    public LoginPage(){
        super(driver);
    }

    public void navegaSauceDemo () { 
        driver.manage().window().maximize();      
        driver.get("https://www.saucedemo.com/");
    }
    public void insertCredentials (String username, String password){
        write(usernameT,username);
        write(passwordT,password);
    }
    
    public void clickLoginButton(){
        clickElement(loginButton);
    }
    
}
