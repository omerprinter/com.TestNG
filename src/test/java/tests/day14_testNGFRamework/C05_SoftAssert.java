package tests.day14_testNGFRamework;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssert {

    @Test
    public void test01(){

        // 1. adim softAssert objesi olurtur
        SoftAssert softAssert=new SoftAssert();

        // 2. adim objeyi kullanarak istenen assertion' lari yapin
        softAssert.assertEquals(6,8);  // Failed
        System.out.println("1. assertion sonrasi");

        softAssert.assertTrue(5>3);  // Passed
        System.out.println("2. assertion sonrasi");

        softAssert.assertFalse(8>5);  // Failed
        System.out.println("3. assertion sonrasi");

        // 3. adim softassert e raporla diyelim
        softAssert.assertAll();  // bu satirda calisma durur, cunku failed olan assertion var
        System.out.println("assertAll sonrasi");

         /*
        1- Driver Class : Oluşturacagımız Framework'de webDriver'i Driver class'ındaki getDriver()
        method'undan alacagız.Driver class'ını biraz daha geliştireceğiz .Farklı browser'larla calısabılır
        hale gelecek
        2- Page Class : Surekli kullandıgımız Locate ıslemlerini ve Logın gibi basit işlevleri yapacak
        method'ları Page class'ında olusturacagız.
        3- Bir Page class'ı olusturur olusturmaz ilk yapmamız gereken sey, parametresiz bir Constructor olusturup,içinde
        PageFactory.initElements(webdriver,this) ile driver'a page sayfasında ilk değer atamasını yapmak olmalıdır.
        4- Assertion : TestNG'de 2 assertion yontemi vardır.
            - Hard Assert : JUnit'deki assert ile aynı method'lara sahiptir . İlk FAILED olan assertion'da
            çalışmayı durdurur ve rapor verir.
            - Soft Assert : Biz raporla diyene kadar assertion'lar FAILED olsa bile çalışmaya devam eder .assertAll() ile
            raporlamasını ıstedıgımızde failed olan  assertion varsa raporlar ve çalışmayı durdurur.

         5- Genelte "test edin" dendiğinde hard assert , doğrulayın(verify) denirse soft assert kullanılır.
         */

    }
}
