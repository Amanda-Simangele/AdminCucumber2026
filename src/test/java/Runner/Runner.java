package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinitions"},
        //tags = "@createGroup",
        plugin = {"html:target/cucumber-report.html"},
        publish = true
)
public class Runner extends AbstractTestNGCucumberTests {

}
