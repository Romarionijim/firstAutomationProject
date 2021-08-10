package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;

public class SlideImagesTest extends BaseTest {

	@Test(description = "slide to the right side of the center page")
	@Description("on the images in the center of the homepage click on the right slide button 3 times")
	public void tc01_slidePicsToRight() {
		HomePage hp = new HomePage(driver);
		hp.centerRightSlideImages();
	}
	
	@Test(description = "slide to the left side of the center page")
	@Description("on the images in the center of the homepage click on the left slide button 3 times")
	public void tc02_slidePicsToLeft() {
		HomePage hp = new HomePage(driver);
		hp.centerLeftSlideImages();
	}
}
