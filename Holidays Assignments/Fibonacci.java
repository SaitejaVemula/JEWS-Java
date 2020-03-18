//Importing the Scanner class
import java.util.Scanner;

// Created a class named Fibonacci
public class Fibonacci
{
  public static void main(String[] args)
  {
    int n1 = 0, n2 = 1, sum = 0, num, count = 0;

    //Creating an object named "sc" to user Scanner
    Scanner sc = new Scanner(System.in);

    //Output statement
    System.out.println("*** FIBONACCI NUMBERS ***");
    System.out.print("Enter the number of fibbonacci numbers you want me to print :  ");
    
    // Reading the input from the user and storing it in "num"
    num = sc.nextInt();
    sc.close();
    
    System.out.println();

    // Printing the first number in the series
    if (num > 0) {
      System.out.print(n1 + "\t\t");
      count++;
    }
    
    // Printing the second number in the series
    if (num > 1) {
      System.out.print(n2 + "\t\t");
      count++;
    }
    
    // Printing the numbers in the series till the entered number
    if (num > 2) {
      while(num > count) {
        sum = n1 + n2;
        n1 = n2;
        n2 = sum;
        System.out.print(sum + "\t\t");
        count++;
        if(count % 5 == 0) {
          System.out.println();
        }
      }
    }

    System.out.println();
  }
}