package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.CartPage;
import pageobject.HomePage;

public class PlaceOrderNoProduct extends BaseTest {
	
	
		@Test(description = "checkout without a product in the cart")
		@Description("click on cart and then click on place order and checkout without a prodcut in the cart")
		public void tc01_OrderNoProduct() {
			//go to cart and checkout without a product
			HomePage hp = new HomePage(driver);
			hp.clickOnCart();
			//test to see if i can checkout without buying item
			CartPage cp = new CartPage(driver);
			cp.placeOrder("mike", "usa", "chicago", "54545454", "feb", "2021");
		}
}
