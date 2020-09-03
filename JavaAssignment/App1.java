package asn1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class App1 {
	
	
	static process p1;
	static String yn="x";
	
	static ArrayList<String> his=new ArrayList();
	
	
	public static void main(String[] args) throws IOException {
		proc();
		
	}

	
	public static void proc() throws IOException {
		int input=0;	
		Scanner s1=new Scanner(System.in);
		
		//System.out.println("\n Java Core - Date Time Calculator");
		
		System.out.println("\nSelect a option\n"
				+ "1. Add  sub 2 dates \n"
				+ "2. Add, Subtract 'n' Days, Months, Weeks to the given date and derive the final date\n"
				+ "3. Determine the Day of the Week for a given date\n"
				+ "4. Determine the Week number for a given a date\n"
				+ " 5. show history \n 6. quit ");
		
		input=s1.nextInt();
		
		p1=new process(input,his);
		p1.getInfo();
		
		//System.out.println("Want to Repeat again or Close Session? Enter 1 for Repeat, 2 for Close");
		
	//	int k=s1.nextInt(); 
		
	if(input!=6) {
			proc();
		}
	//else  {
			//System.out.println("Thank You!");
		//}
		
		
	}
	
	/*
	 * //Part - 1 
		String a="20-08-1999";
		String b="22-08-2000";
		
		Dcal dcal=new Dcal(a,b);
		System.out.println(dcal.dSub());
		
		//Part - 2  
		ncal n1=new ncal(a,"20","2","5");
		System.out.println(n1.dAdd());
		
		//Part - 3
		GivenDate g1=new GivenDate(a);
		System.out.println(g1.dayOfWeek());
		System.out.println(g1.weekNum());
	 * */
	
}
