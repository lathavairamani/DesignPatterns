package com.design.patterns.observer;

import java.util.Observable;
import java.util.Observer;

import com.design.patterns.common.DisplayElement;
import com.design.patterns.observable.WeatherData;
import com.design.patterns.pojo.WeatherElements;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private WeatherElements weatherElements;

	public CurrentConditionsDisplay(Observable observable) {
		// TODO Auto-generated constructor stub
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current Pressure is: " + weatherElements.getPressure());
		System.out.println("Current Temperature is: " + weatherElements.getTemperature());
		System.out.println("Current Humidity is: " + weatherElements.getHumidity());
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherData){
			WeatherData data = (WeatherData)o;
			this.weatherElements = data.getWeatherElements();
			display();
		}
	}

}
