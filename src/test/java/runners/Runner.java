package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "hooks"},
        dryRun = true,
        tags = "@UI_10_staff_edits"
)
public class Runner {
}
