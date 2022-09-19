package org.tyss.flipkart_webapplication_assingment;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.tyss.generic.BaseClass;
import org.tyss.pageobject.AddToCartPage;
import org.tyss.pageobject.CartPage;
import org.tyss.pageobject.HomePage;
import org.tyss.pageobject.ProductPage;
import org.tyss.pageobject.loginPageTest;

public class AddToCart extends BaseClass {

	@Test
	public void addToCart() throws InterruptedException  {

		//pom class object creation
		loginPageTest lgpg=new loginPageTest(driver);
		HomePage hppg=new HomePage(driver);
		ProductPage productPage=new ProductPage(driver);
		AddToCartPage addCart=new AddToCartPage(driver);
		CartPage cartPg=new CartPage(driver);

		lgpg.clickClosebutton();							//closing the login page
		hppg.enterText();									//entering the product name in search bar
		String actualdata = productPage.titleOfProduct();	//get the text of product
		System.out.println(actualdata);			
		productPage.clickOnFirstProduct();					//click on first product
		String pwh = webUtility.getParentWindowHandle();
		Set<String> allwh = webUtility.getWindowHandles();	

		for (String all : allwh) {
			driver.switchTo().window(all);

			if(all.equals(pwh)) {

			}
			else {
				addCart.clickAddToCart();

			}

		}


		addCart.clickCartBtn(webUtility,actualdata);
		String expected = cartPg.textOfCartedProduct();
		System.out.println(expected);
		Assert.assertEquals(actualdata, expected);
		System.out.println("yes the product is present in the cart");



	}

}
