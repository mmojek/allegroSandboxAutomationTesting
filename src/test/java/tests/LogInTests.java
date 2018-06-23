package tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LoginPage;
import pages.NavbarPage;
import pages.RodoPage;

import javax.print.attribute.standard.MediaSize;

import static org.hamcrest.MatcherAssert.assertThat;

public class LogInTests {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private RodoPage rodoPage;
    private NavbarPage navbarPage;

    @BeforeClass

    public static void pathToDriver() {
        System.setProperty("webdriver.chrome.driver", "/home/michalmojek/IdeaProjects/allegroAutomationTesting/src/test/java/resources/chromedriver");

    }
        @Before
        public void setup () {
            this.driver = new ChromeDriver();
            driver.manage().window().maximize();
            this.loginPage = PageFactory.initElements(this.driver, LoginPage.class);
            this.homePage = PageFactory.initElements(this.driver, HomePage.class);
            this.rodoPage = PageFactory.initElements(this.driver, RodoPage.class);
            this.navbarPage = PageFactory.initElements(this.driver, NavbarPage.class);
        }

        @Test
        public void checkIfUserCanLogIn() {
            homePage.goToHomePage();
            rodoPage.setAcceptTermsButton();
            loginPage.pressMyAllegroButton();
            loginPage.pressLogInButton();

            Assert.assertTrue(loginPage.getUsernameField().isDisplayed());

        }

    }