package com.design.patterns.command;

import com.design.patterns.command.vendor.Fan;
import com.design.patterns.command.vendor.FanOffCommand;
import com.design.patterns.command.vendor.FanOnCommand;
import com.design.patterns.command.vendor.Garage;
import com.design.patterns.command.vendor.GarageDoorCloseCommand;
import com.design.patterns.command.vendor.GarageDoorOpenCommand;
import com.design.patterns.command.vendor.Light;
import com.design.patterns.command.vendor.LightOffCommand;
import com.design.patterns.command.vendor.LightOnCommand;
import com.design.patterns.command.vendor.MacroCommand;
import com.design.patterns.command.vendor.Stereo;
import com.design.patterns.command.vendor.StereoOffCommand;
import com.design.patterns.command.vendor.StereoOnCommand;
import com.design.patterns.command.vendor.TV;
import com.design.patterns.command.vendor.TVOffCommand;
import com.design.patterns.command.vendor.TVOnCommand;

public class SimpleRemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Simple Type
		Light light = new Light("Living Room");
		Command lightOnCommand = new LightOnCommand(light);
		SimpleRemoteControl remote = new SimpleRemoteControl();
		remote.setCommand(lightOnCommand);
		remote.execute();
		
		Garage garage = new Garage("Main");
		Command garageOpenCommand = new GarageDoorOpenCommand(garage);
		remote.setCommand(garageOpenCommand);
		remote.execute();
		
		
		// Multiple slots
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		Fan livingRoomFan = new Fan("Living Room");
		Fan bedRoomFan = new Fan("Bed Room");
		Garage mainGarage = new Garage("");
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);
		
		FanOnCommand livingRoomFanOnCommand = new FanOnCommand(livingRoomFan);
		FanOffCommand livingRoomFanOffCommand = new FanOffCommand(livingRoomFan);
		FanOnCommand bedRoomFanOnCommand = new FanOnCommand(bedRoomFan);
		FanOffCommand bedRoomFanOffCommand = new FanOffCommand(bedRoomFan);
		
		GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(mainGarage);
		GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(mainGarage);
		
		remote.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remote.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
		remote.setCommand(2, livingRoomFanOnCommand, livingRoomFanOffCommand);
		remote.setCommand(3, bedRoomFanOnCommand, bedRoomFanOffCommand);
		remote.setCommand(4, garageDoorOpenCommand, garageDoorCloseCommand);
		
		remote.onButton(0);
		remote.undoButton();
		remote.offButton(0);
		remote.onButton(1);
		remote.offButton(1);
		remote.undoButton();
		remote.onButton(2);
		remote.offButton(2);
		remote.onButton(3);
		remote.onButton(3);
		remote.undoButton();
		remote.offButton(3);
		remote.onButton(4);
		remote.undoButton();
		remote.offButton(4);
		
		// Party mode
		TV tv = new TV("Living Room");
		TVOnCommand tvOnCommand = new TVOnCommand(tv);
		TVOffCommand tvOffCommand = new TVOffCommand(tv);
		
		Stereo stereo = new Stereo("Living Room");
		StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
		StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
		
		Command[] partyOn = {livingRoomLightOnCommand, tvOnCommand, stereoOnCommand, livingRoomFanOnCommand};
		Command[] partyOff = {livingRoomLightOffCommand, tvOffCommand, stereoOffCommand, livingRoomFanOffCommand};
		
		MacroCommand partyOnCommand = new MacroCommand(partyOn);
		MacroCommand partyOffCommand = new MacroCommand(partyOff);
		
		remote.setCommand(5, partyOnCommand, partyOffCommand);
		remote.onButton(5);
		remote.undoButton();
		remote.offButton(5);
		
	}

}
