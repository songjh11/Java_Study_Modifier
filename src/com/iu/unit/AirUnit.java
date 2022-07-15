package com.iu.unit;

public abstract class AirUnit extends Unit {

	private int wings;
	
	public AirUnit() {
		super(30);
		}
	
	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}
	
	
	
}
