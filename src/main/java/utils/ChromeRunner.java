package utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class ChromeRunner {
    @BeforeMethod
    public void setUp(){
        open("https://www.booking.com/");
        //Configuration.browserSize = "1920x1080";

    }

    @AfterMethod
    public void tearDown(){
        Selenide.clearBrowserCookies();
        Selenide.clearBrowserLocalStorage();
        Selenide.closeWindow();
        Selenide.closeWebDriver();
    }
}
