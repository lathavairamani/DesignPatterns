package com.design.patterns.proxy.gumball;

public class NoQuarterState implements State {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	transient GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		gumballMachine.setState(gumballMachine.getHasQuarterState());
		System.out.println("You inserted a quarter");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned but there's no quarter");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You need to pay first");
	}

	@Override
	public void refill() {
		// TODO Auto-generated method stub
		
	}

}
