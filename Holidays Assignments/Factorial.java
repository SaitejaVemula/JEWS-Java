// Importing Scanner class from "util" package
import java.util.Scanner;

public class Factorial
{
  // this static function returns the factorial of the given number
  public static long factorial(byte num) {
    long result = 1;

    if(num == 0 || num == 1) {
      // returns 1 if the number is 0 or 1
      return 1;
    }

    // calculating the factorial by using a for loop
    for (int i = 1; i <= num; i++) {
      result *= i;
    }

    // returns the factorial
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number to find its factorial :  ");
    byte num = sc.nextByte();

    // closing the scanner ("sc" object)
    sc.close();

    System.out.println("Factorial of " + num + " is " + factorial(num));
  }

}