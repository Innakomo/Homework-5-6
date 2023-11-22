package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class TaxiPage {
    public SelenideElement
            popupCloseBtn = $(".f4552b6561"),
            taxiPageLink = $("#airport_taxis"),
            returnOption = $(byTagAndText("span", "Return")),
            returnRadio = $("#returnJourneyAffirmative");

}
