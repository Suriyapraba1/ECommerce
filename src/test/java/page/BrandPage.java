package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class BrandPage {
    WebDriver driver;

    public BrandPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
    List<WebElement> BrandAllMenu;

    @FindBy(xpath = "//button[@data-id='node-83']")
    List<WebElement> BrandButton;

    @FindBy(xpath = "//a[text()='Samsung']")
    WebElement BrandSamsung;

    @FindBy(xpath = "//a[text()='Galaxy smartphones']")
    WebElement SmartPhone;

    @FindBy(xpath = "//a[text()='Shop Galaxy S24 Ultra']")
    WebElement GalaxyUltra;

    @FindBy(xpath = "//button[@data-sku-id='6570299']")
    WebElement BrandCart;

    @FindBy(xpath = "//a[text()='Go to Cart']")
    WebElement BrandGoToCart;

    public List<WebElement> getBrandAllMenu(){
        return BrandAllMenu;
    }

    public List<WebElement> getBrandButton(){
        return BrandButton;
    }

    public void setBrandSamsung(){
        BrandSamsung.click();
    }

    public void setSmartPhone(WebDriverWait wait){
        SmartPhone.click();
    }

    public void setGalaxyUltra(){
        GalaxyUltra.click();
    }

    public void setBrandCart(){
        BrandCart.click();
    }

    public void setBrandGoToCartCart(){
        BrandGoToCart.click();
    }

}
