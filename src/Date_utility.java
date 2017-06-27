import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Date_utility {
	
	public static String percentage(double majority)
	{
		NumberFormat percent = NumberFormat.getPercentInstance();

		String majorityString = percent.format(majority);
		return  majorityString ;
	}
	
	public static String currency(double price)
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		String priceString = currency.format(price); //returns $11.58
		
		return  priceString ;
	}
	
	public static String decimal(double miles)
	{
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(2);

		String milesString = number.format(miles);
		
		return milesString;
	}
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public static double maxnum(double a, double b) {
	
		return Math.max(a,b);
	}
	
	public static double minnum(double a, double b) {
		
		return Math.min(a,b);
	}
	
	public static String now()
	{
		Date date = Calendar.getInstance().getTime();
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd.hhmmss");
		  return sdf.format(date);
	}
	

	
	public static int day_difference(int year1, int month1, int day1,int year2, int month2, int day2)
	{

		 Calendar cal1 = new GregorianCalendar(year1, month1,day1);
	     Calendar cal2 = new GregorianCalendar(year2, month2,day2);
	     int day=0;
	     long DateInMS1 = cal1.getTimeInMillis();
	     long DateInMS2 = cal2.getTimeInMillis();
	     long millisecondsPerDay = (24*60*60*1000);
	     double numberOfDays1 = DateInMS1/millisecondsPerDay;
	     double numberOfDays2 = DateInMS2/millisecondsPerDay;
	     day = (int)(maxnum(numberOfDays1,numberOfDays2)-minnum(numberOfDays1,numberOfDays2));
		
		return day;
		
	}
	
	public static int day_ofweek(int year1, int month1, int day1)
	{
		Calendar cal1 = new GregorianCalendar(year1, month1,day1);
		return cal1.get(Calendar.DAY_OF_WEEK);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(percentage(.505));
		GregorianCalendar gc = new GregorianCalendar(2010,2,15);
		System.out.println("Month:" + gc.get(Calendar.MONTH));
		System.out.println("Day:" + gc.get(Calendar.DATE));
		System.out.println("Year:" + gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		System.out.print(gc.get(Calendar.HOUR)+":");
		System.out.print(gc.get(Calendar.MINUTE) + ":");
		System.out.println(gc.get(Calendar.SECOND));
		System.out.println(now());*/
		
		System.out.println(day_difference(2010,2,15,2010,2,13));
		System.out.println(day_ofweek(2017,6,27));
	}

}
