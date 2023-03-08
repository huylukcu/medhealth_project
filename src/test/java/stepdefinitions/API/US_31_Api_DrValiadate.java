package stepdefinitions.API;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;

import static base_urls.MedunnaBaseUrl.medunnaSetUp;
import static base_urls.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static utilities.AuthenticationMedunna.generateToken;

public class US_31_Api_DrValiadate {
    Response response;
    @Given("User set the urlHU")
    public void user_set_the_url_hu() {
        medunnaSetUp();
        spec.pathParam("first","physicians");

    }
    @When("Send a get request to get PhysiciansHU")
    public void send_a_get_request_to_get_physicians_hu() {

        response = given().headers("Authorization","Bearer "+generateToken()).when().get();
        response.prettyPrint();

    }
    @Then("verify HTTP Status Code is {int} HU")
    public void verify_http_status_code_is_hu(Integer statusCode) {

        response.then().assertThat().statusCode(statusCode);
    }

    @Then("verify user get the Physicians data as expectedHU")
    public void verify_user_get_the_physicians_data_as_expected_hu() {
        JsonPath jsonPath = response.jsonPath();
        List<Object> id = jsonPath.getList("id");
        System.out.println(id);



    }

}