package pages;

public class CartPage extends BasePage{

    private String checkoutButton = "//button[@id='checkout']"; 

    public CartPage(){
        super(driver);
    }
    public void clickCheckoutButton(){ 
        clickElement(checkoutButton);
    }
}
