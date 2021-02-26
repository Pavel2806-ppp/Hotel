package net.hotel.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public abstract class BaseTest {

    protected WebDriver driver;
    @BeforeClass
    @Parameters("browser")
    public void setup(String browser) {
        if (browser.equalsIgnoreCase ("chrome")){
            WebDriverManager.chromedriver ().setup ();
            driver = new ChromeDriver ();
        }else if (browser.equalsIgnoreCase ("opera")){
            WebDriverManager.operadriver ().setup ();
            driver = new OperaDriver ();
        }else if (browser.equalsIgnoreCase ("firefox")){
            WebDriverManager.firefoxdriver ().setup ();
            driver = new FirefoxDriver ();
        }else if (browser.equalsIgnoreCase ("edge")){
            WebDriverManager.edgedriver ().setup ();
            driver = new EdgeDriver ();
        }
    }
    @AfterClass
    public void teardown() {
        if (driver!=null) {
            driver.manage ().deleteAllCookies ();
            driver.quit ();
        }
    }
}
