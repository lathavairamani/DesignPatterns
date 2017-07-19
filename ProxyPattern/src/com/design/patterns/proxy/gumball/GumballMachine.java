package com.design.patterns.proxy.gumball;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State soldOutState;
	State winnerState;
	
	State state = soldOutState;
	int count = 0;
	String location;
	
	public String getLocation() {
		return location;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}

	public GumballMachine(String location, int count) throws RemoteException {
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		winnerState = new WinnerState(this);
		this.location = location;
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
