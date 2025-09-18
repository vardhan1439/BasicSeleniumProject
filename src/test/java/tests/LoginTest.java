package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test
	public void testLoginMethod() {
		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.enterUserName("admin@yourstore.com");
		loginpage.enterPassWord("admin");
		loginpage.clickLoginButton();
		System.out.println("Logged in");
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		Assert.assertEquals(title, "Dashboard / nopCommerce administration");
		
	}

}
