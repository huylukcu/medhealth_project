package stepdefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US_11_DoctorApptPage;
import pages.US_11_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertTrue;

public class US_11_StepDefinitions {
    US_11_LoginPage us_11_LoginPage = new US_11_LoginPage();
    US_11_DoctorApptPage us_11_doctorApptPage = new US_11_DoctorApptPage();

    @Given("User navigate to {string}")
    public void user_navigate_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("Click Sign in icon")
    public void click_sign_in_icon() {
        us_11_LoginPage.signIn.click();
    }
    @When("Choose Sign in from dropdown")
    public void choose_sign_in_from_dropdown() {
        us_11_LoginPage.signInOption.click();
    }
    @When("Enter the username")
    public void enter_the_username() {
        us_11_LoginPage.usernameInput.sendKeys("DoktorSedat");
    }
    @When("Enter the password")
    public void enter_the_password() {
        us_11_LoginPage.passwordInput.sendKeys("Maitland20");
    }
    @When("Click the sign in button")
    public void click_the_sign_in_button() {
        us_11_LoginPage.signInSubmitButton.click();
    }
    @When("Click on MY PAGE")
    public void click_on_my_page() {
        us_11_doctorApptPage.myPagesDropDown.click();
    }
    @When("Choose My Appointments from dropdown")
    public void choose_my_appointments_from_dropdown() {
        us_11_doctorApptPage.myAppointments.click();
    }
    @Then("Verify that their Appointments list on My Appointments page")
    public void verify_that_their_appointments_list_on_my_appointments_page() {
        assertTrue(us_11_doctorApptPage.myAppointment.isDisplayed());
    }
    @Then("Verify that their Appointments time slots on My Appointments page")
    public void verify_that_their_appointments_time_slots_on_my_appointments_page() {
        assertTrue(us_11_doctorApptPage.fromDate.isDisplayed());
        assertTrue(us_11_doctorApptPage.toDate.isDisplayed());
    }
    //@Then("Verify that patient id, start date, end date, status")
   // public void verify_that_patient_id_start_date_end_date_status() {

    }
