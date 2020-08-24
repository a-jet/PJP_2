package com.sapient;

public class tr1 {
	
	private String client_id;
	private String security_id;
	private String tr_date;
	private String tr_type;
	private String priority;
	
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}



	private int processing_fee=-1;
	
	public tr1() {
		
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getSecurity_id() {
		return security_id;
	}

	public void setSecurity_id(String security_id) {
		this.security_id = security_id;
	}

	public String getTr_date() {
		return tr_date;
	}

	public void setTr_date(String tr_date) {
		this.tr_date = tr_date;
	}

	public String getTr_type() {
		return tr_type;
	}

	public void setTr_type(String tr_type) {
		this.tr_type = tr_type;
	}
	
	
	
	public int calc_fee() {
		System.out.println(priority.trim());
		System.out.println(tr_type.trim());
		if(priority.toString().contains("Y")) {
			
			return 500;
			
		}else if(priority.toString().contains("N")) {
			
			if(tr_type.toString().contains("Sell and Withdraw")) {
				return 100;
			}else if(tr_type.toString().contains("Buy and Deposit")) {
				 return 50;
			}
			
			
		}
		return 0;
	}
	
	public int getFee() {
		return processing_fee;
	}

}
