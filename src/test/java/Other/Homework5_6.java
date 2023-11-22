package Other;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;


public class Homework5_6 extends ChromeRunner {
    @Test
    public void searchTest(){
        $(".f4552b6561").click();
        $(".eb46370fe1").setValue("Bakuriani");
        $(".f73e6603bf").click();
        $(by("data-date", "2023-12-02")).click();
        $(byText("1 day")).click();
        $(".d12ff5f5bf").click();
        String result = "Bakuriani";
        SelenideElement address = $(byAttribute("data-testid", "address"));
        Assert.assertEquals(address.getText(), result, "Comparing search query to the search results address");

    }
   /* @Test(priority = 0)
    public void searchCheckEmptyLocation(){
        searchPageSteps
                //.closePopup()
                .searchForResult();
        Assert.assertTrue(searchPageSteps.locationValidation.exists(), "Validation message appearance");
    }*/
    //Assert.assertEquals(searchPageSteps.locationValidation.getText(), locationValidationMes, "Empty location validation message text");

    @Test
    public void sortingCheck(){
        $(".eb46370fe1").setValue("Bakuriani");
        $(".f4552b6561").click();
        $(".f73e6603bf").click();
        $(by("data-date", "2023-12-02")).click();
        $(byText("1 day")).click();
        $(".d12ff5f5bf").click();
        $(byAttribute("data-testid", "sorters-dropdown-trigger")).click();
        $(byText("Price (lowest first)")).click();
        //SelenideElement firstPrice = $(byTagAndText("span", "GEL"),0);
        //System.out.println(firstPrice.getValue());
    }

    @Test
    public void countItems() {
        $(".eb46370fe1").setValue("Bakuriani");
        $(".f4552b6561").click();
        $(".f73e6603bf").click();
        $(by("data-date", "2023-12-02")).click();
        $(byText("1 day")).click();
        $(".d12ff5f5bf").click();
        int counter = $$(byAttribute("data-testid", "property-card")).size();
        System.out.println(counter);
    }

    @Test
            public void filter(){
        $(".eb46370fe1").setValue("Bakuriani");
        $(".f4552b6561").click();
        $(".f73e6603bf").click();
        $(by("data-date", "2023-12-02")).click();
        $(byText("1 day")).click();
        $(".d12ff5f5bf").click();
        $(byAttribute("data-filters-item", "mealplan:mealplan=1")).click();
        sleep(5000);
    }

    @Test
    public void taxi(){
        $(".f4552b6561").click();
        $("#airport_taxis").click();
        //$(".rw-return-radio").selectRadio("Return");
        //$("#returnJourneyAffirmative").click();
        $(byTagAndText("span", "Return")).click();
        SelenideElement returnRadio = $("#returnJourneyAffirmative");
        String selectedState = "true";
        Assert.assertEquals(returnRadio.getValue(), selectedState,"Return radio is selected");
    }

}
