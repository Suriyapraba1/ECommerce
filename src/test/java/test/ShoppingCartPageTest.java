package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class ShoppingCartPageTest extends baseTest {

    @Test(priority = 1)
    public void searchProduct() throws InterruptedException {

        //Sending input into search bar
        shoppingCartPage.setSearchBar("Hp Laptop");
        //Clicking search button
        shoppingCartPage.setSearchButton();
        //wait for search result to load
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-order='1']"))).click();
        //Scrolling to the item
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-sku-id='6571087']"))).click();
        js.executeScript("arguments[0].scrollIntoView(true);");
        Thread.sleep(5000);
        shoppingCartPage.setGoToCart();
    }
}

