package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid username")
    public void inputValidUsername(){
        loginPage.inputUsername("standard_user");
    }
    @And("I input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("secret_sauce");
    }
    @And("I click login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        homePage.validateOnHomePage();
    }

    @When("I input locked username")
    public void inputLockedUsername(){
        loginPage.inputUsername("locked_out");
    }

    @Then("I can see error message {string}")
    public void iCanSeeErrorMessage(String message) {
        loginPage.validateErrormessageDisplayed();
        loginPage.validateEqualErrorMessage(message);
    }

    @When("I input valid {string} username")
    public void iInputValidUsername(String username) {
        loginPage.inputUsername(username);
    }
}
