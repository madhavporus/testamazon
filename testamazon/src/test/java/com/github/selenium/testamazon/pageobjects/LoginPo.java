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



    public static WebElement listElm(WebDriver driver) {
        element = driver.findElement(By.id("nav-link-accountList"));
        return element;
    }

    public static void loginAmazon(WebDriver driver, String uid, String pwd)
    {
        loginlnk(driver).click();
        loginID(driver).sendKeys(uid);
        loginPwd(driver).sendKeys(pwd);
        loginBtn(driver).click();
    }

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
