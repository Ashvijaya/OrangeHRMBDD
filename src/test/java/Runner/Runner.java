package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/Features"},
		glue={"StepDefinations", "Utilities"},
		tags="@tag1",
		dryRun=false,
		monochrome = true,
		plugin= {"pretty", "html:target/HTMLReports.html", "json:target/JSON/cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml", "rerun:target/rerun.txt"})
public class Runner {

}