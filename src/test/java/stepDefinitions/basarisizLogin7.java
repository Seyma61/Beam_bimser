package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.basarisizLogin;

public class basarisizLogin7 {

    basarisizLogin login7 =new basarisizLogin();

    @Given("Kullanıcı, şirket ismini “İİPEK” seçebilmeli")
    public void kullanıcı_şirket_ismini_iipek_seçebilmeli() {

        login7.sirketIsmi.click();
        Select select = new Select(login7.sirketIsmi);
        select.selectByIndex(3);

    }

    @Given("Kullanıcı, doğru kullanıcı adı girmeli")
    public void kullanıcı_yanlış_kullanıcı_adı_girmeli() {

        login7.kullaniciAdi.sendKeys("BEAM");

    }

    @When("Kullanıcı doğru şifre girmeli")
    public void kullanıcı_doğru_şifre_girmeli() {

        login7.sifre.sendKeys("Bc3414314");
    }

    @When("Kullanıcı, giriş butonuna tıklayabilmeli")
    public void kullanıcı_giriş_butonuna_tıklayabilmeli() {

        login7.giris.click();

    }

    @When("Kullanıcı hata uyarısı almalı")
    public void kullanıcı_hata_uyarısı_almalı() {

        login7.hataUyarisi.isDisplayed();
    }

    @Then("Kullanıcı “Tamam” butonuna basabilmeli")
    public void kullanıcı_tamam_butonuna_basabilmeli() {

        login7.tamamButonu.click();
    }


}
