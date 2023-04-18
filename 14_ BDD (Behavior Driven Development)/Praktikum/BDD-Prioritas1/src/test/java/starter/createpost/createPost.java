package starter.createpost;
import net.thucydides.core.annotations.Step;
public class createPost {
    @Step("I am on the main page")
    public void onTheMainPage(){
        System.out.println("I am on the main page");
    }

    @Step("I click and enter by post")
    public void clickAndEnterEmailAndPassword(){
        System.out.println("I click and enter by post");
    }

    @Step("I click post button")
    public void clickPostButton(){
        System.out.println("I click post button");
    }

    @Step("I am on the home page with new post success create")
    public void onTheHomPageWithNewPost(){
        System.out.println("I am on the home page with new post success create");
    }
}
