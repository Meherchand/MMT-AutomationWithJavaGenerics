package mmt.Tests;

import java.io.FileInputStream;


import mmt.Browser.Driver;
import mmt.Report.ExtentReport;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import mmt.BaseandGeneric.GenericClass;

public class BaseTest extends Driver{
	
	public BaseTest() throws Exception {
		super();
		
		// TODO Auto-generated constructor stub
	}

	
	public GenericClass obj;
	public Logger log4j;
	@BeforeMethod
	public void setUp() throws Exception {
		
		log4j= Logger.getLogger(getClass().getSimpleName());
		obj=new GenericClass(driver, wait);
		
		}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}

}
