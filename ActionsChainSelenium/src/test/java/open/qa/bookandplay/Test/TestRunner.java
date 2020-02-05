package open.qa.bookandplay.Test;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/main/java/open/qa/bookandplay/Features/Search.feature",
		glue= {"stepdefenition"})

public class TestRunner {
	
}

