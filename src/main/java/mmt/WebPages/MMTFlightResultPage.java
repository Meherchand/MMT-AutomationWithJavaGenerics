package mmt.WebPages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import mmt.BaseandGeneric.BaseClass;

public class MMTFlightResultPage extends BaseClass {

	
	public MMTFlightResultPage(WebDriver driver, WebDriverWait wait) throws IOException {
		super(driver, wait);
		// TODO Auto-generated constructor stub
	}

	public List<WebElement> DepCount;
	public List<WebElement> ArrivalCount;
	public List<WebElement> Departureprices;
	public List<WebElement> Arrivalprices;
	
	////////////////////PageFactory////////////////////////
	By checkBox_Nonstop=By.xpath("//span[@data-filtertext='collapsed_stop_nonStop']");
	By checkBox_1Stop=By.xpath("//span[@data-filtertext='collapsed_stop_oneStop']");
	By departureFlightCount=By.xpath("//div[@id='ow-domrt-jrny']//div[contains(@class,'fli-list splitVw-listing ')]");
	By returnFlightCount=By.xpath("//div[@id='rt-domrt-jrny']//div[contains(@class,'fli-list splitVw-listing ')]");
	By resetButton=By.xpath("//a[@class='pull-right reset-filter stop_reset']");
	By departurePrices=By.xpath("//div[@id='ow-domrt-jrny']//div[contains(@class,'fli-list splitVw-listing ')]//div[contains(@class,'pull-right marL5 text-right')]//p//span");
	By arrivalPrices=By.xpath("//div[@id='rt-domrt-jrny']//div[contains(@class,'fli-list splitVw-listing ')]//div[contains(@class,'pull-right marL5 text-right')]//p//span");
	By userSelectedDepartPrices=By.xpath("(//div[@class='splitVw-footer slideUp']//div[@class='pull-right marL5 text-right']//p)[1]");
	By userSelectedArrivalPrices=By.xpath("(//div[@class='splitVw-footer slideUp']//div[@class='pull-right marL5 text-right']//p)[2]");
	
	//////////////////////////PageActions////////////////////////
	public void getTotalRecordsNonStop()
	
	{
		doclick(checkBox_Nonstop);
		 DepCount=getList(departureFlightCount);
		 ArrivalCount=getList(returnFlightCount);
		System.out.println("Non-Stop Departure Flights Available are"+"  "+DepCount.size());
		System.out.println("Non-Stop Arrival Flights Available are"+" " +ArrivalCount.size());
		doclick(resetButton);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
public void getTotalRecordsOneStop()
	
	{
		doclick(checkBox_1Stop);
		 DepCount=getList(departureFlightCount);
		 ArrivalCount=getList(returnFlightCount);
		System.out.println("One-Stop Departure Flights Available are"+"  "+DepCount.size());
		System.out.println("One-Stop Arrival Flights Available are"+" " +ArrivalCount.size());
	}

public void UserSelectedDetails() {
	DepCount=getList(departureFlightCount);
	DepCount.get(0).click();
	ArrivalCount=getList(returnFlightCount);
	ArrivalCount.get(1).click();
	Departureprices=getList(departurePrices);
	String s1=Departureprices.get(0).getText();
	Arrivalprices=getList(arrivalPrices);
	String s2=Arrivalprices.get(1).getText();
	System.out.println(s1 + s2);
	String userDepFlightPrices=getText(userSelectedDepartPrices);
	String userArrivalFlightPrices=getText(userSelectedArrivalPrices);
	System.out.println(userDepFlightPrices + userArrivalFlightPrices);
	
	

}	
	
}
