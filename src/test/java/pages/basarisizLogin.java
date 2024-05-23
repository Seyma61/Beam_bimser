package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class basarisizLogin {

    public basarisizLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//label[@for='userId']")
    public WebElement kullaniciAdi;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement sifre;

    @FindBy(id ="btn_CD")
    public WebElement giris;

    @FindBy(xpath = "(//span[@class='dx-vam'])[3]")
    public WebElement devam;

    @FindBy(xpath = "//div[@class='dashboardHeader']")
    public WebElement basariliGiris;

    @FindBy(xpath = " //a[@class='logOut']")
    public WebElement cikis;

    @FindBy(xpath = "//span[@id='xmmMessage']")
    public WebElement hataUyarisi;

    @FindBy(xpath = " //span[text()='Tamam']")
    public WebElement tamamButonu;

    @FindBy(xpath = "//input[@id='cbCompany_I']")
    public WebElement sirketIsmi;

}
