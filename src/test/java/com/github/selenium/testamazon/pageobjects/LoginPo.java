package com.github.selenium.testamazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.IWebElement

import java.util.List;

/**
 * Created by madhavareddy on 7/28/17.
 */
public class LoginPo {
    public static WebElement element = null;


    //#1 Element
    public static WebElement loginlnk(WebDriver driver) throws NoSuchElementException {
        try {
            element = driver.findElement(By.id("nav-link-accountList"));
        } catch (NoSuchElementException e) {
            System.out.println("Test failed because:" + e.toString());
            throw (e);
        }
        return element;
    }

    //#2 Element - Login User Name
    public static WebElement loginID(WebDriver driver) {
        element = driver.findElement(By.cssSelector("[class=\'a-input-text a-span12 auth-autofocus auth-required-field\']"));
        return element;
    }

    // #3 Element - Login Password field
    public static WebElement loginPwd(WebDriver driver) {
        element = driver.findElement(By.name("password"));
        return element;
    }

    //#4 Element - Sign in button
    public static WebElement loginBtn(WebDriver driver) {
        element = driver.findElement(By.id("signInSubmit"));
        //element = driver.findElement(By.id("nav-link-accountList"));
        return element;
    }

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
    public static WebElement countryListBtn(WebDriver driver) throws NoSuchElementException
    {
        try {
            element = driver.findElement(By.id("icp-touch-link-country"));
        }
        catch (NoSuchElementException e)
        {
         System.out.println("Element from 'countryListBtn' is not matching"+e.toString());
         throw(e);
        }
        return element;
    }

    public static WebElement cancelOnCountryBtn(WebDriver driver)
    {
        element = driver.findElement(By.cssSelector("[class=\'a-button a-spacing-top-mini\']"));
        element = element.findElement(By.tagName("button"));
        return element;
    }

    public static WebElement listElm(WebDriver driver)
    {
        element = driver.findElement(By.id("nav-link-accountList"));
        return element;
    }




//    public static WebElement getMatchingElm(WebDriver driver)
//    {
//        System.out.println("N*******************************************:");
//        element = driver.findElement(By.id("nav-link-accountList"));
//
//        List<WebElement> elements = element.findElements(By.tagName("span"));
//        for(WebElement el: elements){
//            System.out.println("Names***:"+el.getText());
//            if (el.getText().contains("madhavq")){
//                System.out.println("Yes Text Exist*******************************************:");
//                element = el;
//            } else
//            {
//                System.out.println("No Text Does not Exist*******************************************:");
//            }
//        }
//
//     return element;
//
//    }
}
