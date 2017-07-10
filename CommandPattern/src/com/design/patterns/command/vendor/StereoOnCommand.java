package com.design.patterns.command.vendor;

import com.design.patterns.command.Command;

public class StereoOnCommand implements Command {
	Stereo stereo;
	
	public StereoOnCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stereo.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		stereo.off();
	}

}
