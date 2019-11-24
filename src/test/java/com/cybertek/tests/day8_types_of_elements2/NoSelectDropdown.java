package com.cybertek.tests.day8_types_of_elements2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NoSelectDropdown {



    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));

        // open the dropdown
        dropdownElement.click();

        List<WebElement> listOfLinks = driver.findElements(By.className("dropdown-item"));

        System.out.println("Number of links "+listOfLinks.size());

        //text of first or another elements in the list
        System.out.println(listOfLinks.get(0).getText());
        System.out.println(listOfLinks.get(2).getText());

        //print text of each link
        for (WebElement link : listOfLinks) {
            System.out.println("The link is : " + link.getText());
        }

        //locate the element and clicking
        driver.findElement(By.linkText("Yahoo")).click();

        //index of the list and click
        //listOfLinks.get(3).click();

        // son ikisi aynı işlevi görmekte, birisini normal driver ile yapıyoruz, diğerini index ile
    }
}
