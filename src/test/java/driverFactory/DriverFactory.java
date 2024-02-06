package driverFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {

//    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver initializeDriver(String browserName){

        WebDriver driver;
        switch (browserName){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "MSEdge":
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Browser name is not proper: " + browserName);
        }
//        DriverFactory.driver.set(driver);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

//
//    public static WebDriver getDriver(){
//        return driver.get();
//    }

}
