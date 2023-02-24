package stepdefinitions.UI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TUS_10UIpage;

public class TUS_10_stepDef {
    TUS_10UIpage page = new TUS_10UIpage();
    @Given("user clicks the logIn dropdown")
    public void user_clicks_the_log_in_dropdown() {
        page.signIn.click();
    }
    @Then("user clicks on the sign In")
    public void user_clicks_on_the_sign_in() {
        page.Dropdown.click();
    }

    @Then("user provides the userName as {string}")
    public void user_provides_the_user_name_as(String string) {
        page.signIn.sendKeys("");
    }
    @Then("user provides the passWord as {string}")
    public void user_provides_the_pass_word_as(String string) {
    }
    @Then("user clicks on the signInButton")
    public void user_clicks_on_the_sign_in_button() {
    }
    @Then("user clicks MY PAGE dropdown")
    public void user_clicks_my_page_dropdown() {
    }
    @Then("user clicks Search Patient button")
    public void user_clicks_search_patient_button() {
    }
    @Then("user provides patient in ssn box {string}")
    public void user_provides_patient_in_ssn_box(String string) {
    }
    @Then("user edits {string}")
    public void user_edits(String string) {
    }
}
