package com.design.patterns.adapter;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck duck = new MallardDuck();
		duck.quack();
		duck.fly();
		
		WildTurkey turkey = new WildTurkey();
		turkey.gobble();
		turkey.fly();
		
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		turkeyAdapter.quack();
		turkeyAdapter.fly();
		
		Turkey duckAdapter = new DuckAdapter(duck);
		duckAdapter.gobble();
		duckAdapter.fly();
	}

}
