package com.design.patterns.observable;

import java.util.Observable;

import com.design.patterns.pojo.WeatherElements;

public class WeatherData extends Observable {
	
	private WeatherElements weatherElements;
	
	public WeatherElements getWeatherElements() {
		return weatherElements;
	}

	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(WeatherElements weatherElements){
		this.weatherElements = weatherElements;
		measurementsChanged();
	}

}
