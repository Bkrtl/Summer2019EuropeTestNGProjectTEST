package com.cybertek.tests.day17_ddf;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

    @DataProvider
    public Object [][] testData(){
        String [][] data={
                {"Got", "9"},
                {"HIMYM", "9"},
                {"Friends", "10"},
                {"Person of Interest", "10"},
                {"Breaking Bad", "9"},
                {"Big Bang Theory", "9"},
                {"Chernobly", "9"},


        };
        return data;
    }

    //get the data from data provider and pass as and argument
    @Test(dataProvider = "testData")
    public void test1(String tvshow, String rating){ //---yukarıdaki sıralama ile uyumlu olmalı "GoT" "9"

        System.out.println("Tv show: " + tvshow+ "has rating " + rating);

    }
}
