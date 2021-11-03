package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features   ="src/test/java/Feature",
	glue       = {""},
		tags       = "@CT001",
		monochrome = false, 
		dryRun     = false)


public class Runner {
	
}                                                                       