package mmt.Browser;

import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessMode {

	public void Headless(ChromeOptions options)
	{
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
	}
	}