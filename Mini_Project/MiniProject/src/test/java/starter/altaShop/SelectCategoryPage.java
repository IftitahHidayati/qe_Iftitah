package starter.altaShop;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectCategoryPage extends PageObject {
    private By selectBtn(){
        return By.id("//i[@class='v-input__icon v-input__icon--append']");
    }
    private By select(){
        return By.xpath("//div[text()='gaming']");
    }

    @Step
    public void userClickSelectCategoryButton() {
        $(selectBtn()).click();
    }
    @Step
    public void userCanSeeSelectedCategory() {
        $(select()).click();
    }
}
