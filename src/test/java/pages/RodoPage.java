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
    public WebElement rodoWindowOnMainSite;

    //pola sluzace do zamkniecia okna Rodo
    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/button")
    public WebElement acceptTermsButton;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/div/button/svg[2]/image")
    public WebElement cancelRodoWithXButton;

    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/button")
    public WebElement dismissTermsButton;

    //metody sluzace do okienka rodo
    public void setAcceptTermsButton() {
        acceptTermsButton.click();
    }

}
