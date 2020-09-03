package asn1;

import java.util.ArrayList;

public class HistorySes {

	
	ArrayList<String> his=new ArrayList();
	
	public HistorySes() {
		
	}
	
	public void add(String s) {
		his.add(s);
	}
	public ArrayList<String> getHis(){
		return his;
	}
	
	public void printHis() {
		System.out.println("History of this session");
		for(String x:his) {
			System.out.println(x);
		}
	}

}
