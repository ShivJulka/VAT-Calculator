package com.javapractice;

import java.util.Scanner;

class Quantity implements Prompt{
    int quantity;

    private Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Enter the quantity: ");
        quantity = sc.nextInt();
    }

    public int getQuantity(){
        return quantity;
    }
}