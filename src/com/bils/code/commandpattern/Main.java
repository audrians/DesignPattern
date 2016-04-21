package com.bils.code.commandpattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoor garageDoor = new GarageDoor();
        GarageOpenCommand garageOpenCommand = new GarageOpenCommand(garageDoor);
        GarageCloseCommand garageCloseCommand = new GarageCloseCommand(garageDoor);

        remote.setCommand(0, lightOnCommand, lightOffCommand);
        remote.setCommand(1, garageOpenCommand, garageCloseCommand);

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        remote.undoButton();
        remote.offButtonWasPressed(1);
        remote.undoButton();

        System.out.println("==========================");
        System.out.println("This is macro command: ");
        MacroCommand macroOnCommand = new MacroCommand(
                new Command[]{new GarageOpenCommand(garageDoor), new LightOnCommand(light)});
        MacroCommand macroOffCommand = new MacroCommand(
                new Command[]{new GarageCloseCommand(garageDoor), new LightOffCommand(light)});
        remote.setCommand(0, macroOnCommand, macroOffCommand);
        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
    }
}
