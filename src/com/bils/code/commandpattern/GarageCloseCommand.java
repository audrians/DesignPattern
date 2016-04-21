package com.bils.code.commandpattern;

/**
 * Created by nabilla on 2/18/16.
 */
public class GarageCloseCommand implements Command {

    private GarageDoor garageDoor;

    public GarageCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.garageDown();
    }

    @Override
    public void undo() {
        garageDoor.garageUp();
    }
}
