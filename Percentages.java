//Step 1: Set up the main class and import the necessary packages
import java.util.Scanner;

public class Percentages {

  public static void main (String[] args) {
    //Step 2: Declare the variable for user input
    double num1,num2;
    //Step 3: Prompt the user for input
    Scanner kb = new Scanner (System.in);
    System.out.print(" Enter a double >>");
    num1 = kb.nextDouble();
    System.out.print("Enter another double >>");
    num2 = kb.nextDouble();
    //Step 4: Pass the value to a method named computePercent()
    computePercent (num1,num2);
    computePercent (num2,num1);
  }
    //Step 5: Call the computePercent() method with the original and reversed values
    public static void computePercent(double x, double y) {
      System.out.println(x + " is " + (x / y) * 100 + "% of " + y);
    }
  }