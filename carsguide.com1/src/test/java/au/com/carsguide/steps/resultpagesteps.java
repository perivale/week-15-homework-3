package au.com.carsguide.steps;

import au.com.carsguide.pages.ResultPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class resultpagesteps {

        @Then("^I should see the make \"([^\"]*)\" in results$")
        public void iShouldSeeTheMakeInResults() {
            new ResultPage().verifyTheTextOnResultPage();
        }
    }

