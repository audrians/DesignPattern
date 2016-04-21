package com.bils.code.commandpattern;

/**
 * Created by nabilla on 2/18/16.
 */
public class GarageOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.garageUp();
    }

    @Override
    public void undo() {
        garageDoor.garageDown();
    }
}
