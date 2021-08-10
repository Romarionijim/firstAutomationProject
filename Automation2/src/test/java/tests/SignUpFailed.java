package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class SignUpFailed extends BaseTest {

	@Test(description = "signing up with password only")
	@Description("click on sign-up and fill only the password field")
	public void tc01_SignUpNoPassword() {
		HomePage hp = new HomePage(driver);
		String Actual = hp.signUpFailed("automationman", "");
		String Expected = "Please fill out Username and Password.";
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(description = "signing up with username only")
	@Description("click on sign-up and fill only the username field")
	public void tc02_SignUpNoUser() {
		HomePage hp = new HomePage(driver);
		String Actual = hp.signUpFailed("", "password123");
		String Expected = "Please fill out Username and Password.";
		Assert.assertEquals(Actual, Expected);
	}
}
