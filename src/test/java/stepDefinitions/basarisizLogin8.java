package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.basarisizLogin;

public class basarisizLogin8 {

    basarisizLogin login8 =new basarisizLogin();
    @Given("Kullanıcı, şirket ismini “{int}” seçebilmeli")
    public void kullanıcı_şirket_ismini_seçebilmeli(Integer int1) {

        login8.sirketIsmi.click();
        Select select = new Select(login8.sirketIsmi);
        select.selectByIndex(4);

    }

    @Given("Kullanıcı, doğru kullanıcı adı  ve şifre girmeli")
    public void kullanıcı_yanlış_kullanıcı_adı_girmeli() {

        login8.sifre.sendKeys("Bc3414314");

    }


    @When("Kullanıcı, giriş butonuna tıklayabilmeli")
    public void kullanıcı_giriş_butonuna_tıklayabilmeli() {

        login8.giris.click();

    }

    @When("Kullanıcı hata uyarısı almalı")
    public void kullanıcı_hata_uyarısı_almalı() {
        login8.hataUyarisi.isDisplayed();

    }

    @Then("Kullanıcı “Tamam” butonuna basabilmeli")
    public void kullanıcı_tamam_butonuna_basabilmeli() {

        login8.tamamButonu.click();
    }


}


