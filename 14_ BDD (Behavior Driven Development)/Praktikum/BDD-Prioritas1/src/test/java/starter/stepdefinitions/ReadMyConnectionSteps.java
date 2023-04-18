package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.readmyconnection.ReadMyConnection;

public class ReadMyConnectionSteps {
    @Steps
    ReadMyConnection rmc;

    @Given("I am on the home")
    public void onTheHome(){
        rmc.onTheHome();
    }
    @When("I click my network feature")
    public void clickMyNetworkFeature(){
        rmc.clickMyNetworkFeature();
    }
    @And("I click the connection menu")
    public void clickConnectionMenu(){
        rmc.clickConnectionMenu();
    }
    @Then("I am on the connection page")
    public void onTheConnectionPage(){
        rmc.onTheConnectionPage();
    }
}
