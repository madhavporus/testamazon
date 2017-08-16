package com.github.selenium.testamazon.tests;

import com.github.selenium.testamazon.components.Helpers;
import com.github.selenium.testamazon.pageobjects.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by madhavareddy on 8/4/17.
 */
public class SmokeTests {
    public  static WebDriver driver;

    @Test
    public void checkListsPage()
    {

        Helpers.mouseOver(driver,LoginPo.listElm(driver));
        System.out.println("This is test from 'checkListsPage' method and class 'SmokeTests' ");
    }



}
