package tests.day15_SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class C04_NegativeLoginTesti {
    // 3 test metodu olusturun.
// 1. de yanlis e mail dogru sifre
//2.de dogru email yanlis sifre
// 3. yanlis email yanlis sifre ile giris yapmayi deneyin.
// giris yapilamadigini test edin

    QualitydemyPage qualitydemyPage=new QualitydemyPage();

    @Test
    public void yanlisEmailTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("mehmet@abc.com");
        qualitydemyPage.passwordKutusu.sendKeys("31488081");
        qualitydemyPage.loginButonu.click();
                Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
                Driver.closeDriver();

    }
    @Test
    public void yanlisPasswordTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("user_1106147@login.com");
        qualitydemyPage.passwordKutusu.sendKeys("11449081");
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void yanlisEmailPasswordTesti(){
        Driver.getDriver().get("https://www.qualitydemy.com/");
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys("mehmet@abc.com");
        qualitydemyPage.passwordKutusu.sendKeys("11449081");
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());
        Driver.closeDriver();

    }

}
