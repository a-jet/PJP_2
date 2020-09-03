package asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ncal {

	private Date dMain, dConv;
	private String days,weeks,months;
	private SimpleDateFormat sdf 
    = new SimpleDateFormat( 
        "dd-MM-yyyy"); 
	
	public ncal(String d1, String a,String b,String c) {
		try {
		dMain=sdf.parse(d1);
		
		}
		catch(ParseException e) {
		//System.out.println("Error 1");
			e.printStackTrace(); 
		}
		
		days=a;weeks=b;months=c;
		
	}
	
	
	public String dAdd() {
		
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DATE, Integer.parseInt(days));
		cal.add(Calendar.WEEK_OF_MONTH, Integer.parseInt(weeks));
		cal.add(Calendar.YEAR, Integer.parseInt(months));
		
		return "Result after Adding : "+getDate(cal);
	}
	
public String dSub() {
		
		Calendar cal = Calendar.getInstance();
		
		cal.add(Calendar.DATE, -Integer.parseInt(days));
		cal.add(Calendar.WEEK_OF_MONTH,-Integer.parseInt(weeks));
		cal.add(Calendar.YEAR,-Integer.parseInt(months));
		
		return "Result after Subtracting : "+getDate(cal);
	}
	
	
	public static String getTime(Calendar cal){
        return "" + cal.get(Calendar.HOUR_OF_DAY) +":" +
                (cal.get(Calendar.MINUTE)) + ":" + cal.get(Calendar.SECOND);
    }
	
	public static String getDate(Calendar cal){
        return "" + cal.get(Calendar.DATE) +"/" +
                (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR);
    }
 


	
	
}
