package pages;

public class InformationCheckoutPage extends BasePage{

    private String nameT="//input[@id='first-name']";
    private String lastnameT="//input[@id='last-name']";
    private String codpostalT="//input[@id='postal-code']";
    private String continueButton ="//input[@id='continue']"; 

    public InformationCheckoutPage(){
        super(driver);
    }

    public void enterShippingInformation (String name, String lastname,String codpostal){
        write(nameT,name);
        write(lastnameT,lastname);
        write(codpostalT,codpostal);
    }

    public void clickContinueButton(){
        clickElement(continueButton);
    }
}
