package chapter6;

public class PhoneBillCalculator {
    public static void main(String[] args){
        PhoneBill bill = new PhoneBill(1234);
        bill.setNumberOfMinutes(100);
        bill.printItemizedBill();
    }
}
