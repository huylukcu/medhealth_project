Feature: US023 Kullanici Staff rolu ile fatura olusturup dogrulayabilmeli

  Background:

    Given kullanici medunna anasayfasina gider

  Scenario: US023-TC001 Kullanici Hasta olarak randevu olusturur
    And kullanici hasta rolu ile oturum acar
    Then kullanici hasta mypage acilir butonuna tiklar
    And kullanici make an appointment butonuna tiklar
    And kullanici randevu bilgilerini doldurur
    And kullanici send an appointment butonunu tiklar

  Scenario: US023-TC002 Kullanici Staff rolu ile olusturulan randevuyu onaylar
    And kullanici staff rolu ile oturum acar
    Then kullanici staff mypage acilir butonuna tiklar
    And kullanici search patient butonuna tiklar
    Then kullanici patient SSN bolumune "426-64-2470" nolu SSN no girer
    And kullanici show appointments butonuna tiklar
    And kullanici alinan randevunun edit butonuna tiklar
    And kullanici status bolumune pending secenegini secer
    And kullanici Physician bolumune "154299:Doktor Team50:PATHOLOGY" ID nolu doktor atamasini yapar
    And kullanici save butonuna tiklar

  Scenario: US023-TC003 Kullanici Doktor rolu ile atanan randevunun islemlerini tamamlar
    And kullanici doktor rolu ile oturum acar
    Then kullanici doktor mypage acilir butonuna tiklar
    And kullanici my appointments butonuna tiklar
    And kullanici atanan randevunun edit butonuna tiklar
    Then kullanici Request A Test butonuna tiklar
    And kullanici cccs, Sodium ve Urea testlerini secer
    And kullanici test bolumu save butonuna tiklar
    Then kullanici status kutusundan completed secenegini secer
    And kullanici anamneis, treatment, diagnosis kutularini doldurur
    And kullanici create bolumu save butonuna tiklar

  Scenario: US023-TC004 kullanici Staff rolu ile islemleri tamamlanan hastaya fatura olusturur
    And kullanici staff rolu ile oturum acar
    Then kullanici staff mypage acilir butonuna tiklar
    And kullanici search patient butonuna tiklar
    Then kullanici patient SSN bolumune "426-64-2470" nolu SSN no girer
    And kullanici show appointments butonuna tiklar
    Then kullanici fatura icin hastanin payment butonuna tiklar
    And kullanici create invoice butonuna tiklar
    And kullanici create or edit sayfasinda save butonuna tiklar
    Then kullanici patient SSN bolumune "426-64-2470" nolu SSN no girer
    And kullanici show appointments butonuna tiklar
    Then kullanici fatura icin hastanin payment butonuna tiklar
    And kullanici show invoice butonuna tiklar
    And kullanici faturanin olustugunu dogrular
  @tumu
  Feature: US_24 My Appointments (Randevular) (Patient)

  Scenario: US_24 TC01 Test sonuclari
    Given ZH Hasta medunna adresi gider
    And ZH Hasta Sign in1 butonuna tiklar
    And ZH Hasta username ve sifresini girer
    And ZH Hasta My Pages butonuna tiklar
    And ZH Kullanici My Appointments butonuna tiklar
    And ZH Kullanici gecerli bir tarih girer
    And ZH Kullanici Show Tests butonuna tiklar
    Then ZH Kullanici View Results butonuna tiklar
    And ZH Kullanici acilan sayfada kan tahlili bolumlerinin gorunur oldugunu test eder

  Scenario: US24 TC02 My Appointments Recete Bilgisi
    Given ZH Hasta medunna adresi gider
    And ZH Hasta Sign in1 butonuna tiklar
    And ZH Hasta username ve sifresini girer
    And ZH Hasta My Pages butonuna tiklar
    And ZH Kullanici My Appointments butonuna tiklar
    Then ZH Kullanici gecerli bir tarih girer
    And ZH Kullanici Show Invoice butonuna tiklar
    And ZH Kullanici Invoice'in gorunur oldugunu test eder


  Scenario: US25_TC01 My Appointments by Patient in the account
    Given ZH Hasta medunna adresi gider
    And ZH Kullanici Make an Appointment butonuna tiklar
    And ZH Kullanici gerekli bilgileri girer
    Then ZH Kullanici Send an Appointment Request butonuna tiklar



  Scenario: US26_TC01 İletişim Mesajı (Contact messages)
    Given ZH Hasta medunna adresi gider
    And ZH Hasta content butonuna tiklar
    And ZH Kullanici mesaj icin gerekli olan name kutucugu doldurur
    And ZH Kullanici mesaj icin gerekli olan email kutucugu doldurur
    And ZH Kullanici mesaj icin gerekli olan Subject kutucugu doldurur
    And ZH Kullanici mesaj icin gerekli olan Message kutucugu doldurur
    Then ZH Kullanici Send butonuna taklar
    Then ZH Kullanici sayfayi kapatir