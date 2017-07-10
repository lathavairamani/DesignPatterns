package com.design.patterns.command.vendor;

import com.design.patterns.command.Command;

public class FanOnCommand implements Command {
	
	Fan fan;
	
	public FanOnCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.off();
	}

}
