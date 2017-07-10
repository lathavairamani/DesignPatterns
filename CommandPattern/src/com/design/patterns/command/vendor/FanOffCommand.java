package com.design.patterns.command.vendor;

import com.design.patterns.command.Command;

public class FanOffCommand implements Command {
	Fan fan;
	
	public FanOffCommand(Fan fan){
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		fan.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		fan.on();
	}

}
