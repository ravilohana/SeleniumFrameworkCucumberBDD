package stepsDefinitions;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CartPage;
import pages.CheckoutPage;

public class CheckoutStepDefinitions {


    private final WebDriver driver;


    public CheckoutStepDefinitions(TestContext context){
        driver = context.driver;
    }


    @Given("I'm on the Checkout Page")
    public void iMOnTheCheckoutPage() {
        new CartPage(driver).clickCheckoutBtn();

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
