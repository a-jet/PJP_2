package asn3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Dao {
	
	
	private String path1,absPath;
	private BufferedReader br = null;
	
	private ArrayList<cr1> a=new ArrayList<cr1>();
	
	
	public Dao(String s) throws IOException {
		
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
			
		
			String[] data = line.split(splitBy);    
			
			cr1 ob1=new cr1();
			
			ob1.setAmount(data[4]);
			ob1.setCity(data[0]);
			ob1.setCountry(data[1]);
			ob1.setCurrency(data[3]);
			ob1.setGender(data[2]);
			
			
			
			
			a.add(ob1);
			}
			itr++;
		}  
		
		
	}
	
	
	public ArrayList<cr1> getList(){
		return a;
	}
	
}
