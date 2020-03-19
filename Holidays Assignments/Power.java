import java.util.Scanner;

public class Power {
  
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
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the number and it power to find the result :  ");
    int num = sc.nextInt();
    int pow = sc.nextInt();

    System.out.println(num + " to the power of " + pow + " is : " + power(num, pow));
  }

}