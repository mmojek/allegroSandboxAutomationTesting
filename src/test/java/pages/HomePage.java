package pages;

import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }
    public void goToHomePage() {
        driver.get("https://allegro.pl.allegrosandbox.pl/");
    }

}