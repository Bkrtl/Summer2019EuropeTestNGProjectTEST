package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class IdLocatorTest {

    public static void main(String[] args) {


        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //maximize the browser
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //click the "Don't click!" button
        WebElement dontClickButton=driver.findElement(By.id("disappearing_button"));

        //clicking button
        dontClickButton.click();

        //close browser
        driver.quit();

    }
}
