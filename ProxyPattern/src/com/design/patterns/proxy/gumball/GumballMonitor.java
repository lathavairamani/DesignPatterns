package com.design.patterns.proxy.gumball;

import java.rmi.RemoteException;

public class GumballMonitor {
	GumballMachineRemote machine;
	
	public GumballMonitor(GumballMachineRemote gumballMachine) {
		this.machine = gumballMachine;
	}
	
	public void report() {
		try {
			System.out.println("Gumball machine: " + machine.getLocation());
			System.out.println("Gumball count is " + machine.getCount());
			System.out.println("Current state is " + machine.getState());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
