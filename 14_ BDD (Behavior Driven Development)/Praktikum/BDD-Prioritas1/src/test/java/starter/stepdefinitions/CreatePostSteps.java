package starter.stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.createpost.createPost;

public class CreatePostSteps {
    @Steps
    createPost createPost;

    @Given("I am on the main page")
    public void onTheMainPage() { createPost.onTheMainPage(); }
    @When("I click and enter by post")
    public void clickAndEnterEmailAndPassword() { createPost.clickAndEnterEmailAndPassword(); }
    @And("I click post button")
    public void clickPostButton(){
        createPost.clickPostButton();
    }
    @Then("I am on the home page with new post success create")
    public void onTheHomPageWithNewPost(){
        createPost.onTheHomPageWithNewPost();
    }
}
