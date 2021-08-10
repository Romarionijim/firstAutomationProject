package tests;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import pageobject.CartPage;
import pageobject.HomePage;
import pageobject.ProductPage;

public class PlaceOrderTest extends BaseTest {
	
	
	@Test(description = "add an item to cart and go to cart and checkout!")
	@Description("add an item to your cart and click on place order fill all the details and checkout")
	public void tc01_placeOrder() {
		//order item first
		HomePage hp = new HomePage(driver);
		hp.phoneButton("Phones");
		hp.chooseProductsFromCategories("Sony xperia z5");
		//after choosing add item to cart
		ProductPage pp = new ProductPage(driver);
		pp.addToCart();
		//click on the cart menu button to go to your cart
		hp = new HomePage(driver);
		hp.clickOnCart();
		//place order and checkout
		CartPage cp = new CartPage(driver);
		cp.placeOrder("mark", "spain", "ibiza", "51515151", "feb", "2021");
	}
}
