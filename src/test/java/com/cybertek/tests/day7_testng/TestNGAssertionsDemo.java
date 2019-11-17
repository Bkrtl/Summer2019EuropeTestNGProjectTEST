package com.cybertek.tests.day7_testng;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

public class TestNGAssertionsDemo {

    @Test
    public void test1(){

        System.out.println("First Assertion");
        Assert.assertEquals(1, 23);

        System.out.println("Second Assertion");
        Assert.assertEquals("title", "titlE");

        System.out.println("after second assertion");
    }

    @Test
    public void test2(){
        //verify that title starts wıth C
        String actualTitle = "Cybertek";
        String expectedTitleBeginning ="B";

        System.out.println("first assertion");
        Assert.assertTrue(actualTitle.startsWith(expectedTitleBeginning), "Veriyf title starts with C");

        //verify that email includes @ sign
        Assert.assertTrue("yasin?mail".contains("@"), "verify @ in email");

    }

    @Test
    public  void test3(){

        Assert.assertNotEquals("one","two", "one should not be equal to two");
    }

    @Test
    public  void test4(){
        Assert.assertFalse(1<0);
    }
}
