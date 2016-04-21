package com.bils.code.observerpattern.observerwithjava;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by nabilla on 3/20/16.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable weatherData;

    private float temperature;

    private float humadity;

    private float pressure;

    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions : Temperature " + temperature + " degree farenheit, humadity " + humadity +
                "% humadity, pressure " + pressure);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humadity = weatherData.getHumadity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
