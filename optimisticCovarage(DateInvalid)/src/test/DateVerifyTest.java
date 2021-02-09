package test;


import org.junit.Test;

import main.DateVerify;


public class DateVerifyTest {

	
	@Test
	public void verify_withAValid_returnTrue()
	{
		String year = "2021";
		String mounth ="2";
		String day="15";
		DateVerify dateVerify = new DateVerify();
		dateVerify.verifyDate(year,mounth,day);
		
	}
	
	@Test
	public void verify_withAInvalid_returnFalse()
	{
		String year = "2021";
		String mounth ="15";
		String day="29";
		DateVerify dateVerify = new DateVerify();
		dateVerify.verifyDate(year,mounth,day);
		
	}
	
	@Test
	public void verify_withABug_returnTrue()
	{
		String year = "2021";
		String mounth ="2";
		String day="29";
		DateVerify dateVerify = new DateVerify();
		dateVerify.verifyDate(year,mounth,day);
		
	}
}
