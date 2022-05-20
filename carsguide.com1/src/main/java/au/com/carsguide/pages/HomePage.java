package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buyselllink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchcarlink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Used ')]")
    WebElement usedlink;


    public void mousehoverOnBuySell() {
        mouseHoverToElement(buyselllink);
        log.info("mousehover ob buy car"+buyselllink.toString());
    }

    public void ClickOnSearchcarsLink() {
        clickOnElement(searchcarlink);
        log.info("click on serachcar link"+searchcarlink.toString());
    }
    public void clickOnUsedlink(){
        clickOnElement(usedlink);
        log.info("click on usedlink"+usedlink.toString());

    }
}
