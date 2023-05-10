package starter.altaShop;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaymentPage extends PageObject {
    private By addProduct(){
        return By.xpath("//span[text()='+']");
    }
    private By payBtn(){
        return By.xpath("//span[text()=' Bayar ']");
    }
    private By transactionPage(){
        return By.xpath("//div[@class='container']");
    }

    @Step
    public void userCanAddNumberProduct() {
        $(addProduct()).click();
    }
    @Step
    public void userCanClickPayButton() {
        $(payBtn()).click();
    }
    @Step
    public void userGoesToTheSuccessfulTransactionPage() {
        $(transactionPage()).shouldBeVisible();
    }
}
