package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElementTest {

    @Test
    public void Test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement greenButton = driver.findElement(By.id("green"));

        //how can we check that button is enabled or not?
        System.out.println("Is element enabled : " + greenButton.isEnabled());

        //verify that green button disabled
        Assert.assertFalse(greenButton.isEnabled(),"verify that green button is enabled");

        greenButton.click();
    }

    @Test
    public void Test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("#input-example>input"));

        System.out.println("is input enable : " + inputBox.isEnabled());

        inputBox.sendKeys("Mike Smith");
    }
}