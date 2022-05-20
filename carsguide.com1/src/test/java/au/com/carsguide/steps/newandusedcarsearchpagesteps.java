package au.com.carsguide.steps;

import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class newandusedcarsearchpagesteps {
    @Then("^I navigate to 'new and used car search' page$")
    public void iNavigateToNewAndUsedCarSearchPage() {

    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make)  {
        new NewAndUsedCarSearchPage().selectTextOnDropDownmenu(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarSearchPage().selectAnyModelOnDropDownMenu(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new  NewAndUsedCarSearchPage().selectLocationOnDropDwonmwnu(location);

    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price){
        new NewAndUsedCarSearchPage().SelectPriceonDropDownmenu(price);



    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCar();
    }
}
