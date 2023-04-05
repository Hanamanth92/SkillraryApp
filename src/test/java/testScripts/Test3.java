package testScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibrary.BaseClass;

public class Test3 extends BaseClass
{
	@Test
	public void test3()
	{
		SoftAssert soft=new SoftAssert();
		home.clickGearsTab();
		home.clickskillraryDemoApp();
		web.handleChildBrowser();
		soft.assertEquals(demoApp.getPageHeader(),"SkillRary-ECommerce");
		
		web.ScrollTillElement(demoApp.getContactUsLink());
		demoApp.ClickContactUs();
		
		soft.assertTrue(contact.getContactUsIcon().isDisplayed());
		
		Map<String,String> map=excel.readData("Sheet1");
		
		contact.sendContactInfo(map.get("Full Name"), map.get("Email"),map.get("Subject"),map.get("Message"));
		
		soft.assertAll();
		
		
				
				
				
		

	}
 
}
