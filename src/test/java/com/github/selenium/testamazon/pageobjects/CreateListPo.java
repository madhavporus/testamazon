package com.github.selenium.testamazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;

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

   // Below method is to find a specific element from the list of elements having the same attributes like class name etc.
   // but with a different text in it. Actual Outer HTML: <h3 class="type-radio-contents">Wish List</h3>
   public static WebElement onCreateListPopUpWishListElm(WebDriver driver, String listType) throws NoSuchElementException
   //public static void onCreateListPopUpWishListElm(WebDriver driver) throws NoSuchElementException
   {
     String str;
     try
     {
       List<WebElement> elements = driver.findElements(By.cssSelector(".type-radio-contents"));
       Iterator<WebElement> itr = elements.iterator();
       while (itr.hasNext())
       {
           element = itr.next();
           str = element.getText();
           if (str.equalsIgnoreCase(listType))
           {
               System.out.println("THE STRING IS:::"+ str);
               break;  // When there is a match found, control exits here. hence the 'element'
           }
       }

     } catch (NoSuchElementException err)
     {
        System.out.println("No element matched:"+ err.toString());
     }
       return element;
   }

   public static WebElement listNameOnCreateLitPopUpElm(WebDriver driver)
   {
     element = driver.findElement(By.id("create-name-il"));
     return element;
   }

   public static WebElement createListBtnOnCreateListPopUpElm(WebDriver driver)
   {
       // Below one is by xpath. which is easy. just copied from chrome dev tools
      /* element = driver.findElement(By.xpath("//*[@id=\"a-popover-content-1\"]/form/div[2]/span[3]/span/span/input"));
       return element;*/

      //Below is by cssSelector.
       element = driver.findElement(By.cssSelector(".a-form-actions>.a-declarative:nth-child(3) input"));
       return element;


   }

} // Class ends
