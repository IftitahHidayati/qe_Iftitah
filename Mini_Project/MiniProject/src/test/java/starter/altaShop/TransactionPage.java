package starter.altaShop;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TransactionPage extends PageObject {
    private By accountBtn(){
        return By.xpath("//i[@class='v-icon notranslate fas fa-user theme--dark']");
    }
    private By transactionBtn(){
        return By.id("//div[contains(text(), 'Transaksi')]/parent::div");
    }

    @Step
    public void userClickAccountButton() {
        $(accountBtn()).click();
    }
    @Step
    public void userCanClickTransaction() {
        $(transactionBtn()).click();
    }
}
