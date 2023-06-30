package chapter6;

import java.awt.*;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allotedMinutes;
    private int numberOfMinutes;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBaseCost(){
        return baseCost;
    }
    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    public int getAllotedMinutes(){
        return allotedMinutes;
    }
    public void setAllotedMinutes(int allotedMinutes){
        this.allotedMinutes = allotedMinutes;
    }
    public int getNumberOfMinutes(){
        return numberOfMinutes;
    }
    public void setNumberOfMinutes(int numberOfMinutes){
        this.numberOfMinutes = numberOfMinutes;
    }

    public PhoneBill(){
        id = 0;
        baseCost = 0;
        allotedMinutes = 0;
        numberOfMinutes = 0;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 100;
        allotedMinutes = 10;
        numberOfMinutes = 5;
    }
    public PhoneBill(int id, double baseCost, int allotedMinutes, int numberOfMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.allotedMinutes = allotedMinutes;
        this.numberOfMinutes = numberOfMinutes;
    }

    public double calculateOverageFee (){
        if(numberOfMinutes <= allotedMinutes){
            return 0;
        }
        double overageCharge = 0.25;
        double overageMinutes = numberOfMinutes - allotedMinutes;
        return overageMinutes * overageCharge;
    }

    public double calculateTax(){
        double taxRate = 0.15;

        return (baseCost + calculateOverageFee()) * taxRate;
    }

    public double finalTotal(){
        return baseCost + calculateOverageFee() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $"+ baseCost);
        System.out.println("Overage: $"+ calculateOverageFee());
        System.out.println("Tax: $"+ calculateTax());
        System.out.println("total: $"+ finalTotal());
    }

}
