package com.cybertek.tests.dayX_specific_classes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StaleElementReferenceException {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void StaleTest(){
        driver.get("http://google.com");
        WebElement input=driver.findElement(By.name("q"));
        input.sendKeys("Selenium" + Keys.ENTER);

        //go to google again
        driver.navigate().back();

        input=driver.findElement(By.name("q")); //stale engellemek için tekrar find element yapmalıyız
        input.sendKeys("Java" + Keys.ENTER);
    }
}
