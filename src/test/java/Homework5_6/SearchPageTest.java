package Homework5_6;

import StepObject.SearchPageSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.ChromeRunner;
import static DataObject.SearchPageData.*;

public class SearchPageTest extends ChromeRunner {
    SearchPageSteps searchPageSteps = new SearchPageSteps();
    @BeforeMethod
    public void closePopup(){
        searchPageSteps.closePopup();
    }
    @Test(priority = 1)
    public void searchCheck(){
        searchPageSteps
                .insertLocation(searchInput)
                .openCalendar()
                .selectFromDate()
                .selectDurationOption()
                .searchForResult();
        Assert.assertEquals(searchPageSteps.propertyAddress.getText(), searchInput, "Comparing search location to the property address");
    }
    @Test(priority = 0)
    public void searchCheckEmptyLocation(){
        searchPageSteps
                .searchForResult();
        Assert.assertTrue(searchPageSteps.locationValidation.exists(), "Validation message appearance");
    }
}
