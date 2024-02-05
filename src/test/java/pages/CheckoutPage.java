package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.animation.model.KeyframeStyle;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    // locators

    @FindBy(id = "billing_first_name")  private WebElement billingFirstName;
    @FindBy(id = "billing_last_name")  private WebElement billingLastName;
    @FindBy(id = "billing_company")  private WebElement billingCompanyName;
    @FindBy(id = "billing_country")  private WebElement billingCountryName;
    @FindBy(id = "billing_address_1")  private WebElement billingStreetAddressLine1;
    @FindBy(id = "billing_address_2")  private WebElement billingStreetAddressLine2;
    @FindBy(id = "billing_city")  private WebElement billingCity;


    @FindBy(id = "select2-billing_country-container")
    private  WebElement alternateCountryDropDown;

    @FindBy(id = "billing_state") private  WebElement billingState;

    @FindBy(id = "select2-billing_state-container")
    private WebElement alternateStateDropDown;

    @FindBy(id = "billing_postcode") private  WebElement billingZipCode;
    @FindBy(id = "billing_phone")  private WebElement billingPhoneNumber;
    @FindBy(id = "billing_email")  private WebElement billingEmailID;

    @FindBy (id = "place_order") private WebElement placeOrderBtn;

    @FindBy (css = ".woocommerce-notice") private WebElement successMsg;
    // Actions

    public CheckoutPage enterBillingFirstName(String fName){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(billingFirstName));
        element.clear();
        element.sendKeys(fName);
        return this;
    }

    public CheckoutPage enterBillingLastName(String lName){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(billingLastName));
        element.clear();
        element.sendKeys(lName);
        return this;
    }

    public CheckoutPage enterBillingCompany(String compName){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(billingCompanyName));
        element.clear();
        element.sendKeys(compName);
        return this;
    }

    public CheckoutPage selectBillingCountry(String countryName){
        wait.until(ExpectedConditions.elementToBeClickable(alternateCountryDropDown)).click();
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[text()= \""+countryName+"\"]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
        e.click();
        return this;
    }

    public CheckoutPage enterBillingAddressLine1(String addressLine1){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(billingStreetAddressLine1));
        element.clear();
        element.sendKeys(addressLine1);
        return this;
    }

    public CheckoutPage enterBillingAddressLine2(String addressLine2){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(billingStreetAddressLine2));
        element.clear();
        element.sendKeys(addressLine2);
        return this;
    }

    public CheckoutPage enterBillingCity(String city){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(billingCity));
        element.clear();
        element.sendKeys(city);
        return this;
    }

    public CheckoutPage selectBillingState(String stateName){

        wait.until(ExpectedConditions.elementToBeClickable(alternateStateDropDown)).click();
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//li[text()= \""+stateName+"\"]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        ele.click();

        return this;
    }

    public CheckoutPage enterBillingZipcode(String zipCode){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(billingZipCode));
        element.clear();
        element.sendKeys(zipCode);
        return this;
    }

    public CheckoutPage enterBillingPhoneNo(String phoneNo){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(billingPhoneNumber));
        element.clear();
        element.sendKeys(phoneNo);
        return this;
    }

    public CheckoutPage enterBillingEmailID(String emailID){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(billingEmailID));
        element.clear();
        element.sendKeys(emailID);
        return this;
    }

    public CheckoutPage setBillingDetails(String billingFirstName,String billingLastName,
                                          String billingCompanyName,String billingCountryName,
                                          String billingAddress1,String billingAddress2,
                                          String billingCity,String billingState,
                                          String billingZipcode,String billingPhoneNo,
                                          String billingEmailID)  {
        return enterBillingFirstName(billingFirstName)
                .enterBillingLastName(billingLastName)
                .enterBillingCompany(billingCompanyName)
                .selectBillingCountry(billingCountryName)
                .enterBillingAddressLine1(billingAddress1)
                .enterBillingAddressLine2(billingAddress2)
                .enterBillingCity(billingCity)
                .selectBillingState(billingState)
                .enterBillingZipcode(billingZipcode)
                .enterBillingPhoneNo(billingPhoneNo)
                .enterBillingEmailID(billingEmailID);
    }

    public CheckoutPage placeOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();
        return this;
    }

    public String getSuccessMsg(){
        return wait.until(ExpectedConditions.visibilityOf(successMsg)).getText();
    }

}
