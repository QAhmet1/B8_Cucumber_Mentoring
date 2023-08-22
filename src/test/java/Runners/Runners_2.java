package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/featureFiles/lidlregister.feature",  // location of your feature files
        glue = "stepDefinitions"     // location of your step definitions
)
public class Runners_2 extends AbstractTestNGCucumberTests {

}
