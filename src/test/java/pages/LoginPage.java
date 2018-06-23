package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //defined elements
    @FindBy(xpath = "/html/body/div[3]/div[3]/nav/div[1]/div/div[2]/div[3]/button/i")
    WebElement myAllegroButton;


    @FindBy(xpath = "/html/body/div[3]/div[3]/nav/div[1]/div/div[2]/div[3]/div/div[5]/a[1]")
    WebElement logInButton;

    //elements on log in page

    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passwordField;

    //gettery do pol

    public WebElement getMyAllegroButton() {
        return myAllegroButton;
    }

    public WebElement getLogInButton() {
        return logInButton;
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    //metody

    public void pressMyAllegroButton() {

        myAllegroButton.click();
    }

    public void pressLogInButton() {
        logInButton.click();
    }

    public void insertUsernameToLogIn(String username) {
        usernameField.sendKeys(username);
        usernameField.submit();

    }


}

