package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MenuPage {

    public MenuPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='init-app-menu']")
    public WebElement opsiyonTusu;

    @FindBy(xpath ="//*[@title='Sistem']")
    public WebElement sistemButonu;

    @FindBy(xpath = "//*[@title='Ortak Tanımlar']")
    public WebElement ortakTanimlarButonu;

    @FindBy(xpath ="//h3[.='Tatil Günleri']")
    public WebElement tatilGunleriButonu;






}
