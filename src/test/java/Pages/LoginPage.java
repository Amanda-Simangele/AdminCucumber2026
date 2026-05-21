package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy (xpath = "//span[contains(.,'Access Learning Materials')]")
    WebElement accessLearningMaterialsLabel;

    @FindBy(id="login-email")
    WebElement usernameField;

    @FindBy(id="login-password")
    WebElement passwordField;

    @FindBy(id="login-submit")
    WebElement loginButton;

    // Constructor initializes PageFactory and explicit wait
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public String getAccessLearningMaterialsLabelText(){
        wait.until(ExpectedConditions.visibilityOf(accessLearningMaterialsLabel));
        return accessLearningMaterialsLabel.getText();
    }

    public void enterUsername(String username){
        wait.until(ExpectedConditions.visibilityOf(usernameField));
         usernameField.sendKeys(username);
     }

    public void enterPassword(String password){
        wait.until(ExpectedConditions.visibilityOf(passwordField));
         passwordField.sendKeys(password);
     }

    public void clickLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }
}
