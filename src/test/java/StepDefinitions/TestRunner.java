package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
//@CucumberOptions(features="src/test/resources/Features/login.feature",glue={"StepDefinitions"},
@CucumberOptions(features= {"src/test/resources/Features"},
glue={"helpers","StepDefinitions"},
monochrome=true,
plugin= {"pretty","html:target/HTMLReports.html"}
)
	
public class TestRunner
{
	
}
