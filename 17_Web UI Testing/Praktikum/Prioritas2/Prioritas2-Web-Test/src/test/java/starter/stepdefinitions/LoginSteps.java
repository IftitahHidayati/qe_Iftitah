package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Home;
import starter.login.Login;
import starter.login.Payment;
import starter.login.Product;

public class LoginSteps {
    @Steps
    Login login;

    @Steps
    Home home;

    @Steps
    Product product;

    @Steps
    Payment payment;
    @Given("I am on the login page")
    public void onTheLoginPage(){
        login.openUrl("https://www.sepulsa.com/");
        login.validateOnTheLoginPage();
    }
    @When("I clicked the enter button")
    public void doClickMasukButton(){login.clickMasukLogin();}
    @And("I enter valid Email")
    public void doEnterValidEmail(){login.inputEmail("2041720006@student.polinema.ac.id");}
    @And("I enter valid Password")
    public void doEnterValidPassword(){
        login.inputPassword("Kotakoritita18*");
    }
    @And("I clicked the enter login")
    public void doClickLoginButton(){login.clickButtonLogin();}
    @Then("i am on the home page")
    public void onTheHomePage(){
        home.validateOnTheHomePage();
    }

    @When("I click icon product pulsa")
    public void iconProduct(){
        product.clickIconProduct();
    }
    @And("I enter number phone")
    public void doEnterNumber(){
        product.inputNumber("085233754882");
    }
    @And("I click the nominal")
    public void clickNominal(){
        product.clickNominal();
    }
    @When("I am on the payment page")
    public void validateOnThePaymentPage(){
        payment.validateOnThePaymentPage();
    }

    @When("I am choose and click payment method")
    public void clickMethodPayment(){
        payment.clickMethodPayment();
    }
    @And("I click payment button")
    public void clickPaymentButton(){
        payment.clickPaymentButton();
    }
    @Then("I am on the scan barcode payment page")
    public void onTheBarcodePayment(){
        payment.onTheBarcodePayment();
    }
    @And("I enter invalid Email")
    public void doEnterInValidEmail(){login.inputEmail("tita@gmail.com");}
    @And("I enter invalid Password")
    public void doEnterInValidPassword(){ login.inputPassword("Kotakoritita18*");
    }
    @Then("I can see error message {string}")
    public void doSeeErrorMessage(String message){
        login.validateErrorMessageDisplayed();
        login.validateEqualErrorMessage(message);
    }

//@Steps
//Login login;
//
//    @Steps
//    Home home;
//
//    @Given("I am on the login page")
//    public void onTheLoginPage(){
//        login.openUrl("https://www.sepulsa.com/signin");
//        login.validateOnTheLoginPage();
//    }
//
//    @When("I enter correct email")
//    public void doEnterCorrectEmail(){
//        login.inputEmailPhoneNumber("rozananggitan@gmail.com");
//    }
//
//    @And("I enter correct phone number")
//    public void doEnterCorrectPhoneNumber(){ login.inputEmailPhoneNumber("081293949602");}
//
//    @And("I enter correct password")
//    public void doEnterCorrectPassword(){
//        login.inputPassword("Rupiantoro27");
//    }
//
//    @And("I enter incorrect email")
//    public void doEnterIncorrectEmail(){ login.inputEmailPhoneNumber("rozananggitan");}
//
//    @And("I enter incorrect phone number")
//    public void doEnterIncorrectPhoneNumber(){ login.inputEmailPhoneNumber("081293949611 ");}
//
//    @And("I enter incorrect password")
//    public void doEnterIncorrectPassword(){ login.inputPassword("Rupiantoro88");}
//
//    @And("I click login button")
//    public void doClickLoginButton(){ login.clickSignUpButton();}
//
//    @Then("I am on the home page")
//    public void onTheHomePage(){
//        home.validateOnTheHomePage();
//    }
//
//    @Then("I can see error message {string}")
//    public void doSeeErrorMessage(String message){
//        login.validateErrorMessageDisplayed();
//        login.validateEqualErrorMessage(message);
//    }
}
