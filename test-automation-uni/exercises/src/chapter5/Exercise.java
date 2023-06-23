package chapter5;

import java.util.Scanner;

public class Exercise {
    public static void main(String args[]){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter base cost of the plan");
        Double planFee = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        Double overageMinutes = scanner.nextDouble();
        Double overageFee = 0.0;
        Double subTotal = 0.00;
        Double tax = 0.15;
        double calculatedTax = 0.0;
        Double finalTotal;
        if (overageMinutes > 0){
            overageFee = overageMinutes * 0.25;
        }


        subTotal = planFee + overageFee;
        calculatedTax = subTotal * tax;
        finalTotal =  planFee + overageFee + calculatedTax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $"+planFee);
        System.out.println("Overage: $"+overageFee);
        System.out.println("Overage: $"+calculatedTax);
        System.out.println("Overage: $"+finalTotal);
    }
}
