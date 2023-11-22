package StepObject;
import PageObject.SearchPage;
import com.codeborne.selenide.Condition;

public class SearchPageSteps extends SearchPage {

    public SearchPageSteps closePopup(){
        popupCloseBtn.click();
        return this;
    }

    public SearchPageSteps insertLocation(String location){
        locationInputField.setValue(location);
        locationInputField.shouldNotBe(Condition.empty);
        return this;
    }

    public SearchPageSteps openCalendar(){
        dateInputField.click();
    return this;
    }

    public SearchPageSteps selectFromDate(){
        calendarDate.click();
        return this;
    }

    public SearchPageSteps selectDurationOption(){
        daysNumOption.click();
        dateInputField.shouldNotBe(Condition.empty);
        return this;
    }

    public SearchPageSteps searchForResult(){
        searchBtn.click();
        return this;
    }

}
