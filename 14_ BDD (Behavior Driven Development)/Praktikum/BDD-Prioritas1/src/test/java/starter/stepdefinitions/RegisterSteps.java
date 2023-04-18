package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.register.Register;

public class RegisterSteps {
    @Steps
    Register register;

    @Given("I am on the register page")
    public void onTheRegisterPage() { register.onTheRegisterPage(); }
    @When("I enter by valid first name, last name, email and password")
    public void enterNameEmailAndPassword() { register.enterNameEmailAndPassword(); }
    @And("I click join now button")
    public void clickJoinNowButton(){
        register.clickJoinNowButton();
    }
    @Then("I am on the home professional profile")
    public void onTheHomeProfessionalProfile(){
        register.onTheHomeProfessionalProfile();
    }
    @When("I enter by valid country, currently, job tittle, and company")
    public void enterCountryCurrentlyJobTittleAndCompany() { register.enterCountryCurrentlyJobTittleAndCompany(); }
    @And("I click create my profile")
    public void clickCreateMyProfileButton() { register.clickCreateMyProfileButton(); }
    @When("I am confirm email address")
    public void confirmEmailAddress() { register.confirmEmailAddress(); }
    @Then("I am on the login home page")
    public void onTheLoginHomePage(){
        register.onTheLoginHomePage();
    }
}
