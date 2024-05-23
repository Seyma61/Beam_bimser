package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MenüPage {



    @FindBy(xpath = "//button[@class='active']")
    public WebElement opsiyonTuşu;

    @FindBy(xpath ="//div[@class='app-menu-item active']")
    public WebElement sistemButonu;

    @FindBy(xpath = "//div[@data-id='mnCommonDefinition']/span")
    public WebElement ortakTanimlarButonu;

    @FindBy(xpath ="//h3[.='Tatil Günleri']")
    public WebElement tatilGunleriButonu;

    @FindBy(id = "TASPxRoundPanel1_xlbHeader")
    public WebElement tatilGünleriBasligi;





}
