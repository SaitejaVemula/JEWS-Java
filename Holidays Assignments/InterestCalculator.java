// Importing Scanner and Math libraries
import java.util.Scanner;
import java.lang.Math;

public class InterestCalculator {

  // This method calculates and returns simple interest
  public static float calculateSimpleInterest(float p, int t, float r) {
    return (p * t * r) / 100;
  }

  // This method calculates and returns compound interest
  public static float calculateCompoundInterest(float p, int t, float r, int c) {

    float totalAmount, compoundInterest;
    // making r into decimal value, so that it can be used in the formula
    r = r / 100;
    // Calculates the total amount
    totalAmount = p * (float) Math.pow((1 + (r/c)), c * t);
    // Calculating the compound interest
    compoundInterest = totalAmount - p;

    return compoundInterest;
  }

  public static void main(String[] args) {
    // Creating a scanner object
    Scanner sc = new Scanner(System.in);

    // Asking for, and storing the principle amount
    System.out.print("Enter the principle amount :  ");
    float p = sc.nextFloat();
    
    // Asking for, and storing the time period
    System.out.print("Enter the time period (in years) :  ");
    int t = sc.nextInt();
    
    // Asking for, and storing the rate of interest
    System.out.print("Enter the rate of interest(%) per year :  ");
    float r = sc.nextFloat();
    
    // Asking for, and storing the number of compoundings per year
    System.out.print("Enter the number of compoundings per year :  ");
    int c = sc.nextInt();

    // Closing the Scanner object
    sc.close();

    float simpleInterest = calculateSimpleInterest(p, t, r);
    System.out.println("Simple interest = " + simpleInterest);
    
    float compoundInterest = calculateCompoundInterest(p, t, r, c);
    System.out.println("Compound interest = " + compoundInterest);

  }

}