package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.HomePage;
import pageobject.ProductPage;

public class ChooseProductTest extends BaseTest {
	
	//choose product and add to cart
	@Test(description = "choose a product and add to cart")
	@Description("click on any product you want in the homepage and add the prodcut to your cart")
	public void tc01_chooseProduct() {
		HomePage hp = new HomePage(driver);
		hp.phoneButton("Phones");
		hp.chooseProductsFromCategories("HTC One M9");
		//after choosing add item to cart
		ProductPage pp = new ProductPage(driver);
		String Actual = pp.addToCart();
		String Expected = "Product added";
		Assert.assertEquals(Actual, Expected);
	}
}
