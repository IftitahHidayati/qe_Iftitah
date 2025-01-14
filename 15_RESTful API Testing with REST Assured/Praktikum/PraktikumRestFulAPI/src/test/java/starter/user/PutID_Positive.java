package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class PutID_Positive {
    protected String url = "https://jsonplaceholder.typicode.com/posts";

    @Step("I set PUT endpoints")
    public String setPutEndpoint(){
        return url + "/1";
    }

    @Step("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("user_id", 1);
        requestBody.put("id", 1);
        requestBody.put("title", "Iftitah Hidayati");
        requestBody.put("body", "Alterra QE A");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutEndpoint());
    }

    @Step("I receive valid data for existing user")
    public void ValidateDataForExistingUser(){
        restAssuredThat(response -> response.body("'user_id'", equalTo(1)));
        restAssuredThat(response -> response.body("'id'", equalTo(1)));
        restAssuredThat(response -> response.body("'title'", equalTo("Iftitah Hidayati")));
        restAssuredThat(response -> response.body("'body'", equalTo("Alterra QE A")));
    }
}
