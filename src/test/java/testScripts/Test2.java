package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericLibrary.BaseClass;

public class Test2 extends BaseClass
{
@Test
public void test2()
{
	SoftAssert soft=new SoftAssert();
	home.clickGearsTab();
	home.clickskillraryDemoApp();
	web.handleChildBrowser();
	soft.assertEquals(demoApp.getPageHeader(),"SkillRary-ECommerce");
	
	demoApp.selectCategory(web,1);
	
	soft.assertEquals(testing.getPageHeader(), "Testing");
	
	web.dragAndDropElement(testing.getSeleniumTrainingImage(),testing.getcartArea());
	web.ScrollTillElement(testing.getFacebookIcon());
	testing.clickFaceBookIcon();
	soft.assertAll();
	driver.quit();
}
}
