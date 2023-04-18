package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.updateprofile.updateProfile;

public class UpdateProfileSteps {
    @Steps
    updateProfile update;

    @Given("I am on the profile page")
    public void onTheProfilePage() { update.onTheProfilePage(); }
    @When("I click the edit button or pencil icon")
    public void clickEditButton(){
        update.clickEditButton();
    }
    @And("I enter data changes in the fields")
    public void enterDataChanges(){
        update.enterDataChanges();
    }
    @When("I click save")
    public void clickSave(){
        update.clickSave();
    }
    @Then("I am on the profile page with notification saved successfully")
    public void onTheProfileUpdatedPage() { update.onTheProfileUpdatedPage(); }
}
