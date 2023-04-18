package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.product.Product;

public class ProductSteps {
    @Steps
    Product product;

    @Given("I am on the main page")
    public void onTheMainPage(){
        product.onTheMainPage();
    }
    @When("I click on the other buttons on the menu bar available to view and select the type of product")
    public void clickOtherButton(){ product.clickOtherButton(); }
    @And("I select and click on one of the product categories, for example: Selecting the Telecommunications category")
    public void selectAndClickOnOneOfTheProduct() { product.selectAndClickOnOneOfTheProduct(); }
    @Then("I selects and clicks the desired product, for example: selecting the pulse product")
    public void selectAndClickProduct() { product.selectAndClickProduct(); }
    @When("I enter a valid mobile number")
    public void enterValidMobileNumber(){ product.enterValidMobileNumber(); }
    @Then("I am on the payment page")
    public void onThePaymentPage() { product.onThePaymentPage(); }

}
