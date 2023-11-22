package StepObject;
import PageObject.TaxiPage;

public class TaxiPageSteps extends TaxiPage {

    public TaxiPageSteps goToTaxiPage (){
        taxiPageLink.click();
        return this;
    }
    public TaxiPageSteps selectReturnOption (){
        returnOption.click();
        return this;
    }
    public TaxiPageSteps closePopup(){
        popupCloseBtn.click();
        return this;
    }

}
