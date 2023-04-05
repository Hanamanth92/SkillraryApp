package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.WebDriverUtility;

public class SeleniumTrainingPage 
{
	
	//Declaration
	
    @FindBy(xpath="//h1[@class='page-header']")
     private WebElement PageHeader;
    
    
    @FindBy(xpath="//button[@id='add']")
    private WebElement plusbutton;
    
    @FindBy(xpath="//button[.='Addto Cart']")
    private WebElement addToCartButton;
    
    @FindBy(xpath="//div[@id='callout']/span")
    private WebElement itemAddedMessage;
    
    //Initialization
	public SeleniumTrainingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	/**
	 * This method returns page header text
	 * @return
	 */

	
	
	public String getPageHeader()
	{
		return PageHeader.getText();
	}
	
	 public void doubleClickAdd(WebDriverUtility web)
	 {
		 web.doubleClick(plusbutton);
	 }
	
	 public void clickAddToCart()
	 {
		 addToCartButton.click();

     }

	 }		