package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;
import pages.NavbarPage;
import pages.RodoPage;

import javax.print.attribute.standard.MediaSize;

import static org.junit.Assert.assertEquals;

public class SearchTests {
    private WebDriver driver;

    private HomePage homePage;
    private RodoPage rodoPage;
    private NavbarPage navbarPage;
    private LoginPage loginPage;

    @BeforeClass

    public static void pathToDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/michalmojek/IdeaProjects/allegroAutomationTesting/src/test/java/resources/chromedriver");

    }

    @Before
    public void setup() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        this.homePage = PageFactory.initElements(this.driver, HomePage.class);
        this.rodoPage = PageFactory.initElements(this.driver, RodoPage.class);
        this.navbarPage = PageFactory.initElements(this.driver, NavbarPage.class);
        this.loginPage = PageFactory.initElements(this.driver, LoginPage.class);

    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void inserDataInSearchBarAfterAgreeRodoTerms() {
        homePage.goToHomePage();
        rodoPage.setAcceptTermsButton();
        navbarPage.setSearchFor("Xiaomi mi 8");

    }

    @Test
    public void checkIfUserIsOnLogInPage() {
        homePage.goToHomePage();
        rodoPage.setAcceptTermsButton();
        loginPage.pressMyAllegroButton();
        loginPage.pressLogInButton();
        assertEquals()


    }


}



