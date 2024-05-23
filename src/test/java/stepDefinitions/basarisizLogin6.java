package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.basarisizLogin;

public class basarisizLogin6 {

    basarisizLogin login6 =new basarisizLogin();
    @Given("Kullanıcı, kullanıcı adı butonunu ve şifre butonunu boş bırakmalı")
    public void kullanıcı_kullanıcı_adı_butonunu_ve_şifre_butonunu_boş_bırakmalı() {


    }

    @When("Kullanıcı, giriş butonuna tıklayabilmeli")
    public void kullanıcı_giriş_butonuna_tıklayabilmeli() {

        login6.giris.click();

    }

    @When("Kullanıcı hata uyarısı almalı")
    public void kullanıcı_hata_uyarısı_almalı() {

        login6.hataUyarisi.isDisplayed();
    }

    @Then("Kullanıcı “Tamam” butonuna basabilmeli")
    public void kullanıcı_tamam_butonuna_basabilmeli() {
        login6.tamamButonu.click();

    }

}
