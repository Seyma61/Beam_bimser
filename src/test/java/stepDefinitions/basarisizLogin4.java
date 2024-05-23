package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basarisizLogin;

public class basarisizLogin4 {

    basarisizLogin login4 =new basarisizLogin();
    @Given("Kullanıcı, doğru kullanıcı adı girmeli ve şifre butonunu boş bırakmalı")
    public void kullanıcı_doğru_kullanıcı_adı_girmeli_ve_şifre_butonunu_boş_bırakmalı() {

        login4.kullaniciAdi.sendKeys("BEAM");
    }

    @When("Kullanıcı, giriş butonuna tıklayabilmeli")
    public void kullanıcı_giriş_butonuna_tıklayabilmeli() {

        login4.giris.click();

    }

    @When("Kullanıcı hata uyarısı almalı")
    public void kullanıcı_hata_uyarısı_almalı() {

        login4.hataUyarisi.isDisplayed();
    }

    @Then("Kullanıcı “Tamam” butonuna basabilmeli")
    public void kullanıcı_tamam_butonuna_basabilmeli() {
        login4.tamamButonu.click();

    }


}
