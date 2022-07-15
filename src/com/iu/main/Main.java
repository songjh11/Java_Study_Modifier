package com.iu.main;

import com.iu.terran.Marine;
import com.iu.terran.Scv;
import com.iu.unit.Unit;
import com.iu.zerg.Hydra;

public class Main {

	public static void main(String[] args) {
		
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		
		//Marine is a Unit
		//Scv is a Unit
		
		
		Unit unit = m1;
		
		System.out.println(unit.getHp());
		System.out.println(unit.getName());
		System.out.println(unit.getColor());
		
		m1 = (Marine)unit;//unit이 scv일수도 있고 marine일수도 있기 때문에 앞에 표시해줌
		System.out.println(m1.getWeapon());
		
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
