package com.iu.himart;

public class Tv extends Himart {

	private int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public Tv() {
		this.size = 95;
		this.setBrand("LG");
		this.setPrice(2000000);
		this.setPoint(100);
	}

	public void info() {
		super.info();
		System.out.println(this.getSize());
			};
}
