package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class LoginFailed extends BaseTest {
	
	@Test(description = "valid user + invalid password")
	@Description("fill in the fields avalid user and an invalid password")
	public void tc01_loginFailed1() {
		HomePage hp = new HomePage(driver);
		String Actual = hp.loginFailed("romario", "automation");
		String Expected = "Wrong password.";
		//String Actual = hp.wrongPassword();
		Assert.assertEquals(Actual, Expected);
	}
		
	@Test(description = "invalid user + valid password")
	@Description("fill in the fields with an invalid user and a valid password")
	public void tc02_loginFailed2() {
		//wrong user + valid password
		HomePage hp = new HomePage(driver);
		String Actual = hp.loginFailed("roma", "automation123");
		String Expected = "User does not exist.";
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(description = "invalid user + invalid password")
	@Description("fill in the field with an invalid user and an invalid password")
	public void tc03_loginFailed3() {
		//wrong user + wrong password
		HomePage hp = new HomePage(driver);
		String Actual = hp.loginFailed("roma", "auto#");
		String Expected = "User does not exist.";
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(description = "password only")
	@Description("leave the user field empty and fill only the password field with a valid password")
	public void tc04_loginFailed4() {
		HomePage hp = new HomePage(driver);
		String Actual = hp.loginFailed("", "automation123");
		String Expected = "Please fill out Username and Password.";
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(description = "user only")
	@Description("fill only the user field with a valid user and leave the password field empty")
	public void tc05_loginFailed5() {
		//fill username only
		HomePage hp = new HomePage(driver);
		String Actual = hp.loginFailed("romario", "");
		String Expected = "Please fill out Username and Password.";
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(description = "empty fields")
	@Description("leave all fields empty and click log-in")
	public void tc06_loginFailed6() {
		//dont fill anything
		HomePage hp = new HomePage(driver);
		String Actual = hp.loginFailed("", "");
		String Expected = "Please fill out Username and Password.";
		Assert.assertEquals(Actual, Expected);
	}
}
