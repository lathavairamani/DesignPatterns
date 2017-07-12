package com.design.patterns.facade;

import com.design.patterns.facade.simple.Amplifier;
import com.design.patterns.facade.simple.DVDPlayer;
import com.design.patterns.facade.simple.Light;
import com.design.patterns.facade.simple.PopcornPopper;
import com.design.patterns.facade.simple.Projector;
import com.design.patterns.facade.simple.Screen;

public class HomeTheaterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amplifier amp = new Amplifier();
		Projector proj = new Projector();
		Light light = new Light();
		DVDPlayer dvd =  new DVDPlayer();
		PopcornPopper popper = new PopcornPopper();
		Screen screen = new Screen();
		
		HomeTheaterFacade facade = new HomeTheaterFacade(amp, proj, light, dvd, popper, screen);
		facade.watchMovie("Spider Man");
		facade.endMovie();
	}

}
