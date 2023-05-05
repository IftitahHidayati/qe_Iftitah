package starter.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.OpenUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Product extends PageObject {
    private By iconProduct(){
        return By.id("product_type_0");
    }

    private By numberField(){
        return By.id("phone_number");
    }

    private By iconNominal() {
        return By.id("Telkomsel Rp5.000");
    }

    @Step
    public static OpenUrl url(String targetUrl){
        return new OpenUrl(targetUrl);
    }

    @Step
    public void clickIconProduct(){
        $(iconProduct()).click();
    }

    @Step
    public void inputNumber(String number){
        $(numberField()).type(number);
    }

    @Step
    public void clickNominal(){
        $(iconNominal()).click();
    }

}
