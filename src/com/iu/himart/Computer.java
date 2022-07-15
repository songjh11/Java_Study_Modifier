package com.iu.himart;

public class Computer extends Himart {
	
	private String cpu;
		
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public Computer() {
		this.cpu = "M2";
		this.setBrand("MacMini");
		this.setPrice(2000000);
		this.setPoint(100);
	}
	
	public void info() {
		super.info();
		System.out.println(this.getCpu());
			}
}
