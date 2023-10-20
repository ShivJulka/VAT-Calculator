package com.javapractice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Cost implements Prompt{
    double costPrice;

    private Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Enter the cost: ");
        costPrice = sc.nextDouble();
    }

    public double getCostPrice(){
        return costPrice;
    }
}
