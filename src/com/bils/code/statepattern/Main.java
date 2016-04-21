package com.bils.code.statepattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PhotoBoxMachine photoBoxMachine = new PhotoBoxMachine(5);
        System.out.println(photoBoxMachine);

        photoBoxMachine.insertPoint();
        photoBoxMachine.takePicture();
        photoBoxMachine.editPicture();
        System.out.println(photoBoxMachine);

        photoBoxMachine.insertPoint();
        photoBoxMachine.takePicture();
        photoBoxMachine.editPicture();
        System.out.println(photoBoxMachine);
    }
}
