package mmt.Tests;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.testng.annotations.Test;

import mmt.WebPages.MMTFlightResultPage;
import mmt.WebPages.MMTHomePage;

public class FlightResultsTest extends BaseTest {

	public FlightResultsTest() throws Exception {
		super();
		
	}
	@Test
	public void getCountofNonStopDepartureFlights() throws Exception
	{
		obj.getInstance(MMTHomePage.class).SearchFlight(get("fromcity"),get("toCity"));
		obj.getInstance(MMTFlightResultPage.class).getTotalRecordsNonStop();
		obj.getInstance(MMTFlightResultPage.class).getTotalRecordsOneStop();
		//obj.getInstance(MMTFlightResultPage.class).UserSelectedDetails();
		System.out.print("hello,this file is changedss");
		
		
	}

	
}
