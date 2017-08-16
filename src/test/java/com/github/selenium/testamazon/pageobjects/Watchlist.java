package com.github.selenium.testamazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by madhavareddy on 8/16/17.
 */
public class Watchlist {
    public static WebElement element = null;

    public static WebElement youWatchListLnk(WebDriver driver)
    {
       element =  driver.findElement(By.id("nav-link-accountList"));
       return element;
    }

    public static WebElement parentOfWatchListElm(WebDriver driver)
    {
        element = driver.findElement(By.id("nav-al-your-account"));
        return element;
    }
}
