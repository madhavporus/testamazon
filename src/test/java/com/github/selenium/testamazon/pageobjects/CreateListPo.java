package com.github.selenium.testamazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by madhavareddy on 8/4/17.
 */
public class CreateListPo {
   public static WebElement element = null;

   public static WebElement accountsListsElm(WebDriver driver) throws NoSuchElementException
   {
       try
       {
           element = driver.findElement(By.id("nav-link-accountList"));
       }
       catch (NoSuchElementException e)
       {
           System.out.println("Element from 'accountsListsElm' is not found:"+ e.toString());
           throw (e);
       }
       return element;
   }

   public static WebElement createListElm(WebDriver driver) throws NoSuchElementException
   {
     try
     {
       By by = By.xpath("//span[text()='Create a List']");
       element = driver.findElement(by);
     }
     catch(NoSuchElementException err)
     {
        System.out.println("Element with name Create a List is not found:"+ err.toString());
     }
     return element;
   }

   public static WebElement onCreateListPopUpWishListElm(WebDriver driver) throws NoSuchElementException
   {
     try
     {
       var elements = driver.findElements(By.cssSelector(".type-radio-contents"));

     } catch (NoSuchElementException err)
     {

     }
   }
}
