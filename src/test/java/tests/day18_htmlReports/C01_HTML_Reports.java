package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_HTML_Reports extends TestBaseRapor {

    @Test
    public void test01(){

        extentTest=extentReports.createTest("Nutella testi","Kullanıcı amazonda nutella arayabilmeli");

        // amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon anasayfaya gidildi");

        // nutella aratalım
        AmazonPage amazonPage=new AmazonPage();
        extentTest.info("Arama kutusuna nutella yazip arama yapildi");

        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // sonucların nutella icerdigini test edelim.
        String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        String expectedKelime="Nutella";
        extentTest.info("Arama sonuclari kaydedildi");

        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));
        extentTest.pass("Arama sonuclarinin Nutella icerdigi test edildi");
    }
}
