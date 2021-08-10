package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class SignUpExistingUser extends BaseTest {
	
	@Test(description = "testing to see if we can re-sign with an existing user")
	@Description("click on sign-up and fill the field with an existing username and password")
	public void tc01_ExistingUserSignUp() {
		HomePage hp = new HomePage(driver);
		String Actual = hp.signUpFailed("romario", "automation123");
		String Expected = "This user already exist.";
		Assert.assertEquals(Actual, Expected);
	}
}
