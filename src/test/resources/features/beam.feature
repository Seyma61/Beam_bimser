
Feature:
  @Beam
  Scenario:
    Given Kullanıcı, BEAM uygulamasının ana  sayfasına giriş yapabilmeli
    When Kullanıcı, şirket ismini “BİMSER ACADEMY”seçebilmeli
    And Kullanıcı, kullanıcı adını girebilmeli
    And Kullanıcı, şifresini girebilmeli
    And Kullanıcı, giriş butonuna tıklayabilmeli
    And Kullanıcı “Devam” butonuna tıklayabilmeli
    And Kullanıcı, başarılı bir şekilde websitesine giriş yapmalı
    Then Kullanıcı "Çıkış"simgesine basabilmeli

Scenario:
  Given Kullanıcısı, BEAM uygulamasının ana  sayfasına giriş yapabilmeli
  When Kullanıcı, şirket İsmini “BİMSER ACADEMY”seçebilmeli
  And Kullanıcı, doğru kullanıcı adı girmeli
  And Kullanıcı yanlış şifre girmeli
  And Kullanıcı, giriş butonuna tıklayabilmeli
  And Kullanıcı hata uyarısı almalı
  Then Kullanıcı “Tamam” butonuna basabilmeli

  Scenario:
    Given Kullanıcı, yanlış kullanıcı adı girmeli
    When Kullanıcı doğru şifre girmeli
    And Kullanıcı, giriş butonuna tıklayabilmeli
    And Kullanıcı hata uyarısı almalı
    Then Kullanıcı “Tamam” butonuna basabilmeli


    Scenario:
    Given Kullanıcı yanlış kullanıcı adı yanlış şifre girmeli
    When Kullanıcı, giriş butonuna tıklayabilmeli
    And Kullanıcı hata uyarısı almalı
    Then Kullanıcı “Tamam” butonuna basabilmeli

    Scenario:
    Given Kullanıcı, doğru kullanıcı adı girmeli ve şifre butonunu boş bırakmalı
    When Kullanıcı, giriş butonuna tıklayabilmeli
    And Kullanıcı hata uyarısı almalı
    Then Kullanıcı “Tamam” butonuna basabilmeli

    Scenario:
    Given Kullanıcı doğru şifre girmeli ve kullanıcı adı butonunu boş bırakmalı
    When Kullanıcı, giriş butonuna tıklayabilmeli
    And Kullanıcı hata uyarısı almalı
    Then Kullanıcı “Tamam” butonuna basabilmeli


    Scenario:
    Given Kullanıcı, kullanıcı adı butonunu ve şifre butonunu boş bırakmalı
    When Kullanıcı, giriş butonuna tıklayabilmeli
    And Kullanıcı hata uyarısı almalı
    Then Kullanıcı “Tamam” butonuna basabilmeli

    Scenario:
    Given  Kullanıcı, şirket ismini “İİPEK” seçebilmeli
    When Kullanıcı, doğru kullanıcı adı girmeli
    And Kullanıcı doğru şifre girmeli
    And Kullanıcı, giriş butonuna tıklayabilmeli
    And Kullanıcı hata uyarısı almalı
    Then Kullanıcı “Tamam” butonuna basabilmeli


    Scenario:
    Given  Kullanıcı, şirket ismini “8” seçebilmeli
    When Kullanıcı, doğru kullanıcı adı  ve şifre girmeli
    And Kullanıcı, giriş butonuna tıklayabilmeli
    And Kullanıcı hata uyarısı almalı
    Then Kullanıcı “Tamam” butonuna basabilmeli


  Scenario Outline:
    Given  Kullanıcısı, BEAM uygulamasının ana  sayfasına giriş yapabilmeli
    When  Kullanıcı, şirket İsmini “BİMSER ACADEMY”seçebilmeli
    And Kullanıcı, kullanıcı adını girebilmeli
    And Kullanıcı, şifresini girebilmeli
    And Kullanıcı, giriş butonuna tıklayabilmeli
    And Kullanıcı, “(BEAM) SİSTEM YÖNETİCİSİ” isimli kutucuğu işaretleyebilmeli
    And Kullanıcı “Devam” butonuna tıklayabilmeli
    And Kullanıcı, başarılı bir şekilde websitesine giriş yapmalı
    And Kullanıcı Opsiyon tuşuna tıklayabilmeli
    And Kullanıcı “Sistem” butonuna tıklayabilmeli
    And Kullanıcı “Ortak Tanımlar” butonuna tıklayabilmeli
    And Kullanıcı “Tatil Günleri” butonuna tıklayabilmeli
    And Kullanıcı başarılı bir şekilde  “Tatil Günleri” sayfasına yönlendirilmeli
    And Kullanıcı “Tatil  Günü Girişleri” Kısmındaki butona tıklayabilmeli
    And Kuulanıcı “Kısım Bazında” butonunu seçebilmeli
    And Kullanıcı Haftanın Tüm Günlerini seçebilmeli
    Examples:
      | Haftanın Belirli Günleri |
      | Pazartesi                |
      | Salı                     |
      | Çarşamba                 |
      | Perşembe                 |
      | Cuma                     |
    And Kullanıcı “Kaydet” butonuna basabilmeli
    And Kullanıcı “Tatil Günleri Kaydedildi” mesajını almalı
    And Kullanıcı “Tamam” butonuna basabilmeli
    Then Seçilen günlerinin kaydedildiği doğrulanmalı

  Scenario Outline:

    Given Kullanıcı “Tatil  Günü Girişleri” Kısmındaki butona tıklayabilmeli
    When Kullanıcı “Sarfreyi Bazında” butonunu tıklayabilmeli
    And Kullanıcı "<Haftanın Belirli>" Günleri seçebilmeli.
    Examples:
      | Haftanın Belirli Günleri |
      | Pazartesi                |
      | Salı                     |
      | Çarşamba                 |
    And Kullanıcı "Tamam" butonuna basabilmeli
    Then Seçilen günlerin kaydedildiği doğrulanmalı