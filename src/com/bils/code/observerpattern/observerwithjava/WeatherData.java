package com.bils.code.observerpattern.observerwithjava;

import java.util.Observable;

/**
 * Created by nabilla on 3/20/16.
 */
public class WeatherData extends Observable {

    private float temperature;

    private float humadity;

    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humadity, float pressure) {
        this.temperature = temperature;
        this.humadity = humadity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumadity() {
        return humadity;
    }

    public void setHumadity(float humadity) {
        this.humadity = humadity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
