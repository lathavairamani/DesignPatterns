/**
 * 
 */
package com.design.patterns.observer;

import java.util.Observable;
import java.util.Observer;

import com.design.patterns.common.DisplayElement;
import com.design.patterns.observable.WeatherData;
import com.design.patterns.pojo.WeatherElements;

/**
 * @author latha
 *
 */
public class ForecastDisplay implements DisplayElement, Observer {
	
	Observable observable;
	private WeatherElements weatherElements;
	private float currentPressure = 29.92f;
	private float lastPressure;
	
	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof WeatherData){
			WeatherData data = (WeatherData)o;
			lastPressure = currentPressure;
			this.weatherElements = data.getWeatherElements();
			this.currentPressure = weatherElements.getPressure();
			display();
		}
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.common.DisplayElement#display()
	 */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Last Pressure is: " + lastPressure);
		System.out.println("Current Pressure is: " + currentPressure );
	}

}
