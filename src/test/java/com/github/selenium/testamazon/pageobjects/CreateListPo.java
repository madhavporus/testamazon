package com.github.selenium.testamazon.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 * Created by madhavareddy on 8/4/17.
 */
public class CreateListPo {
   public static WebElement element = null;

   public static WebElement accountsListsElm() throws NoSuchElementException
   {
       try
       {
           element.findElement(By.id("nav-link-accountList"));
       }
       catch (NoSuchElementException e)
       {
           System.out.println("Element from 'accountsListsElm' is not found:"+ e.toString());
           throw (e);
       }
       return element;
   }

}
