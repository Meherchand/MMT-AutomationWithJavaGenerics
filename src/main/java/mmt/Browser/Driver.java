package mmt.Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import mmt.Listeners.WebEventListener;
import mmt.ReadPropertyFile.ReadPropertyFile;

public class Driver extends ReadPropertyFile {

	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	
	
	public  Driver() throws Exception
	{
		String browser=ReadPropertyFile.get("browser");
		String headless=ReadPropertyFile.get("HeadLessMode");
		String imageDisable=ReadPropertyFile.get("DisableImage");
		if(browser.equalsIgnoreCase("chrome")|| browser.toUpperCase().contains("CHROME"))
		{
			try{
				
				System.setProperty("webdriver.chrome.driver",OsPath.getPath(browser));
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--incognito");
				if(imageDisable.equalsIgnoreCase("yes"))
				{
					new ImageDisable().disableImg(options);
				}
				DesiredCapabilities capabilites=DesiredCapabilities.chrome();
				capabilites.setCapability(ChromeOptions.CAPABILITY, options);
				driver=new ChromeDriver(options);
				wait = new WebDriverWait(driver, 15);
			}
	
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	EventHandlerInit();
	driver.get(ReadPropertyFile.get("url"));
	driver.manage().deleteAllCookies();
	}
	public void EventHandlerInit()
	{
	EventFiringWebDriver eventhandle=new EventFiringWebDriver(driver);
	WebEventListener handler=new WebEventListener();
	eventhandle.register(handler);
	driver=eventhandle;
	
	}
	public static void quit()
	{
		driver.quit();
	}
}
