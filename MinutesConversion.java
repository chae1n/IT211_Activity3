//Step 1: Set up the main class and import all the necessary packages

import java.util.Scanner;

public class MinutesConversion {

    public static void main(String[] args) {
        //Step 2: Declare variable for user input and conversion factors
        int minutes;
        double hours;
        double days;
        double MIN_IN_HOUR = 60;
        double HRS_IN_DAY = 24;
        //Step 3: Prompt user for input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes >>");
        minutes = input.nextInt();
        //Step 4: Perform the conversion 
        hours = minutes / MIN_IN_HOUR;
        days = hours / HRS_IN_DAY;
        //Step 5: Display the results
        System.out.println(minutes + " minutes is " + hours + " hours or " + days + "days.");
    }
}
