package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class homepagesteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on \'([^\"]*)\' tab$")
    public void iMouseHoverOnTab(){
        new HomePage().mousehoverOnBuySell();

    }
    @And("^I click 'Used' link$")
    public void iClickUsedLink() {
    }


  

    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink() {
        new HomePage().ClickOnSearchcarsLink();



    }



}
