package com.bils.code.statepattern;

/**
 * Created by nabilla on 3/16/16.
 */
public class SoldOutPhotoState implements State {

    private PhotoBoxMachine photoBoxMachine;

    public SoldOutPhotoState(PhotoBoxMachine photoBoxMachine) {
        this.photoBoxMachine = photoBoxMachine;
    }

    @Override
    public void insertPoin() {
        System.out.println("Sorry, you didn't have poin to process this request");
    }

    @Override
    public void ejectPoin() {
        System.out.println("Sorry, you didn't insert point yet");
    }

    @Override
    public void takePicture() {
        System.out.println("Sorry, please top up poin first");
    }

    @Override
    public void editPicture() {
        System.out.println("Sorry, you can't processing this step without poin");
    }

    @Override
    public void release() {
        System.out.println("Sorry, no picture released");

    }
}
