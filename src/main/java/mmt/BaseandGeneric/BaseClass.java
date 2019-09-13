package mmt.BaseandGeneric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass extends GenericClass{

	
	public BaseClass(WebDriver driver, WebDriverWait wait) throws IOException {
		
		super(driver, wait);
		
		
		
	}
	
	public void doclick(By locator)
	{
		driver.findElement(locator).click();
	}
	public void doSendkeys(By locator,String text)
	{
		driver.findElement(locator).sendKeys(text);
	}
	public String getText(By locator)
	{
		return driver.findElement(locator).getText();
	}

	public List<WebElement> getList(By locator)
	{
		return driver.findElements(locator);
	}
	
}
