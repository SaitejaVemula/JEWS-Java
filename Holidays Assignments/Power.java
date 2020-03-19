// importing scanner class to take input from the user.
import java.util.Scanner;

public class Power {
  
  // created a static method, that returns the num ** pow
  public static long power(int num, int pow) {
    long result = 1;

    if(num == 0 || num == 1) {
      return 1;
    }

    for(int i = 0; i < pow; i++) {
      result = result * num;
    }

    return result;
  }

  public static void main(String[] args) {
    // Created a scanner object named "sc"
    Scanner sc = new Scanner(System.in);

    // asking user for the number and the power(input)
    System.out.print("Enter the number and it power to find the result :  ");
    // storing the entered number in "num"
    int num = sc.nextInt();
    // storing the entered number in "pow"
    int pow = sc.nextInt();

    System.out.println(num + " to the power of " + pow + " is : " + power(num, pow));
  }

}