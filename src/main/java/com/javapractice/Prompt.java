package com.javapractice;

import java.util.InputMismatchException;
import java.util.Scanner;

//interface in Java
interface Prompt{
    Object getValue(String message);
}

class intPrompt implements Prompt{
    private Scanner sc = new Scanner(System.in);
    public Object getValue(String message){
        while (true){
            System.out.print(message);
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value. Please enter valid data types.");
                sc.next();
            }
        }
    }
}

class doublePrompt implements Prompt{
    private Scanner sc = new Scanner(System.in);
    public Object getValue(String message){
        while (true){
            System.out.print(message);
            try {
                return sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value. Please enter valid data types.");
                sc.next();
            }
        }
    }
}

class stringPrompt implements Prompt{
    private Scanner sc = new Scanner(System.in);
    public Object getValue(String message){
        while (true){
            System.out.print(message);
            try {
                return sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Incorrect value. Please enter valid data types.");
                sc.next();
            }
        }
    }
}