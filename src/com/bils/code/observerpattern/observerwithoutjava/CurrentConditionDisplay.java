package com.bils.code.observerpattern.observerwithoutjava;

/**
 * Created by nabilla on 3/20/16.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humadity;

    private float pressure;

    private Subject weaterData;

    public CurrentConditionDisplay(Subject weaterData) {
        this.weaterData = weaterData;
        weaterData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions : Temperature " + temperature + " degree farenheit, humadity " + humadity +
        "% humadity, pressure " + pressure);
    }

    @Override
    public void update(float temperature, float humadity, float pressure) {
        this.temperature = temperature;
        this.humadity = humadity;
        this.pressure = pressure;
        display();
    }
}
