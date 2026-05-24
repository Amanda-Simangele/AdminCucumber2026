package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//h3[text()='Selenium, Cypress, Playwright']")
    WebElement WebAutomationTools;

    @FindBy(xpath = "//button[@class='user-pill']")
    WebElement loginButton;


    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

    public String getWelcomeMessage(){
        wait.until(ExpectedConditions.visibilityOf(WebAutomationTools));
        return WebAutomationTools.getText();
    }

    public void clickLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

}
