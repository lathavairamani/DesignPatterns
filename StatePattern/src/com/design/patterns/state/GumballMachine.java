package com.design.patterns.state;

public class GumballMachine {
	
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State soldOutState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	
	public void setState(State state) {
		this.state = state;
	}
	
	public GumballMachine(int count) {
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		winnerState = new WinnerState(this);
		this.count = count;
		if(count > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
	}
	
	public State getWinnerState() {
		return winnerState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}
	
	public int getCount() {
		return count;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
	}

	public void dispense() {
		state.dispense();
	}
	
	public void refill(int count) {
		this.count += count;
		System.out.println("The gumball machine is just refilled and the count is " + this.count);
		state.refill();
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0) {
			count = count-1;
		}
	}
}
