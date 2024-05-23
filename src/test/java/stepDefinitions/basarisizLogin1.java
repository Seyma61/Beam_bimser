package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basariliLogin;
import pages.basarisizLogin;
import utilities.ConfigurationReader;

public class basarisizLogin1 {

    basarisizLogin login1 =new basarisizLogin();

    @Given("Kullanıcısı, BEAM uygulamasının ana  sayfasına giriş yapabilmeli")
    public void kullanıcısı_beam_uygulamasının_ana_sayfasına_giriş_yapabilmeli() {

        ConfigurationReader.getProperty("web.url");
    }

    @When("Kullanıcı, şirket İsmini “BİMSER ACADEMY”seçebilmeli")
    public void kullanıcı_şirket_ismini_bimser_academy_seçebilmeli() {
        login1.sirketIsmi.click();

    }

    @When("Kullanıcı, doğru kullanıcı adı girmeli")
    public void kullanıcı_doğru_kullanıcı_adı_girmeli() {
        login1.kullaniciAdi.sendKeys("BEAM");

    }

    @When("Kullanıcı yanlış şifre girmeli")
    public void kullanıcı_yanlış_şifre_girmeli() {
        login1.sifre.sendKeys("13579");

    }

    @When("Kullanıcı, giriş butonuna tıklayabilmeli")
    public void kullanıcı_giriş_butonuna_tıklayabilmeli() {
        login1.giris.click();


    }

    @When("Kullanıcı hata uyarısı almalı")
    public void kullanıcı_hata_uyarısı_almalı() {
        login1.hataUyarisi.isDisplayed();

    }

    @Then("Kullanıcı “Tamam” butonuna basabilmeli")
    public void kullanıcı_tamam_butonuna_basabilmeli() {
        login1.tamamButonu.click();

    }



}
