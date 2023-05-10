package starter.altaShop;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductDetailPage extends PageObject {
    private By detail(){
        return By.xpath("//span[text()='Detail']");
    }
    private By detailPage(){
        return By.xpath("//button[@class='v-icon notranslate v-icon--link  fas fa-star theme--light primary--text']");
    }
    @Step
    public void userClickTheDetailButtonOnTheSelectedProduct() {
        $(detail()).click();
    }
    @Step
    public void userOnDetailPage() {
        $(detailPage()).shouldBeVisible();
    }
}
