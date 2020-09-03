package asn1;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class process {
	
	int input;
	Scanner s1=new Scanner(System.in);
	
	ArrayList<String> his;
	
	//String toRepeat="N";
	
	public process(int k,ArrayList<String> his1) {
		// TODO Auto-generated constructor stub
	input =k;
	his=his1;
	}
	
	
	public void getInfo() throws IOException {
		if(input==1) {
			process1();
			
		}else if(input==2) {
			process2();
		}else if(input==3) {
			process3();
		}else if(input==4) {
			process4();	
		}else if(input==5) {
			his();	
		}else if(input==6) {
			quit1();	
		}else {
			System.out.println("Plese enter valid input!");
		}
		
		
	}
	
	
	private void quit1() throws IOException {
		FileStore f1=new FileStore();
		String add="";
		for(String x:his) {
			add+=x+"   \n";
		}
		
		//System.out.println(add);
		
		f1.addToFile(add);
		System.out.println("The End!");
		
	}


	private void process1() {
		System.out.println("Enter the 2 dates in format of dd-mm-yyyy exactly");
		String a,b;
		int k=0;
		a=s1.nextLine();
		b=s1.nextLine();
		
		System.out.println("enter 1 to Add :: 2 to Subtract the dates");
		k=s1.nextInt();
		
		Dcal d1=new Dcal(a,b);
		try {
		if(k==1) {
		System.out.println(d1.addD());
		his.add(d1.addD());
		}else if(k==2) {
			System.out.println(d1.dSub());
			his.add(d1.dSub());
		}else {
			System.out.println("Please enter valid input!");
		}
		}catch(ParseException e) {
			System.out.println("Please check your date format and try again!");
		}
		
	}
	
	private void process2() {
		System.out.println("Enter the  n Days, Months, Weeks");
		String a,b,c,d;
		int k=0;
		a=s1.nextLine();
		b=s1.nextLine();
		c=s1.nextLine();
		System.out.println("Enter the Date in dd-mm-yyyy format exactly");
		d=s1.nextLine();
		
		System.out.println("enter 1 to Add :: 2 to Subtract the dates");
		k=s1.nextInt();
		
		
		ncal n1=new ncal(d,a,b,c);
		if(k==1) {
		System.out.println(n1.dAdd());
		his.add(n1.dAdd());
		}else if(k==2) {
			System.out.println(n1.dSub());
			his.add(n1.dSub());
		}else {
			System.out.println("Please enter valid input!");
		}
		
	}
	
		private void process3(){
			System.out.println("Enter the date (dd-mm-yyyy format only)");
			String a;
			a=s1.nextLine();
			
			GivenDate g1=new GivenDate(a);
			System.out.println(g1.dayOfWeek());
			his.add(g1.dayOfWeek());
			
			//System.out.println(g1.weekNum());
			
		}
		
		private void process4(){
			System.out.println("Enter the date (dd-mm-yyyy format only)");
			String a;
			a=s1.nextLine();
			
			GivenDate g1=new GivenDate(a);
			//System.out.println(g1.dayOfWeek());
			System.out.println(g1.weekNum());
			his.add(g1.weekNum());
		}

		
		private void his() {
			System.out.println("History of this session");
			for(String x:his) {
				System.out.println(x);
			}

		}
}
