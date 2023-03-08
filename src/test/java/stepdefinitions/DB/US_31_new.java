package stepdefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.DBUtils;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class US_31_new {
    List<Object>columnList;
    @Given("admin connects to the database")
    public void admin_connects_to_the_database() {
        DBUtils.createConnection();

    }
    @When("get all {string} as a list from {string}")
    public void get_all_as_a_list_from(String columnName, String tableName) {

        String query = "SELECT * FROM "+ tableName;
        //DBUtils.executeQuery(query);
        columnList = DBUtils.getColumnData(query,columnName);
        System.out.println("columnList");
    }

    @Then("verify list contains {string}")
    public void verify_list_contains(String FirstName) {
        assertTrue(columnList.contains(FirstName));


    }

}
