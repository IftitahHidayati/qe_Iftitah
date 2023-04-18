package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.payment.Payment;

public class PaymentSteps {
    @Steps
    Payment pay;

    @Given("I am on the payment pages")
    public void onThePaymentPages(){
        pay.onThePaymentPages();
    }
    @When("I select the payment method")
    public void selectThePaymentMethod(){ pay.selectThePaymentMethod(); }
    @And("I click the Pay Now button")
    public void clickPayNowButton() { pay.clickPayNowButton(); }
    @Then("I am on the payment confirmation page")
    public void onThePaymentConfirmationPage() { pay.onThePaymentConfirmationPage(); }
    @When("I click Payment Instructions with Scan")
    public void clickPaymentInstructions(){ pay.clickPaymentInstructions(); }
    @And("I open the Gojek application then head to the GoPay menu")
    public void openApplication() { pay.openApplication(); }
    @Then("I select the Pay feature")
    public void selectPayFeature() { pay.selectPayFeature(); }
    @When("I do a scan of the payment")
    public void doScan(){ pay.doScan(); }
    @And("I enter your 6-digit GoPay PIN")
    public void enterYourDigit() { pay.enterYourDigit(); }
    @Then("I am on the paid success page")
    public void onThePaidSuccessPage() { pay.onThePaidSuccessPage(); }

}
