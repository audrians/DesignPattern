package com.bils.code.commandpattern;

/**
 * Created by nabilla on 2/19/16.
 */
public class LightOffCommand implements Command{

    private Light light;

    @Override
    public void execute() {
        light.lightOff();
    }

    @Override
    public void undo() {
        light.lightOn();
    }

    public LightOffCommand(Light light) {
        this.light = light;
    }
}
