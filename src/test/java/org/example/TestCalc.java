package org.example;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class TestCalc {
    @BeforeMethod
    public void before(){
        System.out.println("hello");
    }
    @Test
    public void testAdd(){
        Calc calc = new Calc();
        Assert.assertEquals(calc.add(1,2,3,4,5,6,7,8,9),43);
     //  Assert.assertNull(calc);
    }
    @AfterMethod
    public void after(){
        System.out.println("bie");
    }
    @Test(expectedExceptions = ArithmeticException.class)
    public void devZero(){
        int a=5/1;
    }


}
