package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTest extends baseTest {

    @Test
    public void validatePositiveSignUp() throws InterruptedException {

        //Clicking Account button
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
        signUpPage.setSkipNow();

        //Assertions to validate successful sign-up
        WebElement str = driver.findElement(By.xpath("//div[@class='welcome-wrapper--not-emphasized']"));
        str.getText();
        Assert.assertEquals(str, "Hi, Suriya. Welcome back.");
    }
}