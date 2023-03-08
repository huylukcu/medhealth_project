package stepdefinitions.DB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static utilities.DBUtils.getColumnData;
import static utilities.DBUtils.getColumnNames;

public class US_31_StepDefs {
    /*
    @Given("admin connects to the database hu")
    public void admin_connects_to_the_database_hu() {
        DBUtils.createConnection();

    }
    @Given("admin gets the columns from {string} table")
    public void admin_gets_the_columns_from_table(String column) {
        String query = "SELECT * FROM Physician";
        DBUtils.executeQuery(query);
        DBUtils.getResultset().next();
        createdList.add(DBUtils.getResultset().getString(1));
        System.out.println(createdList);


        System.out.println(getColumnData(query,"ID"));
        List<Object> expectedData= new ArrayList<>();

    }
    @Then("admin verifies {string}, {string},{string},{string},{string},{string},{string},{string}")
    public void admin_verifies(String ID, String SSN, String FirstName, String LastName, String BirthDate, String Phone, String Gender, String speciality) {

        for(int i=0; i<dktr.ilkHasta.size(); i++){
            assertTrue(dktr.ilkHasta.get(i).isDisplayed());
            List<Object> allMessageColumnData = DBUtils.getColumnData("select * public.country","name");
            System.out.println("list");
            Assert.assertTrue(allMessageColumnData.toString().contains("Bremen"));

        }

    }

    }

/*
@Given("Admin database'den tum country bilgilerine ulasır ve kaydeder")
    public void admin_database_den_tum_country_bilgilerine_ulasır_ve_kaydeder() {
        System.out.println("===============ID LIST===============");
        countryList=DatabaseUtility.getColumnData(query,"id"); //sorgulatarak getirmek istediğimiz id leri bir liste attık
        for (int i = 0; i < countryList.size(); i++) { //for döngüsü ile listemizdeki elemanları tek tek alta alta yazdırdık
            System.out.println(countryList.get(i) +"\n");
        }

        WriteToTxt.saveCountryIds(fileName1,countryList); //txt dosyamızda da countryleri listelettirdik
    }


    @And("Admin DB'den gelen tum country bilgilerini dogrulamalidir")
    public void adminDBDenGelenTumCountryBilgileriniDogrulamalidir() {
        List<Object> expectedCountrytId= new ArrayList<>(); //beklenen datamızı list ile olusturduk
        expectedCountrytId.add(224247); //doğrulamak istediğimiz datamızı liste ekledik
       /* boolean flag=false;
        for (int i = 0; i < countryList.size() ; i++) {
          if (countryList.get(i).toString().equals(expectedCountrytId.get(0).toString())){
              flag=true;
          }
        }
        Assert.assertTrue(flag);
        */
}