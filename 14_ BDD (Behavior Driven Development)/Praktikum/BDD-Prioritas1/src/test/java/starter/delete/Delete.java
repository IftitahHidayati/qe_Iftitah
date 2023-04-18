package starter.delete;

import net.thucydides.core.annotations.Step;

public class Delete {
    @Step("I am on the my profile page")
    public void onTheMyProfilePage(){
        System.out.println("I am on the my profile page");
    }

    @Step("I click my all activities")
    public void clickMyAllActivities(){
        System.out.println("I click and enter by post");
    }

    @Step("I choose the post you want to delete")
    public void chooseThePost(){
        System.out.println("I choose the post you want to delete");
    }

    @Step("I click the three dots in the upper right corner of the activity area")
    public void clickThreeDots(){
        System.out.println("I click the three dots in the upper right corner of the activity area");
    }

    @Step("click delete")
    public void clickDelete(){
        System.out.println("click delete");
    }

    @Step("I am on the profile page with notification post deleted successfully")
    public void onTheProfilePageWithSuccessDelete(){
        System.out.println("I am on the profile page with notification post deleted successfully");
    }
}
