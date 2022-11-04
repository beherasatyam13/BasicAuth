package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
			features=".\\src\\test\\java",
			glue="stepdef",
			dryRun= false,
			monochrome= true,
			plugin = {"pretty"}
)
public class Run extends AbstractTestNGCucumberTests{

}
