package asn3;

public class cr1 {
	
	
	private String City;
	private String Country;
	private String Gender;
	private String Currency;
	private String Amount;
	
	
	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getCurrency() {
		return Currency;
	}


	public void setCurrency(String currency) {
		Currency = currency;
	}


	public String getAmount() {
		return Amount;
	}


	public void setAmount(String amount) {
		Amount = amount;
	}


	public cr1() {
		
	}
	
	
	public String cal_avg() {
		
		
		double b=0.0;
		
		if(Currency.toString().contains("INR")) {
			
			b= (double)Integer.parseInt(Amount)/66;
			
		}else if(Currency.toString().contains("GBP")) {
			b=Integer.parseInt(Amount)/0.67;
			
		}else if(Currency.toString().contains("SGD")) {
			
			b=Integer.parseInt(Amount)/1.5;
		}else if(Currency.toString().contains("HKD")) {
			
			 b=(double)Integer.parseInt(Amount)/8;
		}else {
		 b=Integer.parseInt(Amount);
		 }
		//Double.toString
		
		b=Math.round(b*10.0)/10.0;
		return Double.toString(b) ;
	}

}
