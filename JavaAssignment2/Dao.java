package com.sapient;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dao {
	
	private String path1,absPath;
	private BufferedReader br = null;
	
	private ArrayList<tr1> a=new ArrayList<tr1>();
	
	
	public Dao(String s) throws IOException {
		// TODO Auto-generated constructor stub
		path1 = s;
		read();
		}

	
	private void read() throws IOException {
		
		
		int itr=0;
		
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(path1).getFile());
		absPath=file.getAbsolutePath();
		System.out.println("Tha path is "+file.getAbsolutePath());
		
		
		br = new BufferedReader(new FileReader(absPath));
		
		 String line="";
		 String splitBy = ",";
		
		while ((line = br.readLine()) != null)    
		{  
			if(itr!=0) {
			tr1 ob1=new tr1();
		
			String[] data = line.split(splitBy);    
			
			ob1.setClient_id(data[2]);
			ob1.setSecurity_id(data[3]);
			ob1.setTr_date(data[5]);
			ob1.setTr_type(data[4]);
			ob1.setPriority(data[7]);
			
			
			
			a.add(ob1);
			}
			itr++;
		}  
		
		
	}
	
	
	public ArrayList<tr1> getList(){
		return a;
	}
	
}
