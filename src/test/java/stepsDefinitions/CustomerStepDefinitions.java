package stepsDefinitions;

import context.TestContext;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.CheckoutPage;

import java.util.List;
import java.util.Map;

public class CustomerStepDefinitions {


    private final WebDriver driver;

   public CustomerStepDefinitions(TestContext context){
        driver = context.driver;
    }

    @When("I provide the billing details")
    public void iProvideTheBillingDetails(List<Map<String, String>> billingDetails){


        new CheckoutPage(driver).setBillingDetails(billingDetails.get(0).get("firstName"),
                billingDetails.get(0).get("lastName"),
                billingDetails.get(0).get("companyName"),
                billingDetails.get(0).get("countryName"),
                billingDetails.get(0).get("streetAddressLine1"),
                billingDetails.get(0).get("streetAddressLine2"),
                billingDetails.get(0).get("cityName"),
                billingDetails.get(0).get("stateName"),
                billingDetails.get(0).get("zipCode"),
                billingDetails.get(0).get("phoneNumber"),
                billingDetails.get(0).get("emailID")
        );


    }
}
