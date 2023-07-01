package chapter7;

import java.util.Scanner;

public class Exercise {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] daysOFTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String args[]){
        System.out.println("What is the day of the week?");
        System.out.println(pickDay());

    }

    public static String pickDay(){
        int dayOfTheWeek = scanner.nextInt();
        String dayOfTheWeekString = null;
        for(int i = 1; i < daysOFTheWeek.length; i++){
            dayOfTheWeekString = daysOFTheWeek[dayOfTheWeek -1 ];
        }
        return dayOfTheWeekString;
    }
}
