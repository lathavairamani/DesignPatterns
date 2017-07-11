package com.design.patterns.adapter;

public class DuckAdapter implements Turkey {
	
	Duck duck;
	
	public DuckAdapter(Duck duck){
		this.duck = duck;
	}

	@Override
	public void gobble() {
		// TODO Auto-generated method stub
		duck.quack();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		duck.fly();
	}

}
