package starter.product;

import net.thucydides.core.annotations.Step;

public class Product {
    @Step("I am on the main page")
    public void onTheMainPage(){
        System.out.println("I am on the main page");
    }

    @Step("I click on the other buttons on the menu bar available to view and select the type of product")
    public void clickOtherButton(){
        System.out.println("I click on the other buttons on the menu bar available to view and select the type of product");
    }

    @Step("I select and click on one of the product categories, for example: Selecting the Telecommunications category")
    public void selectAndClickOnOneOfTheProduct(){
        System.out.println("I select and click on one of the product categories, for example: Selecting the Telecommunications category");
    }

    @Step("I selects and clicks the desired product, for example: selecting the pulse product")
    public void selectAndClickProduct(){
        System.out.println("I selects and clicks the desired product, for example: selecting the pulse product");
    }

    @Step("I enter a valid mobile number")
    public void enterValidMobileNumber(){
        System.out.println("I enter a valid mobile number");
    }

    @Step("I am on the payment page")
    public void onThePaymentPage(){
        System.out.println("I am on the payment page");
    }
}
