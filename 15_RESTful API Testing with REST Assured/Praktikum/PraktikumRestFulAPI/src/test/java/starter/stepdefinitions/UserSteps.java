package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.*;

public class UserSteps {
    @Steps
    GetID_Positive getid;

    @Given("I set Get api endpoints")
    public void setGetApiEndpoints() {
        getid.setApiEndpoint();
    }

    @When("I send GET HTTP request")
    public void sendGetHttpRequest() {
        getid.sendGetHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receivedValidHttpResponse() {
        getid.validateHttpResponseCode200();
    }

    @And("I receive valid data for detail user")
    public void receiveValidDataForDetailUser() {
        getid.validateDataDetailUser();
    }

    @Steps
    PutID_Positive putid;

    @Given("I set PUT endpoints")
    public void setPutEndpoint() {
        putid.setPutEndpoint();
    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest() {
        putid.sendPutHttpRequest();
    }

    @And("I receive valid data for existing user")
    public void validateDataForExistingUser() {
        putid.ValidateDataForExistingUser();
    }

    @Steps
    Post_Positive post;

    @Given("I set POST endpoints")
    public void setPostApiEndpoint(){
        post.setPostApiEndpoint();
    }
    @When("I send POST HTTP request")
    public void sendPostHTTPRequest(){
        post.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();
    }

    @And("I receive valid data for new user")
    public void validateDataNewUser(){
        post.validateDatanewUser();
    }

    @Steps
    DeleteID_Positive delete;

    @Given("I set DELETE endpoints")
    public void setDeleteEndpoint(){
        delete.setDeleteEndpoint();
    }
    @When("I send DELETE HTTP request")
    public void sendDeleteHttpRequest(){
        delete.sendDeleteHttpRequest();
    }

    @Then("I receive valid HTTP response code 204")
    public void validHttpResponseCode200(){
        delete.validHttpResponseCode200();

    }

}
