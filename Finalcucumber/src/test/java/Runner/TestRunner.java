package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".\\Features\\Addcity.feature",
        glue="Stepdefinition",
        dryRun=false,
        monochrome=true
		)

public class TestRunner {

}
