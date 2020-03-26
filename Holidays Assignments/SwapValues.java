// Importing Scanner class
import java.util.Scanner;

// Making a class named "SwapValues"
public class SwapValues {
  public static void main(String[] args) {
    // Creating a scanner object named "sc"
    Scanner sc = new Scanner(System.in);

    // Asking the user to input to values
    System.out.print("Enter two integer for 'a' and 'b' :  ");
    // Reading/Storing the entered values
    int a = sc.nextInt();
    int b = sc.nextInt();

    // Printing the values before swapping
    System.out.println("Before swapping, the values of 'a' and 'b' are :  " + a + " and " + b);

    // Logic for swapping the values
    a = a+b;
    b = a-b;
    a = a-b;

    // Printing the values after swapping
    System.out.println("After swapping, the values of 'a' and 'b' are :  " + a + " and " + b);
  }
}