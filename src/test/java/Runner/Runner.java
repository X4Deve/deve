package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources/features", glue = { "" }, tags = "@CT004", monochrome = false, dryRun = false)

public class Runner {

}