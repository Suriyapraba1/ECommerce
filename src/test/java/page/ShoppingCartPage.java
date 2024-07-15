package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
    WebDriver driver;
    //Initialize Constructor
    public  ShoppingCartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Search bar
    @FindBy(xpath = "//input[@id='gh-search-input']")
    WebElement SearchBar;

    //Search Button
    @FindBy(css = ".header-search-button")
    WebElement SearchButton;


    @FindBy(xpath = "//a[text()='Go to Cart']")
    WebElement GoToCart;


    public void setSearchBar(String inputSearchBar)
    {
        SearchBar.sendKeys(inputSearchBar);
    }

    public void setSearchButton()
    {
        SearchButton.click();
    }


    public void setGoToCart()
    {
        GoToCart.click();
    }
}
