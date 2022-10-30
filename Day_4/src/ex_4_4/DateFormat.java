package ex_4_4;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormat {
	
	public static void main(String[] args) throws Exception {
		
	      Calendar cal = Calendar.getInstance();
	      
	      SimpleDateFormat simpleformat1 = new SimpleDateFormat("E, y-M-d h:m:s a z");
	      System.out.println("E, y-M-d h:m:s a z Format: "+simpleformat1.format(cal.getTime()));
	      
	      SimpleDateFormat simpleformat2 = new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss a zzz");
	      System.out.println("E yyyy.MM.dd hh:mm:ss a zzz Format: "+simpleformat2.format(cal.getTime()));
	      
	      SimpleDateFormat simpleformat3 = new SimpleDateFormat("EEEE, MMMM d, yyyy");
	      System.out.println("EEEE, MMMM d, yyyy Format: "+simpleformat3.format(cal.getTime()));
	      
	   }

}
