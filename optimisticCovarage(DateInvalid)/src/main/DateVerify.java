package main;

public class DateVerify {


	
	public DateVerify() {
		
	}
	
	public static void main(String args[]) {
		String year = "2021";
		String mounth ="2";
		String day="29";
		DateVerify dateVerify = new DateVerify();
		dateVerify.verifyDate(year,mounth,day);
	}
	
	
	public boolean verifyDate(String year, String mounth, String day) {
		if(Integer.valueOf(day)>31 || Integer.valueOf(day)<1) {
			String date = day+"/"+mounth+"/"+year;
			System.out.println(date+" is a invalid date");
			return false;
		}
		if(Integer.valueOf(mounth) == 2 && Integer.valueOf(day)>29 ) {
			String date = day+"/"+mounth+"/"+year;
			System.out.println(date+" is a invalid date");
			return false;
		}
		if(Integer.valueOf(mounth)<1 ||Integer.valueOf(mounth)>12 ) {
			String date = day+"/"+mounth+"/"+year;
			System.out.println(date+" is a invalid date");
			return false;
		}
		if(Integer.valueOf(year)<0) {
			String date = day+"/"+mounth+"/"+year;
			System.out.println(date+" is a invalid date");
			return false;
		}
		String date = day+"/"+mounth+"/"+year;
		System.out.println(date+" is a correct date");
		return true;
	}
}
