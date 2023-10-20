package com.javapractice;

public class Main {
    public static void main(String[] args) {
        //declare variables
        boolean continueCalculations = true;

        PurchasedItem item = new PurchasedItem();
        VAT vat = new VAT();
        Cost cost = new Cost();
        Quantity quantity = new Quantity();
        Exit input = new Exit();

        while (continueCalculations) {
            vat.input();
            cost.input();
            quantity.input();

            item.addItem(cost.getCostPrice(),vat.getVatRate(),quantity.getQuantity());

            input.input();
            if ((input.getMessage()).equalsIgnoreCase("QUIT")) {
                continueCalculations = false;
            }
        }
        //after quit print sorted array
        //use collections to sort the array prices and then output it
        item.sortList();
        item.printList();
    }
}
