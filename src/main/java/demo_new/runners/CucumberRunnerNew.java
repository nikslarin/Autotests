package demo_new.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Transfer.feature"}, glue = {"demo_new/steps"},
        plugin = {"pretty",
                "demo_new.reporter.AllureReporter"})
public class CucumberRunnerNew {
}