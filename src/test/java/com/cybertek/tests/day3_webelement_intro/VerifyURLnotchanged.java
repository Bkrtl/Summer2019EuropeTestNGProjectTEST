package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotchanged {

    /* Verify URL not changed
    *open chrome
    *go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
    *click on Retrieve password
    *verify that url did not change
    */

    public static void main(String[] args) {

        //Open chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //go to http://practice.cybertekschool.com/forgot_passwordLinks to an external site.
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //save url to string variable
        String expectedURL= driver.getCurrentUrl();

        //click on Retrieve password
        //WebElement--->class that represents elements on the webpage
        //findElement--->method used to find element on a page
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        //click()--->clicking web element
        retrievePasswordButton.click();

        //save url after clicking button
        String actualURL= driver.getCurrentUrl();

        //verify that url is not change
        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualURL = " +actualURL);
        }

        //close the browser
        driver.quit();

    }
}
