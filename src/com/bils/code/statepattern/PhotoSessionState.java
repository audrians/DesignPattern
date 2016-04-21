package com.bils.code.statepattern;

/**
 * Created by nabilla on 3/16/16.
 */
public class PhotoSessionState implements State {

    private PhotoBoxMachine photoBoxMachine;

    public PhotoSessionState(PhotoBoxMachine photoBoxMachine) {
        this.photoBoxMachine = photoBoxMachine;
    }

    @Override
    public void insertPoin() {
        System.out.println("You can't inserted another poin");
    }

    @Override
    public void ejectPoin() {
        System.out.println("Sorry, your pictures has been procceed");
    }

    @Override
    public void takePicture() {
        System.out.println("Sorry your time for take picture is over");
    }

    @Override
    public void editPicture() {
        System.out.println("Please wait, we already processing your pictures to edit");
        photoBoxMachine.setState(photoBoxMachine.getPhotoReadyState());
    }

    @Override
    public void release() {
        System.out.println("No picture released");
    }
}
