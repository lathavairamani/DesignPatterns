package com.design.patterns.command.vendor;

import com.design.patterns.command.Command;

public class GarageDoorOpenCommand implements Command {
	
	Garage garage;
	
	public GarageDoorOpenCommand(Garage garage) {
		// TODO Auto-generated constructor stub
		this.garage = garage;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garage.open();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garage.close();
	}

}
