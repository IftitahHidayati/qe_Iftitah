package starter.register;

import net.thucydides.core.annotations.Step;

public class Register {
    @Step("I am on the register page")
    public void onTheRegisterPage(){
        System.out.println("I am on the register page");
    }

    @Step("I enter by valid first name, last name, email and password")
    public void enterNameEmailAndPassword(){
        System.out.println("I enter by valid first name, last name, email and password");
    }

    @Step("I click join now button")
    public void clickJoinNowButton(){
        System.out.println("I click join now button");
    }

    @Step("I am on the home professional profile")
    public void onTheHomeProfessionalProfile(){
        System.out.println("I am on the home professional profile");
    }

    @Step("I enter by valid country, currently, job tittle, and company")
    public void enterCountryCurrentlyJobTittleAndCompany(){
        System.out.println("I enter by valid country, currently, job tittle, and company");
    }

    @Step("I click create my profile")
    public void clickCreateMyProfileButton(){
        System.out.println("I click create my profile");
    }

    @Step("I am confirm email address")
    public void confirmEmailAddress(){
        System.out.println("I am confirm email address");
    }

    @Step("I am on the login home page")
    public void onTheLoginHomePage(){
        System.out.println("I am on the login home page");
    }
}
