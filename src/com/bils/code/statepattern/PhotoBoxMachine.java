package com.bils.code.statepattern;

/**
 * Created by nabilla on 3/16/16.
 */
public class PhotoBoxMachine{

    private State noPoinState;

    private State hasPoinState;

    private State photoSessionState;

    private State photoReadyState;

    private State soldOutPhotoState;

    private State state = soldOutPhotoState;

    private State winner;

    public int count = 0;

    public PhotoBoxMachine(int numberPoin) {
        System.out.println("Your inventory poin: " + numberPoin);
        noPoinState = new NoPoinState(this);
        hasPoinState = new HasPoinState(this);
        photoSessionState = new PhotoSessionState(this);
        photoReadyState = new PhotoReadyState(this);
        soldOutPhotoState = new SoldOutPhotoState(this);
        winner = new WinnerState(this);
        this.count = numberPoin;
        if (numberPoin > 0) {
            state = noPoinState;
        }
    }

    public void insertPoint() {
        state.insertPoin();
    }

    public void ejectPoin() {
        state.ejectPoin();
    }

    public void takePicture() {
        state.takePicture();
    }

    public void editPicture() {
        state.editPicture();
        state.release();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoPoinState() {
        return noPoinState;
    }

    public State getHasPoinState() {
        return hasPoinState;
    }

    public State getPhotoSessionState() {
        return photoSessionState;
    }

    public State getPhotoReadyState() {
        return photoReadyState;
    }

    public State getSoldOutPhotoState() {
        return soldOutPhotoState;
    }

    public State getWinnerState() {
        return winner;
    }

    public int getCount() {
        return count;
    }

    public void takeoutPoin() {
        System.out.println("A poin has been used");
        if (count > 0) {
            count -= 1;
            System.out.println("Your inventory poin: " + count);
        }
    }
}
