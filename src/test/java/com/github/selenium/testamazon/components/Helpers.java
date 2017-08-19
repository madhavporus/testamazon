package com.github.selenium.testamazon.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.github.selenium.testamazon.pageobjects.*;
/**
 * Created by madhavareddy on 7/28/17.
 */
public class Helpers {
    //public static WebDriver driver;

    public static void openAppInBrowser(WebDriver driver, String appUrl)
    {
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get(appUrl);
        driver.manage().window().maximize();

    }
    public static boolean verifyTextPresent(WebDriver driver, String txt) {
        Boolean trueFalse;
        trueFalse = driver.getPageSource().contains(txt);
        return trueFalse;
        //*[@id="a-popover-content-3"]/div/div[1]/div/label/span
    }
    public static void mouseOver(WebDriver driver, WebElement element)
    {
        Actions builder = new Actions(driver);
        //WebElement element = driver.findElement(By.linkText("Put your text here"));
        //WebElement element = CreateListPo.accountsListsElm(driver)
        builder.moveToElement(element).build().perform();
    }

    public static WebElement getMatchingElmByTag(WebDriver driver, WebElement parentElement, String elementsTagName, String elementName )
    {
        //System.out.println("N*******************************************:");
        //element = driver.findElement(By.id("nav-link-accountList")); // Getting the parent element of the Tag ‘span’

        List<WebElement> elements = parentElement.findElements(By.tagName(elementsTagName)); // Using the parent, getting all Tags of ‘Span’
        for(WebElement el: elements){
            System.out.println("Names***:"+el.getText());
            if (el.getText().contains(elementName)){
                System.out.println("Yes Text Exist*******************************************:");
                parentElement = el;
            } else
            {
                System.out.println("No Text Does not Exist*******************************************:");
            }
        }

        return parentElement;

    }




}
