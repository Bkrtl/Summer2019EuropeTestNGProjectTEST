package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        //locate search box
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));

        //type selenium
        searchBox.sendKeys("selenium");

        Thread.sleep(3000);
        //locate search button
        WebElement searchButton=driver.findElement(By.xpath("//input[@value='Go']"));

        searchButton.click();

        String resultMessage = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();

        System.out.println(resultMessage);

    }
}
