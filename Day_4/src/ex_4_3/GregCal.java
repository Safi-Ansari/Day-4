package ex_4_3;
import java.util.*;

public class GregCal {
	
	public static void main(String[] args) {
		
	    Calendar c = Calendar.getInstance();
	    System.out.println("Current Time: "+c.getTime());
	    //parameters: year, month, day
	    c.set(2022, 10, 10);
	    System.out.println("Updated Set Time: "+c.getTime());
	    System.out.println("ERA is: "+c.get(Calendar.ERA));
	    int weekofyear = c.get(Calendar.WEEK_OF_YEAR);
	    System.out.println("Week of Year: "+weekofyear);
	    int weekofmonth = c.get(Calendar.WEEK_OF_MONTH);
	    System.out.println("Week of Month: "+weekofmonth);
	    int hourofday = c.get(Calendar.HOUR_OF_DAY);
	    System.out.println("Hour of Day: "+hourofday);
	    int dayofyear = c.get(Calendar.DAY_OF_YEAR);
	    System.out.println("Day of Year: "+dayofyear);
	    
	  }

}
