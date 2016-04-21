package com.bils.code.statepattern;

/**
 * Created by nabilla on 3/16/16.
 */
public class NoPoinState implements State {

    private PhotoBoxMachine photoBoxMachine;

    public NoPoinState(PhotoBoxMachine photoBoxMachine) {
        this.photoBoxMachine = photoBoxMachine;
    }

    @Override
    public void insertPoin() {
        System.out.println("You've inserted a poin");
        photoBoxMachine.setState(photoBoxMachine.getHasPoinState());
    }

    @Override
    public void ejectPoin() {
        System.out.println("You haven't inserted a poin");
    }

    @Override
    public void takePicture() {
        System.out.print("Your turned take picture, but there's no poin");
    }

    @Override
    public void editPicture() {
        System.out.println("Your turned edit picture, but there's no poin");
    }

    @Override
    public void release() {
        System.out.println("You need to buy poin first");
    }
}
