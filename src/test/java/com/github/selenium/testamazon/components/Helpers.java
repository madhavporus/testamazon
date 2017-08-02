package com.github.selenium.testamazon.components;

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
import org.testng.annotations.Test;

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

}
