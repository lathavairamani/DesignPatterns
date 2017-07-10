package com.design.patterns.command.vendor;

import com.design.patterns.command.Command;

public class GarageDoorCloseCommand implements Command {
	Garage garage;
	
	public GarageDoorCloseCommand(Garage garage) {
		this.garage = garage;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		garage.close();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garage.open();
	}

}
