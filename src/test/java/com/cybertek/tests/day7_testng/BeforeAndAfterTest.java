package com.cybertek.tests.day7_testng;

import org.testng.annotations.*;

public class BeforeAndAfterTest {

    @Test
    public void test1(){
        System.out.println("This is my test 1");

        // ----> beginning of the each test
        //webdriver code
        //open driver
        //maximize window

        //---->after each
        //close browser
    }

    // "@Ignore"    veya  "//@Test" yaparak ignore edebiliriz
    @Test
    public void test2(){
        System.out.println("This my test 2");
    }

    @Test
    public void test3(){
        System.out.println("This is my test 3 ");
    }

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("BEFORE METHOD");
        System.out.println("OPENING BROWSER");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("AFTER METHOD");
        System.out.println("CLOSE BROWSER");
    }

    @BeforeClass
    public  void beforeClass(){
        System.out.println("BEFORE CLASS CODE");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AFTER CLASS CODE");
        System.out.println("REPORTING");
    }
}
