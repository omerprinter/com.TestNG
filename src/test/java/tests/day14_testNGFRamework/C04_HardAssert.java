package tests.day14_testNGFRamework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C04_HardAssert {
    
    /*
    TestNG'de iki tane Assert class'ı vardır.
    1- JUnit'deki Assert class'ı ile aynı method'lara sahipdir.
    İlk FAILED olan Assert işleminde çalışmayı durdurur ve hata mesajı verir

    2.Assert class'ının adı SoftAssert oldugu ıcın ilkine HardAssert denmiştir.

    2- Assert Class'ı ise SoftAssert class'ıdır.
    SoftAssert biz raporla deyinceye kadar
    assertion'ları FAILED olsa  bile çalıştırmaya devam eder
    biz raporla dediğimizde çalışan assertion'lardan kaçının FAILED  olduğunu söyler
    ve FAILED olan assertion'  varsa raporla dedıgımız satırda calısmayı durdurur
     */

    @Test
    public void test01(){

        Assert.assertTrue(6>4);
        System.out.println("1. assertion sonrasi");
        Assert.assertTrue(6>14);
        System.out.println("2. assertion sonrasi");
        Assert.assertEquals(6,4);
        System.out.println("3. assertion sonrasi");

    }
}
