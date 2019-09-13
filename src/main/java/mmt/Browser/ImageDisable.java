package mmt.Browser;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;

public class ImageDisable {

	//To disable Imaging loading for chrome
	public void disableImg(ChromeOptions options)
	{
		HashMap<String,Object> images =new HashMap<String,Object>();
		images.put("images", 2);
		HashMap<String,Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_settings_values", images);
		options.setExperimentalOption("prefs", prefs);
		
	}
}
