package stepdefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DBUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class US_11_DB_StepDefinitions {
    List <String> createdList =new ArrayList<String>();


    @Given("user\\(doctor) connects to application's database")
    public void user_doctor_connects_to_application_s_database() {
        DBUtils.createConnection();

    }
    @Given("user gets the column {string} from table {string}")
    public void user_gets_the_column_from_table(String column, String table) throws SQLException {
       // String query = "SELECT "+column+ "FROM" + table;
        String query = "select id from appointment";
        DBUtils.executeQuery(query);
        DBUtils.getResultset().next();
        while (DBUtils.getResultset().next()){

            createdList.add(DBUtils.getResultset().getString(1));
            System.out.println(createdList);
        }
    }

    @Then("verify that with the database")
    public void verify_that_with_the_database() {

    }

}