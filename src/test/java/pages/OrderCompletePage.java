package pages;

public class OrderCompletePage extends BasePage {
    
    private String CheckCompleteLabel="//*[contains(text(),'Checkout: Complete!')]";
    private String TYFOrderLabel="//*[contains(text(),'Thank you for your order!')]";
    private String homePageURL = "https://www.saucedemo.com/inventory.html"; 

    public OrderCompletePage(){
        super(driver);
    }

    public void assertOrderCompletion() {
        validateElementText(CheckCompleteLabel, "Checkout: Complete!");
        validateElementText(TYFOrderLabel, "Thank you for your order!");
    }

    public void assertNotReturnHomePage() {
        assertCurrentURL(homePageURL);
    }
    
}
