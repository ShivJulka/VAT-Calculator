package com.javapractice;

import java.util.InputMismatchException;
import java.util.Scanner;

class Exit implements Prompt{
    String exit;

    private Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Enter the quit to exit or any other key to continue: ");
        exit = sc.nextLine();
    }

    public String getMessage(){
        return exit;
    }
}