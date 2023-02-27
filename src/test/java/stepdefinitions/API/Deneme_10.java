package stepdefinitions.API;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import pojos.US_10_Pojo;

import static io.restassured.RestAssured.given;
import static utilities.AuthenticationMedunna.generateToken;

public class Deneme_10 {
    String url;
    Response response;

    US_10_Pojo us_10;
    @Given("user set the url {string}")
    public void user_set_the_url(String URL) {
        url = URL;
    }
    @And("Call the Pojo to create expected data")
    public void callThePojoToCreateExpectedData() {
        us_10 = new US_10_Pojo( "user_112233445_56677889991677377735384","Sabir","Adil","301-20-3030","sabiradil@gmail.com");


    }
    @Given("sends a get-request to get all registrant data")
    public void sends_a_get_request_to_get_all_registrant_data() {
         response = given().
                headers("Authorization","Bearer "+generateToken()).
                when().
                get(url);

        response.prettyPrint();

    }
    @Then("HTTP Status Code should be {int}")
    public void http_status_code_should_be(Integer int1) {

    }
    @Then("Verify response content type is {string}")
    public void verify_response_content_type_is(String string) {
    }
    @Then("Verify expected values and actual values should be same")
    public void verify_expected_values_and_actual_values_should_be_same() {
    }


}
