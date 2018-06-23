package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavbarPage {

    WebDriver driver;

    public NavbarPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(className = "metrum_search_query")
    private WebElement searchinput;

    public void setSearchFor(String phrase) {
        searchinput.sendKeys(phrase);
        searchinput.submit();

    }

    //@FindBy()

}