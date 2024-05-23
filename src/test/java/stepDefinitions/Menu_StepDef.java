package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Login_Page;
import pages.MenüPage;
import pages.Popup_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;

public class Menu_StepDef {

    Login_Page loginPage = new Login_Page();
    MenüPage menüPage = new MenüPage();
    Popup_Page popupPage = new Popup_Page();



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
        wait.until(ExpectedConditions.visibilityOf(menüPage.opsiyonTuşu));
        //Thread.sleep(3000);
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(menüPage.opsiyonTuşu).perform();
        menüPage.opsiyonTuşu.click();

    }

    @And("Kullanıcı Sistem butonuna tıklar")
    public void kullanıcıSistemButonunaTıklar() {
        menüPage.sistemButonu.click();
    }

    @And("Kullanıcı “Ortak Tanımlar” butonuna tıklar")
    public void kullanıcıOrtakTanımlarButonunaTıklar() {
        menüPage.ortakTanimlarButonu.click();
    }

    @And("Kullanıcı “Tatil Günleri” butonuna tıklar")
    public void kullanıcıTatilGunleriButonunaTıklar() {
        menüPage.tatilGunleriButonu.click();
    }

    @Then("Kullanıcı başarılı bir şekilde  “Tatil Günleri” sayfasına yönlendirir")
    public void kullanıcıBasarılıBirSekildeTatilGunleriSayfasınaYonlendirir() {

        Assert.assertTrue(menüPage.tatilGünleriBasligi.isDisplayed());
    }





}
