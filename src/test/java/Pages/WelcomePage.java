package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WelcomePage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//p[contains(.,\"Here's who's working today\")]")
    WebElement welcomeMessage;

    @FindBy(xpath = "button[@class=\"user-pill open\"]")
    WebElement nkosiButton;

    @FindBy(xpath = "//button[@class='user-pill open']//span[text()='Nkosi']")
    WebElement adminParnelButton;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public String getWelcomeMessage() {
        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
        return welcomeMessage.getText();
    }

    public void clickNkosiButton(){
        wait.until(ExpectedConditions.elementToBeClickable(nkosiButton)).click();
    }

}
