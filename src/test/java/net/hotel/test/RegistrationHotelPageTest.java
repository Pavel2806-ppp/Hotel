package net.hotel.test;

import net.hotel.pages.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationHotelPageTest extends BaseTest {
    @Test
    public void testCanOpenRegistrationPage() {
        boolean result = new MainPage (driver)
                .openRegistrationHotelPage ()
                .isPageLoad ();
        Assert.assertTrue (result, "Page should be loaded");

    }
}
