package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {
    public SelenideElement
            popupCloseBtn = $(".f4552b6561"),
            locationInputField = $(".eb46370fe1"),
            dateInputField = $(".f73e6603bf"),
            calendarDate = $(by("data-date", "2023-12-02")),
            daysNumOption = $(byText("1 day")),
            searchBtn = $(".d12ff5f5bf"),
            propertyAddress = $(byAttribute("data-testid", "address")),
            locationValidation = $(".feaba1002a");
}
