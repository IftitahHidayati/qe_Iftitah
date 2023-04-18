package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.delete.Delete;

public class DeleteSteps {
    @Steps
    Delete del;

    @Given("I am on the my profile page")
    public void onTheMyProfilePage() { del.onTheMyProfilePage(); }
    @When("I click my all activities")
    public void clickMyAllActivities() { del.clickMyAllActivities(); }
    @And("I choose the post you want to delete")
    public void chooseThePost(){
        del.chooseThePost();
    }
    @When("I click the three dots in the upper right corner of the activity area")
    public void clickThreeDots(){
        del.clickThreeDots();
    }
    @And("click delete")
    public void clickDelete() { del.clickDelete(); }
    @Then("I am on the profile page with notification post deleted successfully")
    public void onTheProfilePageWithSuccessDelete() { del.onTheProfilePageWithSuccessDelete(); }

}
