package asn3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;




public class App1 {
	
	private static ArrayList<cr1> dataOb;
	
	public static void main(String[] args) throws IOException {
		System.out.println("Hello World");
		
		
		Dao ob1=new Dao("cr.csv");
		
		dataOb=ob1.getList();
		System.out.println(dataOb.get(0).cal_avg());
		writeRes();
		
	}
	
	public static void writeRes() {
		   PrintWriter pw = null;
	       try {
	           pw = new PrintWriter(new File("C:\\Users\\HP\\eclipse-workspace\\asn3\\target\\classes\\res.csv"));
	       } catch (FileNotFoundException e) {
	           e.printStackTrace();
	       }
	       StringBuilder builder = new StringBuilder();
	       String columnNamesList = "Country / City Name,Gender,"
	       		+ "Average Income (USD)";
	       // No need give the headers Like: id, Name on builder.append
	       builder.append(columnNamesList +"\n");
	       
	       for(cr1 x : dataOb) {
	    	   builder.append(x.getCity()+" "+x.getCountry()+",");
	    	   builder.append(x.getGender()+",");
	    	   builder.append(x.cal_avg()+",");
	    	   
	    	   builder.append('\n');
	    	   
	       }
	       
	       
	       
	       pw.write(builder.toString());
	       pw.close();
	       System.out.println("done!");
	   }

	
	
	

}
