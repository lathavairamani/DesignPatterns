package com.design.patterns.command.vendor;

import com.design.patterns.command.Command;

public class TVOnCommand implements Command {
	TV tv;
	
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		tv.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		tv.off();
	}

}
