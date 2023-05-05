package starter.login;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Home extends PageObject {
    private By HomePage(){
        return By.className("headerNav");
    }
    @Step
    public void validateOnTheHomePage(){
        $(HomePage()).isDisplayed();
    }
//private By homePage(){return By.className("homepage");
//}
//
//    @Step
//    public void validateOnTheHomePage(){
//        $(homePage()).isDisplayed();
//
//    }
}
