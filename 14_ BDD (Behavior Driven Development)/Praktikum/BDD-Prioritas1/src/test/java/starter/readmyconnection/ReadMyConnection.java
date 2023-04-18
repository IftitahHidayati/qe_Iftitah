package starter.readmyconnection;

import net.thucydides.core.annotations.Step;

public class ReadMyConnection {
    @Step("I am on the home")
    public void onTheHome(){
        System.out.println("I am on the home");
    }

    @Step("I click my network feature")
    public void clickMyNetworkFeature(){
        System.out.println("I click my network feature");
    }

    @Step("I click the connection menu")
    public void clickConnectionMenu(){
        System.out.println("I click the connection menu");
    }

    @Step("I am on the connection page")
    public void onTheConnectionPage(){
        System.out.println("I am on the connection page");
    }
}
