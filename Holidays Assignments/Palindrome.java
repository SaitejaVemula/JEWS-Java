//Importing the Scanner class
import java.util.Scanner;

// Created a class named Palindrome
public class Palindrome {

  // created a static method named isAPalindrome
  // it returns true if the given number is a palindrome
  // else it returns false
  public static boolean isAPalindrome(int num) {
    int reverse = 0, temp = num;

    // logic to find the reverse of the given number
    while(temp > 0) {
      reverse = (reverse * 10) + (temp % 10);
      temp = temp / 10;
    }

    // checking whether if the reversed nember is equals to the given number
    if (reverse == num) {
      return true;
    }
    return false;
  }
  
  // Main method.
  public static void main(String[] args) {
    
    // Created an scanner object named "sc"
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number to check if its a palindrome or not :  ");
    int num = sc.nextInt();
    sc.close();

    if(isAPalindrome(num)) {
      System.out.println(num + " is a palindrome.");
    } else {
      System.out.println(num + " is not a palindrome.");
    }

  }
}