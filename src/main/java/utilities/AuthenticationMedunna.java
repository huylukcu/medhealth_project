package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class AuthenticationMedunna {


    public static String generateToken() {
        Map<String, Object> med = new HashMap<>();
        med.put("password", "AdminTeam04");
        med.put("rememberMe", true);
        med.put("username", "Team04+");

        Response response = given().
                contentType(ContentType.JSON).
                body(med).
                when().
                post("https://medunna.com/api/authenticate");

        return response.jsonPath().getString("id_token");

    }
}