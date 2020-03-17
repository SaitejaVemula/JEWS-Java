import java.util.Scanner;
public class PrimeNumber {

  public static boolean isAPrime(int num) {
    for(int i = 2; i <= num / 2; i++) {
      if(num % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if its a prime or not :  ");
    int num = sc.nextInt();
    
    if(num == 0) {
      System.out.println("Entered number is zero.");
    } else if (num == 1) {
      System.out.println("1 is neither prime not compisite");
    } else {
      if(isAPrime(num)) {
        System.out.println(num + " is a prime number");
      } else {
        System.out.println(num + " is a composite number");
      }
    }
  }
}