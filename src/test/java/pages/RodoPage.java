package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RodoPage {

    WebDriver driver;

    public RodoPage(WebDriver driver) {
        this.driver = driver;
    }

    //wyskakujace okienko Rodo
    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div")
    private WebElement rodoWindowOnMainSite;

    //pola sluzace do zamkniecia okna Rodo
    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/button")
    private WebElement acceptTermsButton;

    @FindBy(className = "_12fp2")
    private WebElement XButtonOnRodoTerms;

    @FindBy(className = "_13q9y")
    private WebElement dismissTermsButton;

    //gettery do pol


    public WebElement getRodoWindowOnMainSite() {
        return rodoWindowOnMainSite;
    }

    public WebElement getAcceptTermsButton() {
        return acceptTermsButton;
    }

    public WebElement getXButtonOnRodoTerms() {
        return XButtonOnRodoTerms;
    }

    public WebElement getDismissTermsButton() {
        return dismissTermsButton;
    }

    //metody sluzace do okienka rodo
    public void setAcceptTermsButton() {
        acceptTermsButton.click();
    }

    public void setCancelRodoWithXButton() {
        XButtonOnRodoTerms.click();
    }

    public void setDismissTermsButton() {
        dismissTermsButton.click();
    }

}
