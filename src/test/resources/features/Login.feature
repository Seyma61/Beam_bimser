# Created by Seyma Calıskan at 5/23/2024
Feature: Sisteme giriş
  # Enter feature description here

 @login
  Scenario: Başarılı Giriş Senaryosu
    Given kullanıcı giriş ekranındadır
    When kullanıcı sirket olarak  BİMSER ACADEMY seçtiğinde
    And kullanıcı doğru kullanıcı adını girdiğinde
    And Kullanıcı doğru şifre girdiğinde
    And Kullanıcı Giriş butonunda tıkladığında
    Then Kullanıcıların listelendiği ekranı görüntülemeli


  Scenario: Başarısız Giriş Senaryosu
    Given kullanıcı giriş ekranındadır
    When kullanıcı sirket olarak  BİMSER ACADEMY seçtiğinde
    And kullanıcı yanlış kullanıcı adını girdiğinde
    And Kullanıcı yanlış şifre girdiğinde
    And Kullanıcı Giriş butonunda tıkladığında
    Then Kullanıcı hatalı giriş mesajını görüntüler


  Scenario: Başarısız Giriş Senaryosu
    Given kullanıcı giriş ekranındadır
    When kullanıcı sirket olarak  BİMSER ACADEMY seçtiğinde
    And kullanıcı doğru kullanıcı adını girdiğinde
    And Kullanıcı yanlış şifre girdiğinde
    And Kullanıcı Giriş butonunda tıkladığında
    Then Kullanıcı hatalı giriş mesajını görüntüler


  Scenario: Başarısız Giriş Senaryosu
    Given kullanıcı giriş ekranındadır
    When kullanıcı sirket olarak  BİMSER ACADEMY seçtiğinde
    And kullanıcı yanlış kullanıcı adını girdiğinde
    And Kullanıcı doğru şifre girdiğinde
    And Kullanıcı Giriş butonunda tıkladığında
    Then Kullanıcı hatalı giriş mesajını görüntüler





