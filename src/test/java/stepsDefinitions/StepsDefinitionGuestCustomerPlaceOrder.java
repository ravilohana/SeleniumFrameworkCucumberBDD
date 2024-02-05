package stepsDefinitions;

import constants.EndPoints;
import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pages.CartPage;
import pages.CheckoutPage;
import pages.StorePage;

import java.util.List;
import java.util.Map;

public class StepsDefinitionGuestCustomerPlaceOrder {

    private WebDriver driver;






    @Given("I'm a quest customer")
    public void iMAQuestCustomer() {
        driver = DriverFactory.getDriver();
        new StorePage(driver).load(EndPoints.STORE.url);

    }

    @Given("I have a product in the cart")
    public void iHaveAProductInTheCart(){

     //   By addToCartBtn = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
        new StorePage(driver).addToCart("Blue Shoes");

    }

    @Given("I'm on the Checkout Page")
    public void iMOnTheCheckoutPage() {
        new CartPage(driver).clickCheckoutBtn();

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

    @When("I'm place an order")
    public void iMPlaceAnOrder() {
        new CheckoutPage(driver).placeOrder();
    }

    @Then("The order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() throws InterruptedException {

        String successMsgPlacedOrderExpected = "Thank you. Your order has been received.";

        Assert.assertEquals(new CheckoutPage(driver).getSuccessMsg(), successMsgPlacedOrderExpected);

    }

}
