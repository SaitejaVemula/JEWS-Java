import java.util.Scanner;

public class TernaryOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your age :  ");
    byte age = sc.nextByte();

    boolean isAnAdult = false;
    isAnAdult = age >= 18 ? true : false;

    if(isAnAdult) {
      System.out.println("You are an adult");
    } else {
      System.out.println("You are not an adult");
    }
  }
}