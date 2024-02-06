package stepsDefinitions;

import context.TestContext;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.CartPage;

public class CartStepDefinitions {


    private final WebDriver driver;

    public  CartStepDefinitions(TestContext context){
        driver = context.driver;
    }


    @Then("I should see {int} {string} in the cart")
    public void iShouldSeeInTheCart(int qty, String productName) {
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(productName,cartPage.getProductName());
        Assert.assertEquals(qty,cartPage.getProductQty());

    }

}
