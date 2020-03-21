import java.util.Scanner;

public class ArithmeticOperations {
  
  public static void add(int a, int b) {
    System.out.println("Sum of " + a + " and " + b + " is " + (a + b));
  }

  public static void subtract(int a, int b) {
    System.out.println("Difference of " + a + " and " + b + " is " + (a + b));
  }

  public static void multiply(int a, int b) {
    System.out.println("Product of " + a + " and " + b + " is " + (a * b));
  }

  public static void divide(int a, int b) {
    System.out.println("Division of " + a + " by " + b + " is " + (a * 1.0f / b));
  }

  public static void performCalculation(int a, int b, char c) {
    
    switch(c) {
      case '+' : add(a, b); break;
      case '-' : subtract(a, b); break;
      case '*' : multiply(a, b); break;
      case '/' : divide(a, b); break;
      default : System.out.println("You've entered wrong choice");;
    }
    
  }
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter ");
    System.out.println("'+' for Addition");
    System.out.println("'-' for Substraction");
    System.out.println("'*' for Multiplication");
    System.out.println("'/' for Division");
    System.out.println("Enter the sign :  ");
    char c = sc.nextLine().charAt(0);

    System.out.print("Enter two integer values :  ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    sc.close();

    performCalculation(a,b,c);

  }
}