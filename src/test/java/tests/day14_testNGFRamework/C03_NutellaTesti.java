package tests.day14_testNGFRamework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C03_NutellaTesti {

    @Test
    public void test01(){

        //amazon'a gidin
        Driver.getDriver().get("https://www.amazon.com");

        // nutella aratin
        WebElement aramaKutusu =Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // sonuclarin nutella icerdigini test edin
        WebElement aramaSonucuElementi=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expKelime="Nutella";
        String actAramaSonucu=aramaSonucuElementi.getText();
        Assert.assertTrue(actAramaSonucu.contains(expKelime));

        Driver.closeDriver();
    }
}
