package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_11_DoctorApptPage {
    public US_11_DoctorApptPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "appointment-heading")
    public WebElement ApptList;

    @FindBy(id = "entity-menu")
    public WebElement myPagesDropDown;

    @FindBy(id = "fromDate")
    public WebElement fromDate;

    @FindBy(id = "toDate")
    public WebElement toDate;
    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement myPages;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement myAppointments;

    @FindBy(xpath = "//h2[@id=\"appointment-heading\"]")
    public WebElement myAppointment;

    //@FindBy(xpath = "//input[@id='fromDate']")
    //public WebElement fromDate;

    //@FindBy(xpath = "//input[@id='toDate']")
    //public WebElement toDate;

    @FindBy(xpath = "//select[@id=\"appointment-status\"]")
    public WebElement status;


}
