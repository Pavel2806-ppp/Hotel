package net.hotel.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    private WebDriver driver;

    public MainPage (WebDriver driver){
        this.driver=driver;
        PageFactory.initElements (driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Article']")
    public WebElement articleButton;

    @FindBy(xpath = "//span[normalize-space()='New']")
    public WebElement newButton;

    @FindBy(xpath = "//span[normalize-space()='Hotel']")
    public WebElement HotelButton;


    public RegistrationHotelPage openRegistrationHotelPage () {
        Actions action = new Actions (driver);
        action.moveToElement (articleButton)
                .moveToElement (newButton)
                .moveToElement (HotelButton)
                .build ().perform ();
        return new RegistrationHotelPage (driver);

    }
}
