package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class HomePage {
    WebDriver driver;
    //Initialize Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Top Deals']")
    WebElement TopDeal;

    @FindBy(xpath ="//a[text()='Deal of the Day']")
    WebElement DealOfTheDay;

    @FindBy(xpath = "//a[text()='Yes, Best Buy Sells That']")
    WebElement YesBestBuySellsThat;

    @FindBy(xpath = "//span[text()='Account']")
    WebElement Account;

    @FindBy(xpath = "//a[text()='Sign In']")
    WebElement SignIn;

    @FindBy(xpath = "//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
    WebElement CreateAccount;

    @FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
    List<WebElement> AllMenu;

    @FindBy(xpath = "//div[@class='flex justify-content-start']")
    List<WebElement> BottomLinks;

    public void getTextTopDeal()
    {
        TopDeal.getText();
    }

    public void textDealOfTheDay()
    {
        DealOfTheDay.getText();
    }

    public void bestButSell()
    {
        YesBestBuySellsThat.click();
    }
    public void setAccount()
    {
        Account.click();
    }

    public void setSignIn()
    {
        SignIn.click();
    }

    public void setCreateAccount()
    {
        CreateAccount.click();
    }


    public List<WebElement> getAllMenu()
    {
        return AllMenu;
    }

    public List<WebElement> getBottomLinks()
    {
        return BottomLinks;
    }

}
