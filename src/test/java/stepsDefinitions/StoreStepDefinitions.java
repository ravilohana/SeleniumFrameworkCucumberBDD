package stepsDefinitions;

import constants.EndPoints;
import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.StorePage;

public class StoreStepDefinitions {

    private final WebDriver driver;


    public  StoreStepDefinitions(TestContext context){
        driver = context.driver;
    }


    @Given("I'm on the Store Page")
    public void iMOnTheStorePage() {
//        driver = DriverFactory.getDriver();
        new StorePage(driver).load(EndPoints.STORE.url);
//        new StorePage(driver).load(AppEndPoints.store);
    }

    @When("I add a {string} to the cart")
    public void iAddAToTheCart(String productName) throws InterruptedException {

        new StorePage(driver).addToCart(productName);
    }

    @Given("I'm a quest customer")
    public void iMAQuestCustomer() {
//        driver = DriverFactory.getDriver();
        new StorePage(driver).load(EndPoints.STORE.url);

    }

    @Given("I have a product in the cart")
    public void iHaveAProductInTheCart(){

        //   By addToCartBtn = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
        new StorePage(driver).addToCart("Blue Shoes");

    }
}
