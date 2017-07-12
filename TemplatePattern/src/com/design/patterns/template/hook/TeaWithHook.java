package com.design.patterns.template.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeaWithHook extends CaffieneBeverageWithHook {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dipping tea bag");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding lemon");
	}
	
	public boolean customerWantsCondiments(){
		String answer = null;
		System.out.println("Would you like lemon with your tea (y/n)? ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try{
			 answer = in.readLine();
		} catch(IOException ex){
			System.err.println("IO error");
		}
		if(answer != null && answer.equalsIgnoreCase("y")){
			return true;
		}
		return false;
		 
	}

}
