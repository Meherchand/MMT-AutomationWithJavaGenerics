package mmt.Tests;

public class BookFlightTest extends BaseTest {

	
	public BookFlightTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Test(priority=1)
	public void bookFlights() throws Exception
	{
		obj.getInstance(MMTHomePage.class).SearchFlight(ReadPropertyFile.get("fromcity"),ReadPropertyFile.get("toCity"));
		log4j.info("bookFlightAdded");
		LogStatus.pass("passed");
		System.out.print("bookflight from mum-pune");
	}
	}
		
		

}
}
