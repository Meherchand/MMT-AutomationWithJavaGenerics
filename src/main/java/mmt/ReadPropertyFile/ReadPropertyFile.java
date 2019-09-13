package mmt.ReadPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	
	public static String get(String PropertyName) 
	{
		String returnproperty="";
		Properties prop= new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream("C:\\Users\\mnakka\\eclipse-workspace\\MMTAutomation_POMJavaGenerics\\src\\main\\resources\\TestRunConfig.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		returnproperty=prop.getProperty(PropertyName);
		if(returnproperty==null)
		{
			try {
				throw new Exception("Property with name : "+PropertyName+" not found in "+System.getProperty("user.dir")+"\\src\\main\\resources//TestRunConfig.properties Please check again");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return returnproperty;
	}
}

