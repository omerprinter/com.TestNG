package tests.day15;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;

public class C01_SoftAssert {

    @Test
    public void test01(){

        //amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");

        // amazon anasayfaya gittiğini doğrulayın
        SoftAssert softAssert=new SoftAssert();
        String expUrlKelime="amazon";
        String actUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actUrl.contains(expUrlKelime),"Url amazon icermiyor");

        // Nutella aratın
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //arama sonuclarının nutella içerdiğini doğrulayın
        String aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        softAssert.assertTrue(aramaSonucYazisi.contains("Nutella"),"Arama sonuclari nutella icermiyor.");

        //Java aratın
        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);

        ReusableMethods.bekle(10);

        //arama sonuclarının 1000'den fazla oldugunu dogrulayın
        System.out.println(amazonPage.aramaSonucuElementi.getText());

        aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        String[] sonucArr=aramaSonucYazisi.split(" ");
        System.out.println(Arrays.toString(sonucArr));

        String javaSonucSayisiStr=sonucArr[3];
        javaSonucSayisiStr=javaSonucSayisiStr.replaceAll("\\W","");

        int sonucSayisiInt=Integer.parseInt(javaSonucSayisiStr);

        softAssert.assertTrue(sonucSayisiInt>1000,"Java icin arama sayisi 1000'den cok degil");

        softAssert.assertAll();
        Driver.closeDriver();
    }
}











