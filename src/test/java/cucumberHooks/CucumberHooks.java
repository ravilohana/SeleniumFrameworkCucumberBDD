package cucumberHooks;

import context.TestContext;
import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CucumberHooks {

    private WebDriver driver;
    private final TestContext context;

    public CucumberHooks(TestContext context){
        this.context  = context;
    }



    @Before
    public void setUpDriver(Scenario scenario){
//        context.scenarioName = scenario.getName();
//        System.out.println("DI: SCENARIO NAME: " + context.scenarioName);

        System.out.println("BEFORE THREAD ID:---> " + Thread.currentThread().getId()
                + " SCENARIO NAME:---> " + scenario.getName());
        driver = DriverFactory.initializeDriver(System.getProperty("browserName","chrome"));
        context.driver = driver;
    }

    @After
    public void tearDownDriver(Scenario scenario){

        //validate if scenario has failed
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        System.out.println("AFTER THREAD ID:--> " + Thread.currentThread().getId()
                + " SCENARIO NAME:---> " + scenario.getName());
        driver.quit();
    }

}
