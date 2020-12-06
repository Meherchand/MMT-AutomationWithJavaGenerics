package mmt.Tests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import mmt.ReadPropertyFile.ReadPropertyFile;
import mmt.Report.LogStatus;
import mmt.Utils.CommonUtils;
import mmt.WebPages.MMTFlightResultPage;
import mmt.WebPages.MMTHomePage;

public class SearchFlightTest extends BaseTest {
	
	
	public SearchFlightTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(priority=1,enabled=false)
	public void homePageTitleTest() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		String title=obj.getInstance(MMTHomePage.class).getTitle();
		
		System.out.print(title);
		System .out.println("testing changs at remo-multiple places1");
	}
	@Test(priority=4)
	public void searchFlights() throws Exception
	{
		obj.getInstance(MMTHomePage.class).SearchFlight(ReadPropertyFile.get("fromcity"),ReadPropertyFile.get("toCity"));
		log4j.info("TESTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		LogStatus.pass("passed");

		System.out.print("testing merge conflicts2");

		System.out.print("testingConflict1");

	}
	
	@Test(priority=5)
	public void deleteFlights() throws Exception
	{
		obj.getInstance(MMTHomePage.class).SearchFlight(ReadPropertyFile.get("fromcity"),ReadPropertyFile.get("toCity"));
		log4j.info("deleteFileAdded");
		LogStatus.pass("passed");
		System.out.print("testline added for delete");
		System.out.print("verifying merge with two branches");
	}

}
