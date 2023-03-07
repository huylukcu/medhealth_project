package stepdefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_11_tryApi {
    @Given("user given api {string}")
    public void user_given_api(String url) {



    }
    @When("user sends a Get request to {string}")
    public void user_sends_a_get_request_to(String endpoint) {
    }
    @Then("user validates {string}, {string}, {string}, {string}")
    public void user_validates(String ID, String StartDate, String EndDate, String Status) {
    }


}
