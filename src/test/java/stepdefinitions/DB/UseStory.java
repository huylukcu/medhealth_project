package stepdefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

import static utilities.DBUtils.executeQuery;

public class UseStory {
    @Given("admin connects to the database hu")
    public void admin_connects_to_the_database_hu() {
        DBUtils.createConnection();

    }

    @Then("admin verifies {string}, {string},{string},{string},{string},{string},{string},{string}")
    public void admin_verifies(String ID, String SSN, String FirstName, String LastName, String BirthDate, String Phone, String Gender, String speciality) {

            String query="select*from physician";
            executeQuery(query);


            List<Object> allIdColumnData = DBUtils.getColumnData("select * from physicians","ID");
            System.out.println("ID: " +allIdColumnData);
            Assert.assertTrue(allIdColumnData.toString().contains("ID"));

            List<Object> allNameColumnData = DBUtils.getColumnData("select * from physicians","name");
            System.out.println("name : "+allNameColumnData);
            Assert.assertTrue(allNameColumnData.contains("medunna50"));

            List<Object> allEmailColumnData = DBUtils.getColumnData("select * from physicians","email");
            System.out.println("email : "+allEmailColumnData);
            Assert.assertTrue(allEmailColumnData.contains("medunna50@gmail.com"));

            List<Object> allSubjectColumnData = DBUtils.getColumnData("select * from physicians","subject");
            System.out.println("subject : "+allSubjectColumnData);
            Assert.assertTrue(allSubjectColumnData.contains("hayat"));

            List<Object> allMessageColumnData = DBUtils.getColumnData("select * from physicians","message");
            System.out.println("message : "+allMessageColumnData);
            Assert.assertTrue(allMessageColumnData.contains(""));
        }
    }
