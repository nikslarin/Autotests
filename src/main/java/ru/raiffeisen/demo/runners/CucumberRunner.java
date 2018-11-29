package ru.raiffeisen.demo.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Mortgage.feature"}, glue = {"ru/raiffeisen/demo"},
        plugin = {"pretty",
                "ru.raiffeisen.demo.reporter.AllureReporter"})
public class CucumberRunner {
}