package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.CartPage;
import pageobject.HomePage;
import pageobject.ProductPage;

public class PlaceOrderWithOutFillingForm extends BaseTest {

	
	@Test(description = "checkout without fillin the checkout form")
	@Description("after adding an item to the cart place order without filling details in the checkout form")
	public void tc01_placeOrderWithoutDetails() {
		//order item first
		//expected results didn't meet with actual results
		HomePage hp = new HomePage(driver);
		hp.phoneButton("Phones");
		hp.chooseProductsFromCategories("Samsung galaxy s6");
		//after choosing add item to cart
		ProductPage pp = new ProductPage(driver);
		pp.addToCart();
		//click on the cart menu button to go to your cart
		hp = new HomePage(driver);
		hp.clickOnCart();
		//place order and checkout without filling any details
		CartPage cp = new CartPage(driver);
		String Actual = cp.placeOrderNoDetails("", "", "", "", "", "");
		String Expected = "all fields are required";
		Assert.assertEquals(Actual, Expected);
	}

	//fill your name and your card only! without the rest of the details
	@Test
	public void tc02_OrderWithNameAndCardOnly() {
		//check out and fill only your name and credit card num
		CartPage cp = new CartPage(driver);
		cp.placeOrder("tom", "", "", "551515151", "", "");
	}
}
