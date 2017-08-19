package com.github.selenium.testamazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by madhavareddy on 8/19/17.
 */
public class HomePo {

    public static WebElement element = null;

    //Below method identifies the profile pic button 1
    public static WebElement profilePicElm(WebDriver driver) {
        element = driver.findElement(By.className("hud-profile-image"));
        return element;
    }

    //Below method identifies the profile pic button 2
    public static WebElement profilePicElm2(WebDriver driver) throws NoSuchElementException {
        try {
            element = driver.findElement(By.id("avatar-image"));
        } catch (NoSuchElementException e) {
            System.out.println("Element \"profilePicElm2\" is not available " + e.toString());

            // After doing my work (Above line) of logging the exception, now i want to stop my test case
            throw (e);

        }
        return element;
    }

    // Method to identify the upload avatar tool tip element.
    public static WebElement profilePicUploadElm(WebDriver driver) throws NoSuchElementException {
        try {
            element = driver.findElement(By.cssSelector("[class=\'a-size-small a-color-base upload-photo\']"));
        } catch (NoSuchElementException e) {
            throw (e);
        }
        return element;
    }

    //Methods to identify the country list btn
    public static WebElement countryListBtn(WebDriver driver) throws NoSuchElementException {
        try {
            element = driver.findElement(By.id("icp-touch-link-country"));
        } catch (NoSuchElementException e) {
            System.out.println("Element from 'countryListBtn' is not matching" + e.toString());
            throw (e);
        }
        return element;
    }

    public static WebElement cancelOnCountryBtn(WebDriver driver) {
        element = driver.findElement(By.cssSelector("[class=\'a-button a-spacing-top-mini\']"));
        element = element.findElement(By.tagName("button"));
        return element;
    }
}
