package StepDefinitions;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.WelcomePage;
import Utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    WelcomePage welcomePage = new WelcomePage(driver);
}
