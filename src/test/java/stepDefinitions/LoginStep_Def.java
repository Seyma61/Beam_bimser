package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Login_Page;
import pages.Popup_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStep_Def {
    Login_Page loginPage = new Login_Page();
    Popup_Page popupPage = new Popup_Page();

    @Given("kullanıcı giriş ekranındadır")
    public void kullanıcı_giriş_ekranındadır() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }

    @When("kullanıcı sirket olarak  BİMSER ACADEMY seçtiğinde")
    public void kullanıcıSirketOlarakBİMSERACADEMYSeçtiğinde() {

        loginPage.dropdownArrow.click();
        loginPage.BimserAcademyDropdownValue.click();

    }

    @When("kullanıcı doğru kullanıcı adını girdiğinde")
    public void kullanıcı_doğru_kullanıcı_adını_girdiğinde() {
        loginPage.kullaniciAdiInputBox.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @When("Kullanıcı doğru şifre girdiğinde")
    public void kullanıcı_doğru_şifre_girdiğinde() {
        loginPage.sifreInputBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("Kullanıcı Giriş butonunda tıkladığında")
    public void kullanıcı_giriş_butonunda_tıkladığında() {
        loginPage.girisButton.click();
    }

    @Then("Kullanıcıların listelendiği ekranı görüntülemeli")
    public void kullanıcıların_listelendiği_ekranı_görüntülemeli() {


        Assert.assertTrue(popupPage.kullanıcıSecimEkranıHeader.isDisplayed());

    }


    @And("kullanıcı yanlış kullanıcı adını girdiğinde")
    public void kullanıcıYanlışKullanıcıAdınıGirdiğinde() {

        loginPage.kullaniciAdiInputBox.sendKeys(ConfigurationReader.getProperty("username1"));


    }

    @And("Kullanıcı yanlış şifre girdiğinde")
    public void kullanıcıYanlışŞifreGirdiğinde() {

        loginPage.sifreInputBox.sendKeys(ConfigurationReader.getProperty("password1"));

    }

    @Then("Kullanıcı hatalı giriş mesajını görüntüler")
    public void kullanıcıHatalıGirişMesajınıGörüntüler() {

        Assert.assertTrue(loginPage.hataUyarisi.isDisplayed());
}
    }
