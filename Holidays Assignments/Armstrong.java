import java.util.Scanner;

public class Armstrong {

  // a static method that returns true if the passed number is armstrong
  // else it returns false
  public static boolean isAnArmstrong(int num) {
    int temp = num, sum = 0;
    
    // finding the sum of cubes of individual digits
    while(temp > 0) {
      int digit = temp % 10;
      temp /= 10;
      sum = sum + (digit * digit * digit);
    }

    if(sum == num) {
      return true;
    }

    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if its an armstrong number or not :  ");
    int num = sc.nextInt();

    if(isAnArmstrong(num)) {
      System.out.println(num + " is an Armstrong number.");
    } else {
      System.out.println(num + " is not an Armstrong number.");
    }
  }
}