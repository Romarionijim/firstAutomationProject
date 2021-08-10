package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class LogoutTest extends BaseTest {
	
	@Test(description = "test logout button")
	@Description("sign in with your username and password and then press logout")
	public void tc01_LogOut() {
		//login first 
		HomePage hp = new HomePage(driver);
		hp.login("romario", "automation123");
		//logout
		hp.logOut();
	}
}
