package stepdefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.util.List;

public class US_31 {
    @Given("admin gets the columns from {string} table")
    public void admin_gets_the_columns_from_table(String tableName) {
        String query ="SELECT * FROM" + tableName;
        //List<Object> drList = DBUtils.getColumnData(query,columnName);

    }
    @Then("admin verifies {string}, {string},{string},{string},")
    public void admin_verifies(String string, String string2, String string3, String string4) {
    }
}
