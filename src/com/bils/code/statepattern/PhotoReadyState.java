package com.bils.code.statepattern;

/**
 * Created by nabilla on 3/16/16.
 */
public class PhotoReadyState implements State {
    private PhotoBoxMachine photoBoxMachine;

    public PhotoReadyState(PhotoBoxMachine photoBoxMachine) {
        this.photoBoxMachine = photoBoxMachine;
    }

    @Override
    public void insertPoin() {
        System.out.println("Please wait, we already processing your poin");
    }

    @Override
    public void ejectPoin() {
        System.out.println("Sorry, You've been through edit your picture and still processing");
    }

    @Override
    public void takePicture() {
        System.out.println("Turning twice not help you to get another take picture session");
    }

    @Override
    public void editPicture() {
        System.out.println("Sorry, your picture is still processing");
    }

    @Override
    public void release() {
        if (photoBoxMachine.getCount() > 0) {
            System.out.println("Take your picture and thank you for using photo box");
            photoBoxMachine.setState(photoBoxMachine.getNoPoinState());
            photoBoxMachine.takeoutPoin();
        } else {
            System.out.println("Sorry, your points is empty, please topup to take another photo here");
            photoBoxMachine.setState(photoBoxMachine.getSoldOutPhotoState());
        }
    }
}
