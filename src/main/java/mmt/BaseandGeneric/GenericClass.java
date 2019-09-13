package mmt.BaseandGeneric;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericClass {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public GenericClass(WebDriver driver,WebDriverWait wait)
	{
		this.driver=driver;
		this.wait=wait;
	}
	
	public <Tpage extends BaseClass> Tpage getInstance(Class<Tpage> pageClass) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException
	{
		return pageClass.getDeclaredConstructor(WebDriver.class,WebDriverWait.class).newInstance(this.driver,this.wait);
	}

}
