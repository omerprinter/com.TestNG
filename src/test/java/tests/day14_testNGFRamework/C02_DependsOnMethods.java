package tests.day14_testNGFRamework;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

public class C02_DependsOnMethods {

    @Test
    public void ilkTest(){
        System.out.println("Ilk test calisti");
        Assert.assertTrue(5>9);

    }
    @Test(dependsOnMethods = "ilkTest")
    public void ikinciTest(){
        System.out.println("ikinci test calisti");
    }
    @Test (dependsOnMethods = "ikinciTest")
    public void UcuncuTest(){
        System.out.println("ucuncu test calisti");
    }

}
