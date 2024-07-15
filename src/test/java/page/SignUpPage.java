package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
    WebDriver driver;
    //Installing constructor
    public SignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver ,this);
    }
    //FirstName
    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstName;
    //LastName
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;
    //Email
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    //Password
    @FindBy(xpath = "//input[@id='fld-p1']")
    WebElement password;
    //Re-enter Password
    @FindBy(xpath = "//input[@id='reenterPassword']")
    WebElement reEnterPassword;
    //Mobile Number
    @FindBy(xpath = "//input[@id='phone']")
    WebElement phoneNumber;
    //Re-cover Phone Number
    @FindBy(xpath = "//input[@id='is-recovery-phone']")
    WebElement recoverPhoneNum;
    //Submit button
    @FindBy(xpath = "//button[text()='Create an Account']")
    WebElement submit;
    //Skip Now
    @FindBy(xpath = "//button[text()='Skip for now']")
    WebElement SkipNow;


    public void setFirstName(String fName)
    {
        firstName.sendKeys(fName);
    }
    public void setLastName(String lName)
    {
        lastName.sendKeys(lName);
    }
    public void setEmail(String email1)
    {
        email.sendKeys(email1);
    }
    public void setPassword(String pwd)
    {
        password.sendKeys(pwd);
    }
    public void setReEnterPassword(String reEnterPassword1)
    {
        reEnterPassword.sendKeys(reEnterPassword1);
    }
    public void setPhoneNumber(String mobileNumber)
    {
        phoneNumber.sendKeys(mobileNumber);
    }
    public void setRecoverPhoneNum()
    {
        recoverPhoneNum.click();
    }
    public void setSubmit()
    {
        submit.click();
    }
    public void setSkipNow()
    {
        SkipNow.click();
    }

}
