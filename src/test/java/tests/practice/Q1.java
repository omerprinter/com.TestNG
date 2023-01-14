package tests.practice;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Objects;

public class Q1 {

    // Amazon anasayfaya gidip searchtext box'a
    // elma, armut, portakal aratalım
    @DataProvider
    public Object[][] aranacakKelimeler(){

        Object[][] kelime={{"elma"},{"armut"},{"portakal"}};

        return kelime;

    }


    @Test(dataProvider = "aranacakKelimeler")
    public void test01(String abc){
        ReusableMethods.bekle(3);

        //amazon'a gidin
        Driver.getDriver().get("https://www.amazon.com");

        // nutella aratin
        //  WebElement aramaKutusu =Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(abc + Keys.ENTER);
    }

    @DataProvider
    public Object[][] login(){

        Object[][] usernamePassword=new Object[3][2];

        usernamePassword[0][0]="gecerli username";
        usernamePassword[0][1]="gecersiz password";
        usernamePassword[1][0]="gecersiz username";
        usernamePassword[1][1]="gecerli password";
        usernamePassword[2][0]="gecersiz username";
        usernamePassword[2][1]="gecersiz username";

        return usernamePassword;

    }


}
