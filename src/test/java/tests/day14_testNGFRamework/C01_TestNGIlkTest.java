package tests.day14_testNGFRamework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {
     /*
    TestNG test method'larını ısım sırasına gore calıştırır

    priotity degeri verilen method'lar priority degeri kuçukten büyüğe doğru çalışır.

    esit priority ler isim sirasina gore calisir.
    priority yazilmayan defaultmolarak 0 kabul edilir
     */
    @Test (priority = 6)
    public void ilkTest(){
        System.out.println("Ilk test calisti");
    }
    @Test
    public void ikinciTest(){
        System.out.println("ikinci test calisti");
    }
    @Test (priority = 9)
    public void UcuncuTest(){
        System.out.println("ucuncu test calisti");
    }
}
