package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Login_page;
import pages.MenuPage;
import pages.Popup_page;
import pages.TatilGunleriPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;

public class Menu_StepDef {

    Login_page loginPage = new Login_page();
    MenuPage menuPage = new MenuPage();
    Popup_page popupPage = new Popup_page();



    @Given("Kullanıcı sisteme giriş yapmış durumdadır")
    public void kullanıcıSistemeGirisYapmısDurumdadır() {
        loginPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));
    }

    @When("Kullanıcı \\(BEAM) SİSTEM YÖNETİCİSİ isimli seçeneği işaretler")
    public void kullanıcıBEAMSISTEMYONETICISIIsimliSecenegiIsaretler() {
        popupPage.sistemYoneticisiRadioButton.click();
    }

    @And("Kullanıcı Devam butonuna tıklar")
    public void kullanıcıDevamButonunaTıklar() {
        popupPage.devamButonu.click();
    }

    @And("Kullanıcı Opsiyon tuşuna tıklar")
    public void kullanıcıOpsiyonTusunaTıklar() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(menuPage.opsiyonTusu));
        //Thread.sleep(3000);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(menuPage.opsiyonTusu).perform();
        menuPage.opsiyonTusu.click();

    }

    @And("Kullanıcı Sistem butonuna tıklar")
    public void kullanıcıSistemButonunaTıklar() {
        menuPage.sistemButonu.click();
    }

    @And("Kullanıcı “Ortak Tanımlar” butonuna tıklar")
    public void kullanıcıOrtakTanımlarButonunaTıklar() {
        menuPage.ortakTanimlarButonu.click();
    }

    @And("Kullanıcı “Tatil Günleri” butonuna tıklar")
    public void kullanıcıTatilGunleriButonunaTıklar() {
        menuPage.tatilGunleriButonu.click();
    }

    @Then("Kullanıcı başarılı bir şekilde  “Tatil Günleri” sayfasına yönlendirir")
    public void kullanıcıBasarılıBirSekildeTatilGunleriSayfasınaYonlendirir() {
        TatilGunleriPage tatil = new TatilGunleriPage();
        Assert.assertTrue(tatil.tatilGunleriBasligi.isDisplayed());
    }





}
