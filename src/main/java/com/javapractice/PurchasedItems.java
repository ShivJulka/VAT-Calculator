package com.javapractice;

import java.util.ArrayList;
import java.util.Collections;

class PurchasedItem {
    private ArrayList<Double> costValues = new ArrayList<>();
    private ArrayList<Double> vatValues = new ArrayList<>();
    private ArrayList<Double> priceValues = new ArrayList<>();
    private double totalCost=0;

    public void setItems(double costPrice, double vatRate, int quantity){
        costValues.add(costPrice);
        vatValues.add(vatRate);

        double vatValue = costPrice*((vatRate/100)+1);
        System.out.printf("Price per item %.2f %n",costPrice+vatValue);
        double finalPrice=(costPrice+vatValue)*quantity;
        priceValues.add(finalPrice);
        //quantityValues.add(quantity);
        totalCost+=finalPrice;
        System.out.printf("the total cost is: £%.2f%n",totalCost);
    }

    public void printList(){
        System.out.println("\nThese are the sorted prices: ");
        for (double price : priceValues) {
            System.out.printf("£%.2f \t", price);
        }
        System.out.printf("\n the total cost is £%.2f",totalCost);
    }

    public void sortList(){
        Collections.sort(priceValues);
        Collections.sort(vatValues);
        Collections.sort(costValues);
    }
}