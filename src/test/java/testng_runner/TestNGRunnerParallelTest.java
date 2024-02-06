package testng_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(

//        plugin = {"pretty","html:target/cucumber.html"},
       features = {"src/test/resources/Features"},
       // features = {"src/test/resources/Features"},
      //  tags = "@GuestCustomer",
        //glue = {"stepsDefinitions","cucumberHooks"}
        glue = {"stepsDefinitions","cucumberHooks"},
        plugin = {"pretty","html:target/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"
        }


)

public class TestNGRunnerParallelTest extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
