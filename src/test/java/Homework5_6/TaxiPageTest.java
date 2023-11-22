package Homework5_6;

import StepObject.TaxiPageSteps;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import static DataObject.TaxiPageData.selectedState;

public class TaxiPageTest extends ChromeRunner {
    TaxiPageSteps taxiPageSteps = new TaxiPageSteps();
    @BeforeMethod
    public void closePopup(){
        taxiPageSteps.closePopup();
    }

    @Test(priority = 2)
    public void selectReturnOpt(){
        taxiPageSteps
                .goToTaxiPage()
                .selectReturnOption();
        Assert.assertEquals(taxiPageSteps.returnRadio.getValue(), selectedState,"Return radio is selected");
    }

}
