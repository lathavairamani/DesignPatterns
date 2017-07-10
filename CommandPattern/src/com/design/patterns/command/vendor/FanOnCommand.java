package com.design.patterns.command.vendor;

import com.design.patterns.command.Command;

public class FanOnCommand implements Command {
	
	Fan fan;
	int previousSpeed;
	
	public FanOnCommand(Fan fan) {
		// TODO Auto-generated constructor stub
		this.fan = fan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		previousSpeed = fan.getSpeed();
		if(previousSpeed == Fan.OFF) {
			fan.high();
		} else {
			fan.low();
		}
		fan.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		System.out.println("Previous Speed - " + previousSpeed);
		if(previousSpeed == Fan.HIGH) {
			fan.high();
		} else if(previousSpeed == Fan.MEDIUM) {
			fan.medium();
		} else if(previousSpeed == Fan.LOW) {
			fan.low();
		} else if(previousSpeed == Fan.OFF) {
			fan.off();
		}
	}

}
