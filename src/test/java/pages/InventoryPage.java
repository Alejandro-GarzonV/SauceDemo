package pages;


public class InventoryPage extends BasePage{

    
   private String addToCartButton = "//*[@id='add-to-cart-sauce-labs-backpack']"; 
   private String Cartlink = "//a[@class='shopping_cart_link']";
    public InventoryPage(){
        super(driver);
    }
    
    
    public void addProductToCart(){ 
        clickElement(addToCartButton);
        clickElement(Cartlink);
    }


}
