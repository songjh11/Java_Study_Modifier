package com.iu.main;

import com.iu.terran.Marine;
import com.iu.zerg.Hydra;

public class Main {

	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		m1.setHp(30);
		m1.setWeapon(null);
		
		Hydra h1 = new Hydra();
		h1.setHp(20);
		h1.setColor("Black");
		
		h1.move();
		
		m1.info();
		m1.move();
		
		
		
		
	}

}
