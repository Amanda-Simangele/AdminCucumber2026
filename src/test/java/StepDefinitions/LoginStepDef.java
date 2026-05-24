package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.*;

public class LoginStepDef extends Base{

    @Given("user navigates to the application")
    public void user_navigates_to_the_application() {
        homePage.getWelcomeMessage();

    }
    @When("user clicks login")
    public void user_clicks_login() {
        homePage.clickLoginButton();
    }
    @When("user logs in with {string} and {string}")
    public void user_logs_in_with_and(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
    }
    @Then("user should see welcome message containing {string}")
    public void user_should_see_welcome_message_containing(String string) {
        welcomePage.getWelcomeMessage();
        welcomePage.clickMenuButton();
    }
}

