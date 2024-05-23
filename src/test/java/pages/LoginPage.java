package pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='teUser_I']")
    public WebElement kullaniciAdiInputBox;

    @FindBy(xpath = "//input[@id='PV_I']")
    public WebElement sifreInputBox;

    @FindBy(id ="btn_CD")
    public WebElement girisButton;

    @FindBy(xpath = "(//span[@class='dx-vam'])[3]")
    public WebElement devamButton;

    @FindBy(xpath = "//div[@class='dashboardHeader']")
    public WebElement dashboardHeader;

    @FindBy(xpath = " //a[@class='logOut']")
    public WebElement cikisButton;


    @FindBy(xpath = "//span[@id='xmmMessage']")
    public WebElement hataUyarisi;

    //
    @FindBy(xpath = " //span[text()='Tamam']")
    public WebElement tamamButonu;

    @FindBy(xpath = "//input[@id='cbCompany_I']")
    public WebElement sirketIsmiDropdown;

    @FindBy (xpath = "//td[@id='cbCompany_DDD_L_LBI2T0']")
    public WebElement BimserAcademyDropdownValue;

    @FindBy (xpath = "//td[@id='cbCompany_B-1']")
    public WebElement dropdownArrow;

    public void login(String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
        dropdownArrow.click();
        BimserAcademyDropdownValue.click();
        kullaniciAdiInputBox.sendKeys(username);
        sifreInputBox.sendKeys(password);
        girisButton.click();

    }




}
