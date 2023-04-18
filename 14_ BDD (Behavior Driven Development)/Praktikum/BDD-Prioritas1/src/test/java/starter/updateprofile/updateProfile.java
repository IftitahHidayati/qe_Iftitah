package starter.updateprofile;

import net.thucydides.core.annotations.Step;

public class updateProfile {
    @Step("I am on the profile page")
    public void onTheProfilePage(){
        System.out.println("I am on the profile page");
    }

    @Step("I click the edit button or pencil icon")
    public void clickEditButton(){
        System.out.println("I click the edit button or pencil icon");
    }

    @Step("I enter data changes in the fields")
    public void enterDataChanges(){
        System.out.println("I enter data changes in the fields");
    }

    @Step("I click save")
    public void clickSave(){
        System.out.println("I click save");
    }

    @Step("I am on the profile page with notification saved successfully")
    public void onTheProfileUpdatedPage(){
        System.out.println("I am on the profile page with notification saved successfully");
    }
}
