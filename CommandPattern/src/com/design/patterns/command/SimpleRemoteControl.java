package com.design.patterns.command;

import com.design.patterns.command.vendor.NoCommand;

public class SimpleRemoteControl {
	
	// This is for single one
	Command command;
	
	// Multiple ones
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public SimpleRemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		Command noCommand = new NoCommand();
		for(int i=0; i<7; i++){
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButton(int slot){
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButton(int slot){
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButton(){
		undoCommand.undo();
	}
	
	public void execute(){
		command.execute();
	}

}
