package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="FeatureFiles\\FeatureFiles.feature",
					monochrome=true, glue = "stepDefinition",dryRun = false, tags = "@Roles or Branch")
public class Runner {

}
