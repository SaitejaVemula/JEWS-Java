// Importing the Scanner class from "util" package.
import java.util.Scanner;

// Created a class named "ArithmeticOperations"
public class ArithmeticOperations {

  // A static method that returns the sum of inputted two numbers
  public static void add(int a, int b) {
    System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
  }
  
  // A static method that returns the difference of inputted two numbers
  public static void subtract(int a, int b) {
    System.out.println("Difference of " + a + " and " + b + " is " + (a + b));
  }
  
  // A static method that returns the product of inputted two numbers
  public static void multiply(int a, int b) {
    System.out.println("Product of " + a + " and " + b + " is " + (a * b));
  }
  
  // A static method that returns the division of inputted two numbers
  public static void divide(int a, int b) {
    System.out.println("Division of " + a + " by " + b + " is " + (a * 1.0f / b));
  }
  
  // A static method that calls appropriate arithmetic method based on the inputted sign.
  public static void performCalculation(int a, int b, char c) {
    
    switch(c) {
      case '+' : add(a, b); break;
      case '-' : subtract(a, b); break;
      case '*' : multiply(a, b); break;
      case '/' : divide(a, b); break;
      default : System.out.println("You've entered wrong choice");;
    }

  }

  // Main Method
  public static void main(String[] args) {
    
    // Created a Scanner object named "sc"
    Scanner sc = new Scanner(System.in);

    // Reading the operation sign
    System.out.println("Enter ");
    System.out.println("'+' for Addition");
    System.out.println("'-' for Substraction");
    System.out.println("'*' for Multiplication");
    System.out.println("'/' for Division");
    System.out.println("Enter the sign :  ");
    char c = sc.nextLine().charAt(0);

    // Reading two integer values to perform the above operation.
    System.out.print("Enter two integer values :  ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    // closing the Scanner object. 
    sc.close();

    // Making a method call and passing the user inputs.
    performCalculation(a,b,c);

  }
}