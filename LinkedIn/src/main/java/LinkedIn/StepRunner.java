package LinkedIn;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (features= "classpath:feature.feature", glue = "LinkedIn" ,tags = {"@Login,@Connections,@Fetch_Data" }
,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target\\report.html","pretty","usage:target/cucumber-usage.json",
		"html:target/cucumber.html" , "json:target/cucumber.json","junit:target/cucumber.xml"}
,monochrome=true,strict=true)
public class StepRunner 
{

}
