package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

    WebDriver driver;
    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Checkout
    @FindBy(xpath = "/button[text()='Checkout']")
    WebElement Checkout;

    @FindBy(xpath = "//button[text()='Continue as Guest']")
    WebElement ContinueAsGuest;

    @FindBy(xpath = "//button[text()='Switch to pickup']")
    WebElement SwitchToPickup;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement FirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement LastName;

    @FindBy(xpath = "//input[@id='street']")
    WebElement Address;

    @FindBy(xpath = "//input[@id='city']")
    WebElement City;

    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement ZipCode;

    @FindBy(xpath = "//input[@id='save-for-billing-address-Map {}']")
    WebElement SaveAddress;

    @FindBy(xpath = "//span[text()='Apply']")
    WebElement Apply;

    @FindBy(xpath = "//span[text()='Keep Address as Entered']")
    WebElement KeepAddressEntered;

    @FindBy(xpath = "//input[@id='user.emailAddress']")
    WebElement EmailAddress;

    @FindBy(xpath = "//input[@id='user.phone']")
    WebElement MobileNumber;

    @FindBy(xpath = "//input[@id='text-updates']")
    WebElement CheckBox;

    @FindBy(xpath = "//span[text()='Continue to Payment Information']")
    WebElement PaymentInformation;

    @FindBy(xpath = "//input[@id='number']")
    WebElement CardNumber;

    @FindBy(xpath = "//input[@id='expirationDate']")
    WebElement ExpiryDate;

    @FindBy(xpath = "//input[@id='cvv']")
    WebElement CvvNumber;

    @FindBy(xpath = "//span[text()='Place Your Order']")
    WebElement PlaceOrder;

    public void setCheckout()
    {
        Checkout.click();
    }

    public void setContinueAsGuest()
    {
        ContinueAsGuest.click();
    }

    public void setSwitchToPickup()
    {
        SwitchToPickup.click();
    }

    public void setFirstName(String fName)
    {
        FirstName.sendKeys(fName);
    }

    public void setLastName(String lName)
    {
        LastName.sendKeys(lName);
    }

    public void setAddress(String homeAdd)
    {
        Address.sendKeys(homeAdd);
    }

    public void setCity(String city)
    {
        City.sendKeys(city);
    }


    public void setZipCode(String pinCode)
    {
        ZipCode.sendKeys(pinCode);
    }

    public void setSaveAddress()
    {
        SaveAddress.click();
    }

    public void setKeepAddressEntered()
    {
        KeepAddressEntered.click();
    }
    public void setEmailAddress(String mailId)
    {
        EmailAddress.sendKeys(mailId);
    }

    public void setMobileNumber(String phoneNum)
    {
        MobileNumber.sendKeys(phoneNum);
    }

    public void setCheckBox()
    {
        CheckBox.click();
    }

    public void setPaymentInformation()
    {
        PaymentInformation.click();
    }

    public void setCardNumber(String cardNum)
    {
        CardNumber.sendKeys(cardNum);
    }

    public void setExpiryDate(String validityDate)
    {
        ExpiryDate.sendKeys(validityDate);
    }

    public void setCvvNumber(String cvv)
    {
        CvvNumber.sendKeys(cvv);
    }

    public void setApply()
    {
        Apply.click();
    }

    public void setPlaceOrder()
    {
        PlaceOrder.click();
    }
}
