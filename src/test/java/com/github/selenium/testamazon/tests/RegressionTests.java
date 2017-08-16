package com.github.selenium.testamazon.tests;

import com.github.selenium.testamazon.components.Helpers;
import com.github.selenium.testamazon.pageobjects.LoginPo;
import com.github.selenium.testamazon.pageobjects.Watchlist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by madhavareddy on 7/28/17.
 */
public class RegressionTests {
    public static WebDriver driver;
    //@BeforeClass
    @BeforeSuite
    public void rampUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        System.out.println("The test SUITE started....... ");
    }

    @Test //(groups = {"loginx"})
    // To verify the amazon site ligin function.
    public void testLoginPage() {
        LoginPo.loginlnk(driver).click();
        LoginPo.loginID(driver).sendKeys("ninjaqa1@gmail.com");
        LoginPo.loginPwd(driver).sendKeys("doublehelix123");
        LoginPo.loginBtn(driver).click();
        //Assert.assertTrue(Helpers.verifyTextPresent(driver, "madhavq"));
        Assert.assertEquals(true, driver.getPageSource().contains("madhavq"));
        //L∂oginPo.getMatchingElm(driver).click();
    }

    @Test (dependsOnMethods = "testLoginPage")
    // To verify the 'update' button element exist when clicked on update profile pic.
    public void testUpdateProfilePic() {
        String filePath = "/Users/madhavareddy/Downloads/uploadpic/JimRohn.jpg";
        File file = new File(filePath);
        String path = file.getAbsolutePath();
        System.out.println("Helloooo" + path);
        LoginPo.profilePicElm(driver).click();
        LoginPo.profilePicElm2(driver).click();
        //LoginPo.profilePicUploadElm(driver).click();
        Assert.assertEquals("Upload", LoginPo.profilePicUploadElm(driver).getText());
    }

    @Test (dependsOnMethods = "testUpdateProfilePic")
    //To Verify change country website feature.
    public void testChangeCountryWebSite()
    {
        LoginPo.countryListBtn(driver).click();
        LoginPo.cancelOnCountryBtn(driver).click();

    }

    @Test
    public void testCreateWatchList()
    {
        Helpers.mouseOver(driver, Watchlist.youWatchListLnk(driver));
        Helpers.getMatchingElm(driver,Watchlist.parentOfWatchListElm(driver)).click();
        LoginPo.loginID(driver).sendKeys("ninjaqa1@gmail.com");
        LoginPo.loginPwd(driver).sendKeys("doublehelix123");
        LoginPo.loginBtn(driver).click();
        //Watchlist.youWatchListLnk(driver).click();
        //// MMMMMMMMMMMMMMMMMMM Update as on 16 AUG 2017 at 3.14PM
    }

//     @AfterSuite
//     public void rampDown()
//     {
//     driver.quit();
//     }
}




