package com.bils.code.commandpattern;

/**
 * Created by nabilla on 2/18/16.
 */
public class SimpleRemoteControl {

    private Command[] onCommand;

    private Command[] offCommand;

    private Command undo;

    public SimpleRemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        undo = noCommand;
    }

    public void setCommand(int slotNumb, Command onCommand, Command offCommand) {
        this.onCommand[slotNumb] = onCommand;
        this.offCommand[slotNumb] = offCommand;
    }

    public void onButtonWasPressed(int slotNumb) {
        this.onCommand[slotNumb].execute();
        undo = this.onCommand[slotNumb];
    }

    public void offButtonWasPressed(int slotNumb) {
        this.offCommand[slotNumb].execute();
        undo = this.offCommand[slotNumb];
    }

    public void undoButton() {
        undo.undo();
    }
}
