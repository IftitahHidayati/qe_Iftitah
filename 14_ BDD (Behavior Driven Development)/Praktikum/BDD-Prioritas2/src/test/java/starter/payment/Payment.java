package starter.payment;

import net.thucydides.core.annotations.Step;

public class Payment {
    @Step("I am on the payment pages")
    public void onThePaymentPages(){
        System.out.println("I am on the payment pages");
    }

    @Step("I select the payment method")
    public void selectThePaymentMethod(){
        System.out.println("I select the payment method");
    }

    @Step("I click the Pay Now button")
    public void clickPayNowButton(){
        System.out.println("I click the Pay Now button");
    }

    @Step("I am on the payment confirmation page")
    public void onThePaymentConfirmationPage(){
        System.out.println("I am on the payment confirmation page");
    }
    @Step("I click Payment Instructions with Scan")
    public void clickPaymentInstructions(){
        System.out.println("I click Payment Instructions with Scan");
    }

    @Step("I open the Gojek application then head to the GoPay menu")
    public void openApplication(){
        System.out.println("I open the Gojek application then head to the GoPay menu");
    }

    @Step("I select the Pay feature")
    public void selectPayFeature(){
        System.out.println("I select the Pay feature");
    }

    @Step("I do a scan of the payment")
    public void doScan(){
        System.out.println("I do a scan of the payment");
    }

    @Step("I enter your 6-digit GoPay PIN")
    public void enterYourDigit(){
        System.out.println("I enter your 6-digit GoPay PIN");
    }

    @Step("I am on the paid success page")
    public void onThePaidSuccessPage(){
        System.out.println("I am on the paid success page");
    }
}
