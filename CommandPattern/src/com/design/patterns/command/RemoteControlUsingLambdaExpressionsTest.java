package com.design.patterns.command;

import com.design.patterns.command.vendor.Fan;
import com.design.patterns.command.vendor.Garage;
import com.design.patterns.command.vendor.Light;
import com.design.patterns.command.vendor.Stereo;
import com.design.patterns.command.vendor.TV;

public class RemoteControlUsingLambdaExpressionsTest {
	
	public static void main(String args[]) {
		RemoteControlUsingLambdaExpressions remote = new RemoteControlUsingLambdaExpressions();
		
		Light livingRoomLight = new Light("Living Room");
		Fan livingRoomFan = new Fan("Living Room");
		Garage garage = new Garage("");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		
		remote.setCommandForLambdaExpressions(0, livingRoomLight::on, livingRoomLight::off);
		remote.setCommandForLambdaExpressions(1, livingRoomFan::on, livingRoomFan::off);
		remote.setCommandForLambdaExpressions(2, tv::on, tv::off);
		remote.setCommandForLambdaExpressions(3, garage::open, garage::close);
		
		//Multiple functionalities in single command
		CommandForLambdaExpressions stereoOnWithCD = () -> { stereo.on(); stereo.setCD(); stereo.setVolume(); };
		remote.setCommandForLambdaExpressions(4, stereoOnWithCD, stereo::off);
		
		remote.onButton(0);
		remote.offButton(0);
		remote.onButton(1);
		remote.offButton(1);
		remote.onButton(2);
		remote.offButton(2);
		remote.onButton(3);
		remote.offButton(3);
		remote.onButton(4);
		remote.offButton(4);
		remote.onButton(5);
		remote.offButton(5);
	}
	

}
