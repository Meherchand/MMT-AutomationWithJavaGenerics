package mmt.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import mmt.ReadPropertyFile.ReadPropertyFile;


public class CommonUtils  {


	public static String toGetCurrentDate()
	{
		Date todaysDate = new Date();
		DateFormat df = new SimpleDateFormat("E MMM dd yyyy");
		return df.format(todaysDate);
	} 
	

	
	public static String toGetCurrentDatePlus7() 
	{
		int days=Integer.parseInt(ReadPropertyFile.get("BookReturnDateAfterDays"));
		LocalDateTime SevenDaysAfterCurrentDate =  LocalDateTime.now().plusDays(days);
		DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("E MMM dd yyyy");
		return newPattern.format(SevenDaysAfterCurrentDate);
		
		
	}
	
	public static String DestXpathModifier(String Dexpath)
	{
		return Dexpath.replace("%ToBeReplaced%",toGetCurrentDate());
	
	}
	public static String ArrivalXpathModifier(String Arrxpath) 
	{
		return Arrxpath.replace("%ToBeReplaced%",toGetCurrentDatePlus7());
	
	}
	
}
