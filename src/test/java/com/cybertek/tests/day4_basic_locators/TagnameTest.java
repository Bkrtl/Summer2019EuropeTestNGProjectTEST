package com.cybertek.tests.day4_basic_locators;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagnameTest {

    public static void main(String[] args) {

        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        //navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");

        //enter full name
        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith");

        //enter email
        WebElement emailInput= driver.findElement(By.name("email"));
        emailInput.sendKeys("mikesmith@yahoo.com");

        WebElement signUpButton = driver.findElement(By.tagName("button"));
        signUpButton.click();

        //print the message using tagname locator
        WebElement messageElement= driver.findElement(By.tagName("h3"));
        String message = messageElement.getText();
        System.out.println(message);;

        // kısayol, one shot
        System.out.println(driver.findElement(By.tagName("h3")).getText());
    }


}


