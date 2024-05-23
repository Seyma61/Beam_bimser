package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basarisizLogin;

public class basarisizLogin3 {

    basarisizLogin login3 =new basarisizLogin();

    @Given("Kullanıcı yanlış kullanıcı adı yanlış şifre girmeli")
    public void kullanıcı_yanlış_kullanıcı_adı_yanlış_şifre_girmeli() {
        login3.sifre.sendKeys("987654");

    }

    @When("Kullanıcı, giriş butonuna tıklayabilmeli")
    public void kullanıcı_giriş_butonuna_tıklayabilmeli() {
        login3.giris.click();


    }

    @When("Kullanıcı hata uyarısı almalı")
    public void kullanıcı_hata_uyarısı_almalı() {
        login3.hataUyarisi.isDisplayed();

    }

    @Then("Kullanıcı “Tamam” butonuna basabilmeli")
    public void kullanıcı_tamam_butonuna_basabilmeli() {
        login3.tamamButonu.click();

    }

}
