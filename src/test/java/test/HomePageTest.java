package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.baseTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class HomePageTest extends baseTest {

    //Validating the URL
    @Test
    public void openWebTest(){
        String url = driver.getCurrentUrl();
        System.out.println("The current URL is: "+ url);
        Assert.assertEquals(url,"https://www.bestbuy.com/?intl=nosplash");
    }

    //Validating Broken URL
    @Test
    public void testBrokenLink() throws IOException {

        String url = driver.getCurrentUrl();
        URL urls = new URL(url);
        //Creating connections using URL object link
        HttpURLConnection httpURLConnection = (HttpURLConnection) urls.openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();

        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200 && responseCode < 400){
            System.out.println(url + "is valid. Response code: " + responseCode);
        }else {
            System.out.println(url + "is broken. Response Code:" + responseCode);
        }
    }


    //Validating the Title
    @Test
    public void validateTitle(){

        //Locate the menu Container
        List<WebElement> menuItems = homePage.getAllMenu();
        //Get the all the menu Item
        List<WebElement> items = driver.findElements(By.xpath("//ul[@class='hamburger-menu-flyout-list']"));
        for (WebElement item : menuItems){
            String itemName = item.getText();
            String expectedTitle = "Best Buy | Official Online Store | Shop Now & Save";
            item.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));

            String actualTitle = driver.getTitle();
            System.out.println("The Title of the page is:  "+ actualTitle);
            Assert.assertEquals(actualTitle,expectedTitle, "Title is empty for menu item: "+ itemName);
            driver.navigate().back();
        }
    }

    //Validating the BottomLink
    @Test
    public void bottomLink() throws InterruptedException {

        //Scrolling down to Add to cart
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);

        // List of bottom links to validate
        String[] bottomLinksText = {"Privacy Policy", "Terms and Conditions", "Interest-Based Ads"};

        List<WebElement> btmLink = homePage.getBottomLinks();
        for (WebElement btm : btmLink){
            String url = btm.getAttribute("href");
            //Check if the url is not empty and starts with HTTP (To exclude internal links like "#"
            if( url != null && !url.isEmpty() && url.startsWith("http")){
                driver.get(url);
            }

            //Wait
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));

            //Validating the title
            String title = driver.getTitle();
            Assert.assertNotNull(title, "Start Request - Best Buy" + url);
            System.out.println(title);

            driver.navigate().back();
            WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(2));

            //js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

        }
    }
}
