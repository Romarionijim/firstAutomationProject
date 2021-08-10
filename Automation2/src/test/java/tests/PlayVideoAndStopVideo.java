package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class PlayVideoAndStopVideo extends BaseTest {
	
	@Test(description = "play and stop video")
	@Description("click on about us button , play the video , enter full screen, exit full screen, pause the video and close")
	public void tc01_playAndStopVideo() {
		HomePage h = new HomePage(driver);
		h.aboutUsButton();
	}

	@Test
	public void tc02_loginFailed2() {
		//wrong user + valid password
		HomePage hp = new HomePage(driver);
		hp.loginFailed("rom", "automation123");
	}
}
