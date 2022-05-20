package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private static final Logger log= LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'38 Jeep Cherokees for Sale under $50,000 in NSW')]")
    WebElement resultpagetext;

    public String verifyTheTextOnResultPage(){
        return resultpagetext.getText();

    }
}
