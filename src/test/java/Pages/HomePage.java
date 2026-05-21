package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class HomePage {

    WebDriver driver;

    @FindBy(xpath = "//h3[text()='Selenium, Cypress, Playwright']")
    WebElement WebAutomationTools;

    @FindBy(xpath = "//button[@class='user-pill']")
    WebElement loginButton;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public String getWelcomeMessage(){
        return WebAutomationTools.getText();
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}
