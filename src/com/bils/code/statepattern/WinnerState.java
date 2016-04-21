package com.bils.code.statepattern;

/**
 * Created by nabilla on 4/21/16.
 */
public class WinnerState implements State {

    private PhotoBoxMachine photoBoxMachine;

    public WinnerState(PhotoBoxMachine photoBoxMachine) {
        this.photoBoxMachine = photoBoxMachine;
    }

    @Override
    public void insertPoin() {
        System.out.println("Sorry, you can't process this request");
    }

    @Override
    public void ejectPoin() {
        System.out.println("Sorry, you can't process this request");
    }

    @Override
    public void takePicture() {
        System.out.println("Sorry, you can't process this request");
    }

    @Override
    public void editPicture() {
        System.out.println("Sorry, you can't process this request");
    }

    @Override
    public void release() {
        System.out.println("YOU'RE THE WINNER! you get two photo session for your quarter");
        photoBoxMachine.takeoutPoin();
        if (photoBoxMachine.getCount() == 0) {
            photoBoxMachine.setState(photoBoxMachine.getNoPoinState());
        } else {
            photoBoxMachine.takeoutPoin();
            if (photoBoxMachine.getCount() > 0) {
                photoBoxMachine.setState(photoBoxMachine.getNoPoinState());
            } else {
                System.out.println("Oops, out of poin");
                photoBoxMachine.setState(photoBoxMachine.getSoldOutPhotoState());
            }
        }
    }
}
