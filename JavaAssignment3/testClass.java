package asn3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class testClass {
	
	@Test
    public void test1() {
		
		cr1 ob1=new cr1();
		
		ob1.setAmount("66");
        ob1.setCurrency("INR");
        
        assertEquals("1.0", ob1.cal_avg());
    }
	
	@Test
    public void test2() {
		
		cr1 ob1=new cr1();
		
		ob1.setAmount("100");
        ob1.setCurrency("INR");
        
        assertEquals("1.5", ob1.cal_avg());
    }

}
