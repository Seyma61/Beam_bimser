Feature: Tatil Günleri Menüsü
  @menu
  Scenario: Kullanıcı tatil günleri menüsüne ulaşır
    Given Kullanıcı sisteme giriş yapmış durumdadır
    When Kullanıcı (BEAM) SİSTEM YÖNETİCİSİ isimli seçeneği işaretler
    And Kullanıcı Devam butonuna tıklar
    And Kullanıcı Opsiyon tuşuna tıklar
    And Kullanıcı Sistem butonuna tıklar
    And Kullanıcı “Ortak Tanımlar” butonuna tıklar
    And Kullanıcı “Tatil Günleri” butonuna tıklar
    Then Kullanıcı başarılı bir şekilde  “Tatil Günleri” sayfasına yönlendirir

