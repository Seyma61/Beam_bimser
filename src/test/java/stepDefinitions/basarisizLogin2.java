package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basarisizLogin;

public class basarisizLogin2 {

    basarisizLogin login2 =new basarisizLogin();
    @Given("Kullanıcı, yanlış kullanıcı adı girmeli")
    public void kullanıcı_yanlış_kullanıcı_adı_girmeli() {

        login2.kullaniciAdi.sendKeys("Bimser");
    }

    @When("Kullanıcı doğru şifre girmeli")
    public void kullanıcı_doğru_şifre_girmeli() {
        login2.sifre.sendKeys("Bc3414314");

    }

    @When("Kullanıcı, giriş butonuna tıklayabilmeli")
    public void kullanıcı_giriş_butonuna_tıklayabilmeli() {
        login2.giris.click();

    }

    @When("Kullanıcı hata uyarısı almalı")
    public void kullanıcı_hata_uyarısı_almalı() {
        login2.hataUyarisi.isDisplayed();

    }

    @Then("Kullanıcı “Tamam” butonuna basabilmeli")
    public void kullanıcı_tamam_butonuna_basabilmeli() {
        login2.tamamButonu.click();
    }



}
