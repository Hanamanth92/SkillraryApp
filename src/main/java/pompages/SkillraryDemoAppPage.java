package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.WebDriverUtility;

public class SkillraryDemoAppPage 
{
   //Declaration
	@FindBy(xpath="//div[@class='navbar-header']/a")
	private WebElement pageHeader;
	
	@FindBy(id="course")
	private WebElement courseTab;
	
	@FindBy(xpath="//span/a[text()='Selenium Training']")
	private WebElement seleniumTrainingLink;
	
	
	@FindBy(name="addresstype")
	private WebElement categoryDropdown;
	
	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement contactUsLink;
	
	//Initialization
	public SkillraryDemoAppPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	/**
	 * This method returns skillrary demo app page header
	 * @return
	 */
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	/**
	 * this method is used to mouse hover to course tab
	 */
	
	public void mouseHoverToCourse(WebDriverUtility web)
	{
		web.mouseHover(courseTab);
		
	}
	
	/**
	 * This method is used to click on selenium training link
	 */
	public void clickSeleniumTraining()
	{
		seleniumTrainingLink.click();
	}
	
	/**
	 * This method is used to choose category from dropdown
	 * @param web
	 * @param index
	 * 
	 */
	
	public void selectCategory(WebDriverUtility web,int index)
	{
		web.dropdown(categoryDropdown, index);
	}
	
	
   /**
     * This method is used get Contact us link
     * @return
     */
	public WebElement getContactUsLink()
	{
		return contactUsLink;
	}
	
	/**
	 * This method is used to click on contact us link
	 */
	public void ClickContactUs()
	{
		contactUsLink.click();
	}
}