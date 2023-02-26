package stepdefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.US_10_page;
import utilities.ConfigReader;
import utilities.Driver;

public class US_10_stepDefinitions {
    US_10_page page = new US_10_page();

    @Given("user go to {string}")
    public void user_go_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }
    @When("user clicks the logIn dropdown")
        public void user_clicks_the_log_in_dropdown() throws InterruptedException {
        page.signIn.click();
    }
    @Then("user clicks on the sign In")
    public void user_clicks_on_the_sign_in() {
        page.signInOption.click();
    }
    @Then("user provides the userName as {string}")
    public void user_provides_the_user_name_as(String string) {
        page.usernameInput.sendKeys("PersonelSedat");
    }
    @Then("user provides the passWord as {string}")
    public void user_provides_the_pass_word_as(String string) {

        page.passwordInput.sendKeys("Serinhisar20");
    }
    @Then("user clicks on the signInButton")
    public void user_clicks_on_the_sign_in_button() {

        page.signInSubmitButton.click();
    }
    @Then("user clicks MY PAGE dropdown")
    public void user_clicks_my_page_dropdown() {

        page.myPagesDropDown.click();
    }
    @Then("user clicks Search Patient button")
    public void user_clicks_search_patient_button() {

        page.searchPatient.click();
    }
    @Then("user provides patient in ssn box {string}")
    public void user_provides_patient_in_ssn_box(String string) {
        page.SSNBox.sendKeys("300-20-3030" + Keys.ENTER);
    }
    @Then("user click edit button")
    public void user_click_edit_button() {
        page.editButton.click();
    }
    @Then("user edits {string}")
    public void user_edits(String string) {
        page.patientFirstName.click();


        page.patientFirstName.sendKeys("X"+ Keys.ENTER);

    }
}
