package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 1. locate the dropdown element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        // 2. create select object by passing the element as a constructor
        Select stateList = new Select(dropdownElement);

        // getOptions() ---> returns all the available options from the dropdown list
        List<WebElement> options = stateList.getOptions();

        System.out.println(options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
    @Test
    public void test2() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        // 1. locate the dropdown element with unique locator
        WebElement dropdownElement = driver.findElement(By.id("state"));

        // 2. create select object by passing the element as a constructor
        Select stateList = new Select(dropdownElement);

        // verify that first option is "Select a State"
        String expectedOption = "Select a State";
        String actualOption = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption,"Verify that first selection is select a state");

        // How to select options from the dropdown
        // 1. Using visible text
        // selectByVisibleText("text") --> selecting based on the visible text
        Thread.sleep(5000);
        // selecting texas from the dropdown
        stateList.selectByVisibleText("Texas");
        actualOption = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,"Texas");

        // 2. Using index number
        //total option --> 52
        Thread.sleep(5000);
        stateList.selectByIndex(51);
        actualOption = stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,"Wyoming");

        // 3. Using value
        Thread.sleep(5000);
        stateList.selectByValue("VA");
        System.out.println(stateList.getFirstSelectedOption().getText());
    }
}
