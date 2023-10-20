package com.javapractice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class VAT implements Prompt{
    int vatRate;

    private Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Enter the vat rate: ");
        vatRate = sc.nextInt();
    }

    public int getVatRate(){
        return vatRate;
    }
}