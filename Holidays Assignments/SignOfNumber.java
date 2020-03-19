// importing scanner class to take input from the user.
import java.util.Scanner;

public class SignOfNumber {

  // created a static void method, that prints the output (i.e., sign of the number)
  public static void signOfNumber(int num) {
    if(num == 0) {
      System.out.println("Number is zero, its neither positive, nor negative.");
    } else if(num > 0) {
      System.out.println(num + " is a positive number.");
    } else {
      System.out.println(num + " is a negative number.");
    }
  } 

  public static void main(String[] args) {
    // Created a scanner object named "sc"
    Scanner sc = new Scanner(System.in);

    // asking user for the number(input)
    System.out.print("Enter a number to know its sign :  ");
    // storing the entered number in "num"
    int num = sc.nextInt();

    // closing the scanner ("sc" object)
    sc.close();

    // calling the signOfNumber() method
    signOfNumber(num);

  }

}