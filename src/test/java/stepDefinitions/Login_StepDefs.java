package stepDefinitions;

import io.cucumber.java.en.*;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import pages.LoginPage;
import pages.PopupPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Login_StepDefs {

    LoginPage loginPage = new LoginPage();
    PopupPage popupPage = new PopupPage();

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


    @When("Kullanıcı, şirket İsmini “BİMSER ACADEMY”seçebilmeli")
    public void kullanıcı_şirket_ismini_bimser_academy_seçebilmeli() {
        loginPage.sirketIsmiDropdown.click();

    }

    @When("Kullanıcı, doğru kullanıcı adı girmeli")
    public void kullanıcı_doğru_kullanıcı_adı_girmeli() {
        loginPage.kullaniciAdiInputBox.sendKeys("BEAM");

    }

    @When("Kullanıcı yanlış şifre girmeli")
    public void kullanıcı_yanlış_şifre_girmeli() {
        loginPage.sifreInputBox.sendKeys("13579");

    }

    @When("Kullanıcı, giriş butonuna tıklayabilmeli")
    public void kullanıcı_giriş_butonuna_tıklayabilmeli() {
        loginPage.girisButton.click();


    }

    @When("Kullanıcı hata uyarısı almalı")
    public void kullanıcı_hata_uyarısı_almalı() {
        loginPage.hataUyarisi.isDisplayed();

    }

    @Then("Kullanıcı “Tamam” butonuna basabilmeli")
    public void kullanıcı_tamam_butonuna_basabilmeli() {
        loginPage.tamamButonu.click();

    }


    @Given("Kullanıcı, yanlış kullanıcı adı girmeli")
    public void kullanıcı_yanlış_kullanıcı_adı_girmeli() {

        loginPage.kullaniciAdiInputBox.sendKeys("Bimser");
    }

    @When("Kullanıcı doğru şifre girmeli")
    public void kullanıcı_doğru_şifre_girmeli() {
        loginPage.sifreInputBox.sendKeys("Bc3414314");

    }







}



