package asn1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileStore {

	private FileWriter fw = null;
	private BufferedWriter bw = null; 
	private PrintWriter pw = null;

	private String addText="";
	
	public FileStore() {
			}
	
	public void addToFile(String s) throws IOException  {
		try {
		fw = new FileWriter("history.txt", true); 
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw);
		pw.println(s);
		}finally {
			try { 
				pw.close();
				bw.close();
				fw.close(); } 
			catch (IOException io) {
				
		}
			
		}

		}
	
	public void showFileHistory() {
		
		try {
		      File myObj = new File("history.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}
