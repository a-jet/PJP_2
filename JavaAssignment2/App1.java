package com.sapient;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class App1 {
	
	private static ArrayList<tr1> dataOb;
	
   public static void main(String[] args) throws IOException {
	
	   	System.out.println("Hello World");
	   	
	   	//ArrayList<tr1> dataOb;
   
	   	
	   	Dao ob1=new Dao("cs2.csv");
	   	
	   	dataOb=ob1.getList();
	   	
	   	System.out.println(dataOb.get(0).calc_fee());
	   	
	   	writeRes();
	   	
   }
   
   
   public static void writeRes() {
	   PrintWriter pw = null;
       try {
           pw = new PrintWriter(new File("C:\\Users\\HP\\eclipse-workspace\\asn2\\target\\classes\\res.csv"));
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       StringBuilder builder = new StringBuilder();
       String columnNamesList = "Client Id,Transaction Type,"
       		+ "Transaction Date,Priority,Processing Fee";
       // No need give the headers Like: id, Name on builder.append
       builder.append(columnNamesList +"\n");
       
       for(tr1 x : dataOb) {
    	   builder.append(x.getClient_id()+",");
    	   builder.append(x.getTr_type()+",");
    	   builder.append(x.getTr_date()+",");
    	   builder.append(x.getPriority()+",");
    	   builder.append(x.calc_fee()+",");
    	   
    	   builder.append('\n');
    	   
       }
       
       
       
       pw.write(builder.toString());
       pw.close();
       System.out.println("done!");
   }

}
