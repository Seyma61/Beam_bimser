package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basarisizLogin;

public class basarisizLogin5 {

    basarisizLogin login5 =new basarisizLogin();

    @Given("Kullanıcı doğru şifre girmeli ve kullanıcı adı butonunu boş bırakmalı")
    public void kullanıcı_doğru_şifre_girmeli_ve_kullanıcı_adı_butonunu_boş_bırakmalı() {
        login5.sifre.sendKeys("Bc3414314");

    }


    @When("Kullanıcı, giriş butonuna tıklayabilmeli")
    public void kullanıcı_giriş_butonuna_tıklayabilmeli() {
        login5.giris.click();


    }

    @When("Kullanıcı hata uyarısı almalı")
    public void kullanıcı_hata_uyarısı_almalı() {
        login5.hataUyarisi.isDisplayed();

    }

    @Then("Kullanıcı “Tamam” butonuna basabilmeli")
    public void kullanıcı_tamam_butonuna_basabilmeli() {
        login5.tamamButonu.click();

    }
}
