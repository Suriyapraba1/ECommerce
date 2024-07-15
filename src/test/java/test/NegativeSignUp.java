package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeSignUp extends baseTest{

    @Test
    public void negativeSignUp() throws InterruptedException {

        //Clicking Account Button
        homePage.setAccount();

        Thread.sleep(2000);
        homePage.setCreateAccount();
        //Sending keys to create new account
        signUpPage.setFirstName("Suriya");
        signUpPage.setLastName("H");
        signUpPage.setEmail("suriya1234@test.com");
        signUpPage.setPassword("suriya@098");
        signUpPage.setReEnterPassword("suriya@098");
        signUpPage.setPhoneNumber("9080528708");
        signUpPage.setRecoverPhoneNum();
        signUpPage.setSubmit();
        //Getting error message
        WebElement error = driver.findElement(By.xpath("//strong[text()='An account with this email already exists.']"));
        Thread.sleep(5000);
        String actualErrorMessage =  error.getText();
        Assert.assertEquals(actualErrorMessage,"An account with this email already exists.");

    }
}
