package stepsDefinitions;

import constants.EndPoints;
import context.TestContext;
import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.StorePage;

public class StepsDefinitionAddToCart {

    private final WebDriver driver;

    public   StepsDefinitionAddToCart(TestContext context){
//        System.out.println("STEP DEF: DI: SCENARIO NAME: " + context.scenarioName);
        driver = context.driver;
    }










}
