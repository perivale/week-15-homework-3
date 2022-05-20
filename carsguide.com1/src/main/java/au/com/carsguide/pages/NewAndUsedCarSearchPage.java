package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {
    private static final Logger log= LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());
    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver,this);

    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement clickonMakes;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement anymodel;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement serchsubmitbutton;


    public void clickOnMakesdropDownMenu(){
        clickOnElement(clickonMakes);
    }
    public void selectTextOnDropDownmenu(String car){
        selectByVisibleTextFromDropDown(clickonMakes,car);
        log.info("select car ondropdown menu"+clickonMakes.toString());
    }
    public void selectAnyModelOnDropDownMenu(String anymodelcar){
        selectByVisibleTextFromDropDown(anymodel,anymodelcar);
        log.info("select mode ondropdown menu"+anymodel.toString());

    }
    public void selectLocationOnDropDwonmwnu(String anylocation){
        selectByVisibleTextFromDropDown(location,anylocation);
        log.info("select car location ondropdown menu"+location.toString());

    }
    public void SelectPriceonDropDownmenu(String prize){
        selectByVisibleTextFromDropDown(price,prize);
        log.info("select car price ondropdown menu"+price.toString());

    }
    public void clickOnFindMyNextCar(){
        clickOnElement(serchsubmitbutton);
        log.info("click on serachbutton"+serchsubmitbutton.toString());
    }
}
