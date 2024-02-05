package stepsDefinitions;

import constants.EndPoints;
import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CartPage;
import pages.StorePage;

public class StepsDefinitionAddToCart {

    private WebDriver driver;



    @Given("I'm on the Store Page")
    public void iMOnTheStorePage() {
        driver = DriverFactory.getDriver();
        new StorePage(driver).load(EndPoints.STORE.url);
//        new StorePage(driver).load(AppEndPoints.store);
    }

    @When("I add a {string} to the cart")
    public void iAddAToTheCart(String productName) throws InterruptedException {

        new StorePage(driver).addToCart(productName);
    }


    @Then("I should see {int} {string} in the cart")
    public void iShouldSeeInTheCart(int qty, String productName) {
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(productName,cartPage.getProductName());
        Assert.assertEquals(qty,cartPage.getProductQty());

    }


}
