package net.hotel.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RegistrationHotelPage {
    private WebDriver driver;

    public RegistrationHotelPage(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isPageLoad() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
         return js.executeScript ("return document.readyState ")
                .equals ("completed");

    }
}
