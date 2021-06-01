package com.automation.acceptance.tests.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = {"@smoke-test"},
        features = "src/test/resources/features",
        plugin = {"html:target/cucumber"},
        glue = {"com/automation/acceptance/tests/runner",
                "com/automation/acceptance/tests/stepdefinitions"}
)
public class Runner {
}