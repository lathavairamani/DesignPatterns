package com.design.patterns.mvc.model;

import com.design.patterns.mvc.view.BPMObserver;
import com.design.patterns.mvc.view.BeatObserver;

public interface BeatModelInterface {
	public void initialize();
	public void on();
	public void off();
	public void setBPM(int bpm);
	public int getBPM();
	public void registerObserver(BeatObserver beatObserver);
	public void removeObserver(BeatObserver beatObserver);
	public void removeObserver(BPMObserver bpmObserver);
	public void registerObserver(BPMObserver bpmObserver);
}
