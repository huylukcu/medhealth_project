package pojos;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class US_10 {
    private String login;
    private String firstname;

    private String lastname;
    private String ssn;
    private String email;

    public US_10(String login, String firstname, String lastname, String ssn, String email) {
        this.login = login;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
        this.email = email;
    }

    public US_10() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "US_10{" +
                "login='" + login + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    /*  {
        "id": 8503,
            "login": "user_112233445_56677889991677377735384",
            "firstName": "Sabir",
            "lastName": "Adil",
            "ssn": "301-20-3030",
            "email": "sabiradil@gmail.com",

    }
*/
}
