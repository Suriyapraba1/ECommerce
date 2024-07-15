package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    //Initialize Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='fld-e']")
    WebElement emailAdd;

    @FindBy(xpath = "//input[@id='fld-p1']")
    WebElement paWord;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickSignIn;

    @FindBy(xpath = "//button[text()='Skip for now']")
    WebElement LoginSkipNow;

    public void  setEmailAdd(String mailId){
        emailAdd.sendKeys(mailId);
    }
    public void setPaWord(String paWord1){
        paWord.sendKeys(paWord1);
    }
    public void setClickSignIn(){
        clickSignIn.click();
    }
    public void setLoginSkipNow(){
        LoginSkipNow.click();
    }

}
