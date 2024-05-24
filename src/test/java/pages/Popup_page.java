package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.swing.*;

public class Popup_page {
    public Popup_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@id='xppcProcurationList_xrblProcurationList_RB0_I_D']")
    public WebElement sistemYoneticisiRadioButton;

    @FindBy (xpath = "//span[.='Devam']")
    public WebElement devamButonu;

    @FindBy (xpath = "//span[@id='xppcProcurationList_xlbProcurationHeader']")
    public WebElement kullanıcıSecimEkranıHeader;


}
