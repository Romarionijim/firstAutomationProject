package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class SignUpTest extends BaseTest {
	
	@Test(description = "Sign-up with new user and password Test")
	@Description("click on sign-up and fill the fields with a new username and password")
	public void tc01_signUp() {
		HomePage hp = new HomePage(driver);
		String Actual = hp.signUp("newone2", "projectboy");
		String Expected = "Sign up successful.";
		Assert.assertEquals(Actual, Expected);
	}
}
