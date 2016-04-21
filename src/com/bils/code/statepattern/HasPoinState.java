package com.bils.code.statepattern;

import java.util.Random;

/**
 * Created by nabilla on 3/16/16.
 */
public class HasPoinState implements State {

    private Random randomWinner = new Random(System.currentTimeMillis());

    private PhotoBoxMachine photoBoxMachine;

    public HasPoinState(PhotoBoxMachine photoBoxMachine) {
        this.photoBoxMachine = photoBoxMachine;
    }

    @Override
    public void insertPoin() {
        System.out.println("You can't insert another poin to photo box");
    }

    @Override
    public void ejectPoin() {
        System.out.println("You've been ejected from system, please insert your poin once again");
        photoBoxMachine.setState(photoBoxMachine.getNoPoinState());
    }

    @Override
    public void takePicture() {
        System.out.println("Your turn to take pictures, please ready to pose ....");
        int winner = randomWinner.nextInt(10);
        if (winner == 0 && photoBoxMachine.getCount() > 1) {
            photoBoxMachine.setState(photoBoxMachine.getWinnerState());
        } else {
            photoBoxMachine.setState(photoBoxMachine.getPhotoSessionState());
        }
    }

    @Override
    public void editPicture() {
        System.out.println("No picture to edit, machine still processing to take picture");
    }

    @Override
    public void release() {
        System.out.println("No picture released");
    }
}
