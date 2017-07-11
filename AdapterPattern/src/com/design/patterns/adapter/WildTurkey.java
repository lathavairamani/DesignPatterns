package com.design.patterns.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		System.out.println("Gobble");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Turkey is flying for short distance");
	}

	

}
