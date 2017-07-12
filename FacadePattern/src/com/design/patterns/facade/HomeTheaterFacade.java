package com.design.patterns.facade;

import com.design.patterns.facade.simple.Amplifier;
import com.design.patterns.facade.simple.DVDPlayer;
import com.design.patterns.facade.simple.Light;
import com.design.patterns.facade.simple.PopcornPopper;
import com.design.patterns.facade.simple.Projector;
import com.design.patterns.facade.simple.Screen;

public class HomeTheaterFacade {
	
	Amplifier amp;
	Projector proj;
	Light light;
	DVDPlayer dvd;
	PopcornPopper popper;
	Screen screen;
	
	public HomeTheaterFacade(Amplifier amp, Projector proj, Light light, DVDPlayer dvd, PopcornPopper popcorn, Screen screen) {
		this.amp = amp;
		this.proj = proj;
		this.light = light;
		this.dvd = dvd;
		this.popper = popcorn;
		this.screen = screen;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Ready to watch a movie...");
		popper.on();
		popper.pop();
		light.dim();
		screen.down();
		proj.on();
		proj.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		light.on();
		screen.up();
		proj.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}

}
