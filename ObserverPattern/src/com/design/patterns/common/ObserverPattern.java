/**
 * 
 */
package com.design.patterns.common;

import com.design.patterns.observable.WeatherData;
import com.design.patterns.observer.CurrentConditionsDisplay;
import com.design.patterns.observer.ForecastDisplay;
import com.design.patterns.pojo.WeatherElements;

/**
 * @author latha
 *
 */
public class ObserverPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherElements weatherElements = new WeatherElements();
		
		WeatherData data = new WeatherData();
		
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(data);
		ForecastDisplay forecast = new ForecastDisplay(data);
		
		weatherElements.setHumidity(20);
		weatherElements.setTemperature(80);
		weatherElements.setPressure(30);
		data.setMeasurements(weatherElements);
		
		weatherElements.setHumidity(60);
		weatherElements.setTemperature(70);
		weatherElements.setPressure(80);
		data.setMeasurements(weatherElements);
	}

}
