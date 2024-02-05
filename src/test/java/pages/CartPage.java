package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }



    // Locators
    @FindBy(css = "td[class='product-name'] a")
    private WebElement productNameFld;

    @FindBy(xpath = "//input[@type='number']")
    private WebElement productQtyFld;

    @FindBy(css = ".checkout-button")
    private WebElement proceedCheckoutBtn;

    // Actions

    public String getProductName(){
        return wait.until(ExpectedConditions.visibilityOf(productNameFld)).getText();
    }

    public int getProductQty(){
        return  Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(productQtyFld))
                .getAttribute("value"));
    }

    public void clickCheckoutBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(proceedCheckoutBtn)).click();
    }

}
