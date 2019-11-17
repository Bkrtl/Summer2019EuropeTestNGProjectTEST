package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void radioButton(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        WebElement redRadioButton = driver.findElement(By.id("red"));

        //How to check radio button selected or not?
        System.out.println("Is blue selected : " + blueRadioButton.isSelected());
        System.out.println("Is red selected : " + redRadioButton.isSelected());

        //verify that blue radio button selected
        Assert.assertTrue(blueRadioButton.isSelected(), "verify that blue button is selected");

        //verify that red radio button not selected?
        Assert.assertFalse(redRadioButton.isSelected(),"verify that button not selected");

        //how to select radio button?
        System.out.println("Clicking red radio button");
        redRadioButton.click();

        System.out.println("Is blue selected : " + blueRadioButton.isSelected());
        System.out.println("Is red selected : " + redRadioButton.isSelected());

        //verify blue is not selected
        Assert.assertFalse(blueRadioButton.isSelected(), "verify that blue button not selected");

        //verify red is selected
        Assert.assertTrue(redRadioButton.isSelected(), "verify that red button selected");

        //driver.quit();
    }
}
