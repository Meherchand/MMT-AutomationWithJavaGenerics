package mmt.WebPages;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import mmt.BaseandGeneric.BaseClass;
import mmt.Utils.CommonUtils;
 

public class MMTHomePage extends BaseClass {

	
	
	
	
	public MMTHomePage(WebDriver driver, WebDriverWait wait) throws IOException {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	///////////////////////PageFactory////////////////////////////
	By radioButton_RoundTrip=By.xpath("(//span[@class='tabsCircle appendRight5'])[2]");
	By comboBox_FromCity=By.xpath("//input[@id='fromCity']");
	By inputText_FromCity=By.xpath("//input[@type='text' and @role='combobox']");
	By selectValue_FromCity=By.xpath("//p[text()='Delhi, India']");
	By inputText_ToCity=By.xpath("//input[@type='text' and @role='combobox']");
	By selectValue_ToCity=By.xpath("//p[text()='Bangalore, India']");  
	By departureDate=By.xpath("//label[@for='departure']");
	By SearchButton=By.xpath("//a[text()='Search']");
	By illDolater=By.xpath("//button[@id='deny']");
	
	
	String DepartureDateXpath=CommonUtils.DestXpathModifier("//div[@aria-label='%ToBeReplaced%' and @aria-disabled='false']");

	By select_DepartureDate=By.xpath(DepartureDateXpath);
	String ArrivalDateXpath=CommonUtils.ArrivalXpathModifier("//div[@aria-label='%ToBeReplaced%' and @aria-disabled='false']");
	By select_ArrivalDate=By.xpath(ArrivalDateXpath);
	
	///////////////////////////PageActions/////////////////////////////////////
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public void SearchFlight(String fromCity,String toCity)
	{
		//driver.switchTo().frame("webpush-bubble");
		doclick(radioButton_RoundTrip);
		doclick(comboBox_FromCity);
		doSendkeys(inputText_FromCity,fromCity);
		doclick(selectValue_FromCity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		doSendkeys(inputText_FromCity, toCity);
		doclick(selectValue_ToCity);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		doclick(select_DepartureDate);
		doclick(select_ArrivalDate);
		doclick(SearchButton);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
			

}
