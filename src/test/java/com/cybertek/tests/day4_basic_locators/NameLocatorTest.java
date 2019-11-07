package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {

        //open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        //navigate to website
        driver.get("http://practice.cybertekschool.com/sign_up");

        //enter full name
        WebElement fullNameInput = driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        //enter email
        WebElement emailInput= driver.findElement(By.name("email"));
        emailInput.sendKeys("mikesmith@yahoo.com");

        //clicking sign up button
        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        //verify that you got "Thank you for signing up. Click the button below to return to the home page."

        WebElement messageElement =driver.findElement(By.name("signup_message"));

        //expected message
        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";

        //actual message
        String actualMessage = messageElement.getText();

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected message = " + expectedMessage);
            System.out.println("actual message = " + actualMessage);
        }

        //close the browser
        driver.quit();
    }
}
