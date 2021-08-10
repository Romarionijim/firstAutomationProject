package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class LoginSucceed extends BaseTest {
		
	@Test(description = "login successful")
	@Description("login with a valid user and a valid password")
	public void tc01_loginTest() {
		HomePage hp = new HomePage(driver);
		hp.login("romario", "automation123");
	}
}
