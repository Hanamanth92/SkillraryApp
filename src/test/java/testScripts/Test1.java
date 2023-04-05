package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibrary.BaseClass;

public class Test1 extends BaseClass

{

	@Test
	public void test1()
	{
		SoftAssert soft=new SoftAssert();
		
		home.clickGearsTab();
		home.clickskillraryDemoApp();
		web.handleChildBrowser();
		soft.assertEquals(demoApp.getPageHeader(), "Skillrary-ECommerce");
		
		demoApp.mouseHoverToCourse(web);
		demoApp.clickSeleniumTraining();
		
		soft.assertEquals(selenium.getPageHeader(), "Selenium Training");
		selenium.doubleClickAdd(web);
		selenium.clickAddToCart();
		
		web.handleAlert("ok");
		soft.assertEquals(selenium.getPageHeader() ,"Item added to cart");
		
		
		soft.assertAll();
	}
}
