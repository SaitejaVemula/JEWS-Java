import java.util.Scanner;

public class SignOfNumber {

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
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number to know its sign :  ");
    int num = sc.nextInt();

    signOfNumber(num);

  }

}