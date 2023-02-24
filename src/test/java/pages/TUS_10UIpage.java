package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TUS_10UIpage {

        public TUS_10UIpage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
        @FindBy(id = "account-menu")
        public WebElement signIn;
        @FindBy(id = "login-item")
        public WebElement signInOption;
        @FindBy(id = "username")
        public WebElement usernameInput;

        @FindBy(id = "password")
        public WebElement passwordInput;


        @FindBy(xpath = "//a[@class=\"d-flex align-items-center dropdown-toggle nav-link\"]")
        public WebElement Dropdown;

        @FindBy(xpath = "//[@class=\"dropdown-item\"]")
        public WebElement searchPatient;

        @FindBy(name = "ssn")
        public WebElement SSNBox;

        @FindBy(xpath = "d-none d-md-inline")
        public WebElement editPatient;

        @FindBy(id = "patient-firstName")
        public WebElement patientName;

        @FindBy(id = "patient-lastName")
        public WebElement patientLastName;

        @FindBy(id = "email")
        public WebElement patientEmail;

    }

