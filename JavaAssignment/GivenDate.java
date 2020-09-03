package asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GivenDate {
	private Date d1 ;
	private SimpleDateFormat sdf 
    = new SimpleDateFormat( 
        "dd-MM-yyyy"); 
	
	public GivenDate(String a) {
		try {
			d1=sdf.parse(a);
			
			}
			catch(ParseException e) {
			//System.out.println("Error 1");
				e.printStackTrace(); 
			}
	}
	
	
	public String dayOfWeek() {
		Calendar c = Calendar.getInstance();
		c.setTime(d1);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		return "Day of the week : "+Integer.toString(dayOfWeek);
	}
	
	public String weekNum() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d1);
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		return "week number is : "+Integer.toString(week);
	}
}
