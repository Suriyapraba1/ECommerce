package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginPageTest extends baseTest {

    @Test
    public void testLoginPage() throws InterruptedException {

        homePage.setAccount();
        Thread.sleep(2000);
        homePage.setSignIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setEmailAdd("suriya1234@test.com");
        loginPage.setPaWord("suriya@098");
        loginPage.setClickSignIn();
        loginPage.setLoginSkipNow();

        //Validating Assertion
        String str = driver.getTitle();
        System.out.println(str);
        Assert.assertEquals(str, "Best Buy | Official Online Store | Shop Now & Save ");
    }
}
