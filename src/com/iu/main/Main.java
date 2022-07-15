package com.iu.main;

import com.iu.himart.Client;
import com.iu.himart.Computer;
import com.iu.himart.Phone;
import com.iu.himart.Tv;

public class Main {

	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		
		c1.info();
		
		Phone p1 = new Phone();
		Tv t1 = new Tv();
		
		p1.info();
		t1.info();
		
		Client client = new Client();
		
		client.buy(p1);
		
			}

}
