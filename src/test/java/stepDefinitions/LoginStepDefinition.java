package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Login_page;
import pages.Popup_page;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;

public class LoginStepDefinition {

    Login_page loginPage = new Login_page();
    Popup_page popupPage = new Popup_page();

    @Given("kullanıcı giriş ekranındadır")
    public void kullanıcı_giriş_ekranındadır() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));
    }

    @When("kullanıcı sirket olarak  BİMSER ACADEMY seçtiğinde")
    public void kullanıcıSirketOlarakBİMSERACADEMYSeçtiğinde() {

        loginPage.dropdownArrow.click();
        loginPage.BimserAcademyDropdownValue.click();

    }

    @When("kullanıcı doğru kullanıcı adını girdiğinde")
    public void kullanıcı_doğru_kullanıcı_adını_girdiğinde() {
        loginPage.kullaniciAdiInputBox.sendKeys(ConfigurationReader.getProperty("username"));
    }

    @When("Kullanıcı doğru şifre girdiğinde")
    public void kullanıcı_doğru_şifre_girdiğinde() {
        loginPage.sifreInputBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("Kullanıcı Giriş butonunda tıkladığında")
    public void kullanıcı_giriş_butonunda_tıkladığında() {
        loginPage.girisButton.click();
    }

    @Then("Kullanıcıların listelendiği ekranı görüntülemeli")
    public void kullanıcıların_listelendiği_ekranı_görüntülemeli() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.hataUyarisi));
        Assert.assertTrue(popupPage.kullanıcıSecimEkranıHeader.isDisplayed());

    }


    @And("kullanıcı yanlış kullanıcı adını girdiğinde")
    public void kullanıcıYanlışKullanıcıAdınıGirdiğinde() {

        loginPage.kullaniciAdiInputBox.sendKeys(ConfigurationReader.getProperty("username1"));


    }

    @And("Kullanıcı yanlış şifre girdiğinde")
    public void kullanıcıYanlışŞifreGirdiğinde() {

        loginPage.sifreInputBox.sendKeys(ConfigurationReader.getProperty("password1"));

    }

    @Then("Kullanıcı hatalı giriş mesajını görüntüler")
    public void kullanıcıHatalıGirişMesajınıGörüntüler() throws InterruptedException {


        Assert.assertTrue(loginPage.hataUyarisi.isDisplayed());


    }
}

