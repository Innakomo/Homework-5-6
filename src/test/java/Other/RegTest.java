package Other;

import org.testng.annotations.Test;
import utils.ChromeRunner;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;

public class RegTest extends ChromeRunner {
    @Test(enabled = false)
    public void test1 (){
        $(byName("btnK")).click();
    }
    @Test(priority = 2)
    public void test2 (){
        $(byName("q")).setValue("Test automation");
    }
    @Test(priority = 0)
    public void test3 (){
        $(byName("q")).setValue("Test automation").pressEnter();
    }



}
