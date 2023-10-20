package com.javapractice;

public class Main {
    public static void main(String[] args) {
        //declare variables
        boolean continueCalculations = true;

        PurchasedItem item = new PurchasedItem();
        Prompt costPrompt= new doublePrompt();
        Prompt vatPrompt = new doublePrompt();
        Prompt quantityPrompt = new intPrompt();
        Prompt exitPrompt = new stringPrompt();


        while (continueCalculations) {
            double cost = (double) costPrompt.getValue("Enter the cost: ");
            double vat = (double) vatPrompt.getValue("Enter the vat: ");
            int quantity = (int) quantityPrompt.getValue("Enter the quantity: ");

            item.setItems(cost,vat,quantity);

            String input = (String) exitPrompt.getValue("Enter the quit to exit or any other key to continue: ");

            if (input.equalsIgnoreCase("QUIT")) {
                continueCalculations = false;
            }
        }
        //after quit print sorted array
        //use collections to sort the array prices and then output it
        item.sortList();
        item.printList();
    }
}
