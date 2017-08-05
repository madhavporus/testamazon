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


}
