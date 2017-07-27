package com.design.patterns.mvc.heart.model;

import com.design.patterns.mvc.view.BPMObserver;
import com.design.patterns.mvc.view.BeatObserver;

public interface HeartModelInterface {
	int getHeartRate();
	void registerObserver(BeatObserver beatObserver);
	void removeObserver(BeatObserver beatObserver);
	void registerObserver(BPMObserver bpmObserver);
	void removeObserver(BPMObserver bpmObserver);
}
