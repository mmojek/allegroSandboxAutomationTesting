package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavbarPage {

    WebDriver driver;

    public NavbarPage(WebDriver driver) {
        this.driver = driver;
    }

    //zadeklarowane pola
    @FindBy(xpath = "/html/body/div[3]/div[3]/nav/div[1]/div/div[1]/div/div/form/input[1]")
    private WebElement searchinput;

    public WebElement getSearchinput() {
        return searchinput;
    }

    //metody
    public void setSearchFor(String phrase) {
        searchinput.sendKeys(phrase);
        searchinput.submit();

    }

    //@FindBy()

}