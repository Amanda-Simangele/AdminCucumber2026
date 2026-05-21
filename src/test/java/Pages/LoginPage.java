package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy (xpath = "//span[contains(.,'Access Learning Materials')]")
    WebElement accessLearningMaterialsLabel;

    @FindBy(id="login-email")
    WebElement usernameField;

    @FindBy(id="login-password")
    WebElement passwordField;

    @FindBy(id="login-submit")
    WebElement loginButton;

    public String getAccessLearningMaterialsLabelText(){
        return accessLearningMaterialsLabel.getText();
    }

    public void enterUsername(String username){
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
}
