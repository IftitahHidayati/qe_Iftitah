package starter.login;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Payment extends PageObject {
    private By PaymentPage(){
        return By.className("App");
    }

    private By clickPayment(){
        return By.id("label Gopay");
    }
    private By clickPayNow(){
        return By.id("submit_payment");
    }
    private  By NextPagePayment(){
        return By.id("react");
    }
    @Step
    public void validateOnThePaymentPage(){
        $(PaymentPage()).isDisplayed();
    }

    @Step
    public void clickMethodPayment(){
        $(clickPayment()).click();
    }

    @Step
    public void clickPaymentButton(){
        $(clickPayNow()).click();
    }

    @Step
    public void onTheBarcodePayment(){
        $(NextPagePayment()).isDisplayed();
    }
}
