package com.iu.himart;

public class Phone extends Himart {

	private String company;
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Phone() {
		this.company = "Samsung";
		this.setBrand("Flip");
		this.setPrice(1190000);
		this.setPoint(50);
	}
	
	public void info() {
		super.info();
		System.out.println(this.getCompany());
			};
}
