package com.design.patterns.command.vendor;

import com.design.patterns.command.Command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("No task has been assigned");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("No task has been assigned");
	}

}
