package starter.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By MasukButton(){
        return By.id("button_signin_home");
    }
    private By EmailField(){
        return By.id("email");
    }
    private By passwordField(){
        return By.id("password");
    }
    private By ButtonLogin(){return By.id("submit_login");}
    private By errorMessage(){ return By.id("alert_description");}


    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl(targetUrl);
    }

    @Step
    public void validateOnTheLoginPage(){
        $(MasukButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String phone){
        $(EmailField()).type(phone);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickMasukLogin(){
        $(MasukButton()).click();
    }

    @Step
    public void clickButtonLogin(){
        $(ButtonLogin()).click();
    }
    @Step
    public boolean validateErrorMessageDisplayed(){
        return $(errorMessage()).isDisplayed();
    }
    @Step
    public boolean validateEqualErrorMessage(String message){
        return $(errorMessage()).getText().equalsIgnoreCase(message);
    }

//    private By emailPhoneNumberField (){
//        return By.id("email");
//    }
//    private By passwordField(){
//        return By.id("password");
//    }
//    private By signupButton(){
//        return By.className("signup-button");
//    }
//    private By errorMessage(){
//        return By.id("alert_description");
//    }
//
//    @Step
//    public static OpenUrl url(String targetUrl){
//        return new OpenUrl(targetUrl);
//    }
//    @Step
//    public void validateOnTheLoginPage(){ $(signupButton()).isDisplayed();
//    }
//    @Step
//    public void inputEmailPhoneNumber(String emailPhoneNumber){
//        $(emailPhoneNumberField()).type(emailPhoneNumber);
//    }
//    @Step
//    public void inputPassword(String password){$(passwordField()).type(password);}
//    @Step
//    public void clickSignUpButton(){$(signupButton()).click();}
//    @Step
//    public boolean validateErrorMessageDisplayed(){
//        return $(errorMessage()).isDisplayed();
//    }
//    @Step
//    public boolean validateEqualErrorMessage(String message){
//        return $(errorMessage()).getText().equalsIgnoreCase(message);
//    }
}
