package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basariliLogin;
import utilities.ConfigurationReader;

public class barariliLoginStep {


    basariliLogin beamPage =new basariliLogin();

    @Given("Kullanıcı, BEAM uygulamasının ana  sayfasına giriş yapabilmeli")
    public void kullanıcı_beam_uygulamasının_ana_sayfasına_giriş_yapabilmeli() {

        ConfigurationReader.getProperty("web.url");

    }
    @When("Kullanıcı, şirket ismini “BİMSER ACADEMY”seçebilmeli")
    public void kullanıcı_şirket_ismini_bimser_academy_seçebilmeli() {
        beamPage.sirketIsmi.click();

    }
    @When("Kullanıcı, kullanıcı adını girebilmeli")
    public void kullanıcı_kullanıcı_adını_girebilmeli() {
        beamPage.kullaniciAdi.sendKeys("BEAM");

    }
    @When("Kullanıcı, şifresini girebilmeli")
    public void kullanıcı_şifresini_girebilmeli() {
        beamPage.sifre.sendKeys("Bc3414314");

    }
    @When("Kullanıcı, giriş butonuna tıklayabilmeli")
    public void kullanıcı_giriş_butonuna_tıklayabilmeli() {
        beamPage.giris.click();

    }

    @When("Kullanıcı “Devam” butonuna tıklayabilmeli")
    public void kullanıcı_devam_butonuna_tıklayabilmeli() throws InterruptedException {

        Thread.sleep(7000);
        beamPage.devam.click();
        Thread.sleep(7000);


    }
    @When("Kullanıcı, başarılı bir şekilde websitesine giriş yapmalı")
    public void kullanıcı_başarılı_bir_şekilde_websitesine_giriş_yapmalı() {
        beamPage.basariliGiris.isDisplayed();

    }
    @Then("Kullanıcı \"Çıkış\"simgesine basabilmeli")
    public void kullanıcı_çıkış_simgesine_basabilmeli() {
        beamPage.cikis.click();

    }


}



