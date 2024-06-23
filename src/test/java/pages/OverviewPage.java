package pages;

public class OverviewPage extends BasePage {

    private String finishButton="//button[@id='finish']";

    public OverviewPage(){
        super(driver);
    }

    public void clickfinishButton(){
        clickElement(finishButton);
    }
    
}
