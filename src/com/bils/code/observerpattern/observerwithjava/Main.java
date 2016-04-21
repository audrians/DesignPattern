package com.bils.code.observerpattern.observerwithjava;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurement(80, 65, 30.4f);
        weatherData.setMeasurement(82, 70, 29.2f);
        weatherData.setMeasurement(78, 90, 29.2f);
    }
}
