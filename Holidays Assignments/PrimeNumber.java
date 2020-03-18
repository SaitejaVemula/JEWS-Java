//Importing the Scanner class
import java.util.Scanner;

// Created a class named PrimeNumber
public class PrimeNumber {

  // Created a static method named "isAPrime"
  // It returns true if passed number is prime number
  // It returns false if its a composite number
  public static boolean isAPrime(int num) {
    for(int i = 2; i <= num / 2; i++) {
      if(num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    // Created a scanner object named "sc"
    Scanner sc = new Scanner(System.in);

    // Asking the user for input
    System.out.print("Enter a number to check if its a prime or not :  ");
    
    // Storing the given number in "num"
    int num = sc.nextInt();
    sc.close();
    
    if(num == 0) {

      // Printing the entered number is zero if num equals to zero
      System.out.println("Entered number is zero.");

    } else if (num == 1) {

      // If entered number is 1, then printing that its neither prime nor composite
      System.out.println("1 is neither prime not compisite");

    } else {

      // Calling the "isAPrime" static method and passing it the entered number.
      if(isAPrime(num)) {

        // if it returns true, it means it a prime number. Hence the output 
        System.out.println(num + " is a prime number");
        
      } else {

        // if it returns true, it means it a composite number (not a prime number). Hence the output 
        System.out.println(num + " is a composite number");

      }

    }
  }
}