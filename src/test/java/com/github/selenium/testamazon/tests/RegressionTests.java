package com.github.selenium.testamazon.tests;
import com.github.selenium.testamazon.components.Helpers;
import com.github.selenium.testamazon.components.RealTimeCustomReports;
import com.github.selenium.testamazon.pageobjects.LoginPo;
import com.github.selenium.testamazon.pageobjects.Watchlist;
import com.github.selenium.testamazon.pageobjects.CreateListPo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by madhavareddy on 7/28/17.
 */


@Listeners (RealTimeCustomReports.class)

public class RegressionTests {
    public static WebDriver driver;
    //public String listType = "Wish List";
    public String listType = "Idea List";
    //@BeforeClass
    @BeforeSuite
    public void rampUp() {
        driver = new ChromeDriver();
        Helpers.openAppInBrowser(driver,"https://www.amazon.com/");
    }

    @Test (priority = 0)//(groups = {"loginx"})
    // To verify the amazon site ligin function.
    public void testLoginPage() {
          LoginPo.loginAmazon(driver,"ninjaqa1@gmail.com","doublehelix123");
          Assert.assertEquals(true, driver.getPageSource().contains("madhavq"));
    }

    @Test (priority = 1)
    public void testCreateWatchList()
    {
        String listItemName = "Your Watchlist";
        String tagName = "span";
        //WebElement watchListElm = null;
        Helpers.mouseOver(driver, Watchlist.youWatchListLnk(driver));
        Helpers.getMatchingElmByTag(driver,Watchlist.parentOfWatchListElm(driver),tagName,listItemName).click();
        Assert.assertEquals(Watchlist.emptyWatchListElm(driver).getText(),"Your Watchlist is currently empty");
        //System.out.println("THE XD IS:"+xd);
    }

    @Test (priority = 2)
    public void testCreateList()
    {
      Helpers.mouseOver(driver, CreateListPo.accountsListsElm(driver));
      CreateListPo.createListElm(driver).click();
      CreateListPo.onCreateListPopUpWishListElm(driver, listType).click();
      CreateListPo.listNameOnCreateLitPopUpElm(driver).sendKeys("Thank Giving shopping list -maX");
      CreateListPo.createListBtnOnCreateListPopUpElm(driver).click();

    }

}



//     @AfterSuite
//     public void rampDown()
//     {
//     driver.quit();
//     }


//------------------------------------------
// Will improve the below 2 tests later
/**
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
 */


