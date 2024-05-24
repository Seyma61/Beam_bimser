package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TatilGunleriPage {

    public  TatilGunleriPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@id='TASPxRoundPanel1']")
    public WebElement tatilGunleriBasligi;


}
