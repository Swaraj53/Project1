package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RevenueCalculatorPage extends BasePage {

	public RevenueCalculatorPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//div[text()=\"Revenue Calculator\"]")
	private WebElement RevenueCalculator;
	
	
	@FindBy(xpath="//span[@class='MuiSlider-rail css-3ndvyc']")
	private WebElement Slider;
	
	
	@FindBy(xpath="//title[normalize-space()='Remote Patient Monitoring (RPM) - fitpeo.com']")
	private WebElement title;
	@FindBy(xpath="//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall css-129j43u']/input")
	private static WebElement InputTxtField;
	@FindBy(xpath="(//span[@class='MuiSlider-track css-10opxo5'])[1]")
	private static WebElement slider;
	
	@FindBy(xpath="//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']")
	private static WebElement sliderMark;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private static WebElement Checkbox1;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private static WebElement Checkbox2;
	
	@FindBy(xpath="(//input[@type='checkbox'])[3]")
	private static WebElement Checkbox3;
	
	@FindBy(xpath="(//input[@type='checkbox'])[8]")
	private static WebElement Checkbox4;
	
	@FindBy(xpath=("(//p[@class=\"MuiTypography-root MuiTypography-body1 inter css-12bch19\"])[3]"))
	private static WebElement ToatalRecurring;
   
	
	@FindBy(xpath="(//p[@class=\"MuiTypography-root MuiTypography-body2 inter css-1xroguk\"])[4]")
	private static WebElement Header;
	
	

	
	public void NavigateToRevenueCalculator() {
		RevenueCalculator.click();
	}
	
	
	public String get_Title() {
		// TODO Auto-generated method stub
		String ActualTitle = driver.getTitle();
		//System.out.println(ActualTitle);
		return ActualTitle;
	}
	
	
	 public static void scrollToElement() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)",slider);
			js.executeScript("window.scrollBy(0,500)",slider);
	    }

	
	 public static void slideTolocation() {
		 	Actions action =  new Actions(driver);
		 	action.dragAndDropBy(slider,107,0 ).build().perform();
		 	InputTxtField.clear();		 	
	    }
	 
	 
	 public static void UpdateField() {
		 String value ="520";
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 InputTxtField.sendKeys(value);;
	 }
	 
	 
	 public static void clickAllTheCheckBoxes() {
	    JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)",slider);

		Checkbox1.click();
		Checkbox2.click();
		Checkbox3.click();
		Checkbox4.click();

		 	
	    }
	 
	 public static String Total_Recurring() {
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("window.scrollBy(0,-1000)",slider);
		 String RecurringReimbursement = ToatalRecurring.getText();
		 return RecurringReimbursement;
	 }
	 
     public static String HeaderDisplayed() {
		 
		String val= ToatalRecurring.getText();
		return val;
	 }

	
	

}
