package cucumberHooks;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class CucumberHooks {

    private WebDriver driver;

    @Before
    public void setUpDriver(Scenario scenario){
        System.out.println("BEFORE THREAD ID:---> " + Thread.currentThread().getId()
                + " SCENARIO NAME:---> " + scenario.getName());
        driver = DriverFactory.initializeDriver(System.getProperty("browserName","chrome"));
    }

    @After
    public void tearDownDriver(Scenario scenario){
        System.out.println("AFTER THREAD ID:--> " + Thread.currentThread().getId()
                + " SCENARIO NAME:---> " + scenario.getName());
        driver.quit();
    }

}
