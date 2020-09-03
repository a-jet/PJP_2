package asn1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 

public class Dcal {
	
	private String start_date,end_date;
	
	private SimpleDateFormat sdf 
    = new SimpleDateFormat( 
        "dd-MM-yyyy"); 
	

	public Dcal(String a, String b) {
		
		start_date=a;
		end_date=b;
	}
	
	
	public String dSub() {
		try { 
			  
	            // parse method is used to parse 
	            // the text from a string to 
	            // produce the date 
	            Date d1 = sdf.parse(start_date); 
	            Date d2 = sdf.parse(end_date); 
	  
	            // Calucalte time difference 
	            // in milliseconds 
	            long difference_In_Time 
	                = d2.getTime() - d1.getTime(); 
	  
	            // Calucalte time difference in 
	            // seconds, minutes, hours, years, 
	            // and days 
	            long difference_In_Seconds 
	                = (difference_In_Time 
	                   / 1000) 
	                  % 60; 
	  
	            long difference_In_Minutes 
	                = (difference_In_Time 
	                   / (1000 * 60)) 
	                  % 60; 
	  
	            long difference_In_Hours 
	                = (difference_In_Time 
	                   / (1000 * 60 * 60)) 
	                  % 24; 
	  
	            long difference_In_Years 
	                = (difference_In_Time 
	                   / (1000l * 60 * 60 * 24 * 365)); 
	            
	            long difference_In_Months
                = (difference_In_Time 
                   / (1000l * 60 * 60 * 24 * 30)); 
	            
	            long difference_In_Weeks
                = (difference_In_Time 
                   / (1000l * 60 * 60 * 24 * 7)); 
	  
	            long difference_In_Days 
	                = (difference_In_Time 
	                   / (1000 * 60 * 60 * 24)) 
	                  % 365; 
	  
	            // Print the date difference in 
	            // years, in days, in hours, in 
	            // minutes, and in seconds 
	  
	            System.out.print( 
	                "Difference "
	                + "between two dates is: "); 
	  
	             
	            return    difference_In_Years 
	                + " years :"+
	                difference_In_Months 
	                + " Months :"+
	                difference_In_Weeks 
	                + " weeks :"
	                
	                + difference_In_Days 
	                + " days ";
	                
	        } 
	  
	        // Catch the Exception 
	        catch (ParseException e) { 
	            e.printStackTrace(); 
	        } 
		
		return "Error!";
	}
	
	public String addD() throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE");
		
		Date d1 = sdf.parse(start_date); 
        Date d2 = sdf.parse(end_date); 
        long sum = d1.getTime() + d2.getTime();

        Date sumDate = new Date(sum);
        
        String a=("DAY "+simpleDateFormat.format(sum).toUpperCase());

        simpleDateFormat = new SimpleDateFormat("MMMM");
       String b= ("MONTH "+simpleDateFormat.format(sum).toUpperCase());

        simpleDateFormat = new SimpleDateFormat("YYYY");
        String c=("YEAR "+simpleDateFormat.format(sum).toUpperCase());
		
		return c+" years : "+b+" months : "+a+" days";
		
	}
	
}
