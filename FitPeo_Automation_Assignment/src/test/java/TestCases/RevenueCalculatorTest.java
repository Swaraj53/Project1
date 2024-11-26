package TestCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.RevenueCalculatorPage;
import TestBase.BaseClass;


public class RevenueCalculatorTest extends BaseClass {
	
	public RevenueCalculatorPage Rc;
	
	@Test(priority=1,groups= {"sanity","Regression","smoke"})
	public void Verify_WebPage() {

		Rc = new RevenueCalculatorPage (driver);
		String Actual_Title = 	Rc.get_Title();
		String Expected_Title = p.getProperty("title");
		Assert.assertEquals(Actual_Title, Expected_Title);
		System.out.println(Actual_Title);
		log.info("Title verified successfully....");

		

	}
	
	@Test(priority=2,groups= {"sanity","Regression"})
	public void NavigateToRevenueCalculatorPage() {

		Rc = new RevenueCalculatorPage (driver);
		
		Rc.NavigateToRevenueCalculator();
		log.info("Sucessfully navigate to the RevenueCalculatorPage....");

		

	}
	
	@Test(priority=3,groups= {"sanity","Regression"})
	public void ScrollToSlider() throws InterruptedException {
		Rc.scrollToElement();
		log.info("scroll to the slider sucessfully....");


	}
	
	@Test(priority=4,groups= {"sanity","smoke"})
	public void Verify_TextBox() {
		Rc.UpdateField();
		log.info("value is updated in the text field....");

	}
	
	@Test(priority=5,groups= {"sanity","Regression"})
	public void moveSlider() {
		Rc.slideTolocation();
		log.info("slider moved to the specified value....");

	}
	

	
	@Test(priority=6,groups= {"sanity","smoke"})
	public void clickCheckBoxes() {
		Rc.clickAllTheCheckBoxes();
		log.info("Clicking the required checkboxes....");

	}
	
	@Test(priority=7,groups= {"sanity","Regression"})
	public void Verify_TotalRecurring() {
		String value = Rc.Total_Recurring();
		System.out.println(value);
		log.info("getting the expected Total recurring value....");

	}
	
	@Test(priority=8,groups= {"sanity","Regression"})
	public void Verify_Header() {
		String val = Rc.HeaderDisplayed();
		System.out.println("Displaying the header with Total Recurring Reimbursement for all Patients Per Month:\r\n"
				+ "value");
		System.out.println(val);
		log.info("Header is present and getting the required field....");

	}
	
}
