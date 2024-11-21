package io.runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "io.stepdefinition",
		plugin ={"pretty", "json:target/JsonReport/report.json",
				"junit:target/JunitReport/report.xml",
				"html:target/HtmlReports"},
		monochrome = true,
		dryRun     = false
		)

public class TestRunner {

}
