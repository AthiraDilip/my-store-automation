package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/features"},
        glue = {"stepdefinitions", "setup"},
        plugin = {"pretty", "json:reports/cucumber-reports/cucumber.json", "html:reports/cucumber-reports", "de.monochromata.cucumber.report.PrettyReports:reports/pretty-cucumber"},
        tags = {"@UserStory1 or @UserStory2 or @UserStory3 or @UserStory4 or @UserStory5"}
)
public class TestRunner {
}
