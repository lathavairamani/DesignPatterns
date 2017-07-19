package com.design.patterns.proxy.gumball;

import java.rmi.Naming;

public class GumballMachineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachineRemote gumballMachine = null;
		int count;
		if (args.length > 2) {
			System.out.println("Gumball Machine <name> <inventory>");
			System.exit(1);
		}
		try {
			count = Integer.parseInt(args[1]);
			gumballMachine = new GumballMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
