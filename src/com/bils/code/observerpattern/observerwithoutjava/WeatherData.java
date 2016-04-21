package com.bils.code.observerpattern.observerwithoutjava;

import java.util.ArrayList;

/**
 * Created by nabilla on 3/20/16.
 */
public class WeatherData implements Subject {

    private ArrayList observerList;

    private float temperature;

    private float humadity;

    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        int index = observerList.indexOf(obs);
        if (index > 0) {
            observerList.remove(obs);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            Observer observer = (Observer) observerList.get(i);
            observer.update(temperature, humadity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humadity, float pressure) {
        this.temperature = temperature;
        this.humadity = humadity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
