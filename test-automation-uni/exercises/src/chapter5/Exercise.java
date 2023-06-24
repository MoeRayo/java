package chapter5;

import java.util.Scanner;

public class Exercise {
    static double overageCharge = 0.25;
    static double taxRate = 0.15;

    public static void main(String args[]){
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Enter base cost of the plan");
        double planFee = scanner.nextDouble();

        System.out.println("Enter overage minutes:");
        double overageMinutes = scanner.nextDouble();
        scanner.close();

        double calculatedOverageFee = calculateOverageFee(overageMinutes);

        double tax = calculateTax(planFee, calculatedOverageFee, taxRate);

        double finalTotal = finalTotal(planFee, calculatedOverageFee, tax);


        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $"+planFee);
        System.out.println("Overage: $"+calculatedOverageFee);
        System.out.println("Tax: $"+tax);
        System.out.println("total: $"+finalTotal);
    }

    public static double calculateOverageFee (double overageMinutes){
        return overageMinutes > 0 ? overageMinutes * overageCharge : 0;
    }

    public static double calculateTax(double planFee, double calculatedOverageFee, double taxRate){
        return (planFee + calculatedOverageFee) * taxRate;
    }

    public static double finalTotal(double planFee, double calculatedOverageFee, double  newTax){
        return planFee + calculatedOverageFee + newTax;
    }
}
