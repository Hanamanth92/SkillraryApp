package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
 //Declaration
	@FindBy(xpath="//h1[@class='page-header']")
	private WebElement pageheader;
	
	@FindBy(xpath="//img[@id='Selenium Training']")
	private WebElement seleniumTrainingImage;
	
	@FindBy(id="cartArea")
	private WebElement cartArea;
	
	@FindBy(xpath="//ul[@class='list-socialicons']/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	
	//Initialization
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	/**
	 * This Method is returns page header text
	 * @return
	 */
	public String getPageHeader()
	{
		return pageheader.getText();
		
	}
	
	/**
	 * This method returns selenium training image
	 * @return
	 */
	
	public WebElement getSeleniumTrainingImage()
	{
		return seleniumTrainingImage;
	}
	/**
	 * This method returns cart area web Element
	 * @return
	 */
	
	public WebElement getcartArea()
	{
		return cartArea;
	}
	
	/**
	 * This method is used to click facebook icon
	 */
	
	public WebElement getFacebookIcon()
	{
		return facebookIcon;
	}
	
	public void clickFaceBookIcon()
	{
		facebookIcon.click();
	}
}


