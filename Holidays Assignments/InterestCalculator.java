import java.util.Scanner;
import java.lang.Math;

public class InterestCalculator {
  
  public static float calculateSimpleInterest(float p, int t, float r) {
    return (p * t * r) / 100;
  }

  public static float calculateCompoundInterest(float p, int t, float r, int c) {

    float totalAmount, compoundInterest;
    r = r / 100;
    totalAmount = p * (float) Math.pow((1 + (r/c)), c * t);
    compoundInterest = totalAmount - p;

    return compoundInterest;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the principle amount :  ");
    float p = sc.nextFloat();

    System.out.print("Enter the time period (in years) :  ");
    int t = sc.nextInt();

    System.out.print("Enter the rate of interest(%) per year :  ");
    float r = sc.nextFloat();

    System.out.print("Enter the number of compoundings per year :  ");
    int c = sc.nextInt();

    sc.close();

    float simpleInterest = calculateSimpleInterest(p, t, r);
    System.out.println("Simple interest = " + simpleInterest);
    
    float compoundInterest = calculateCompoundInterest(p, t, r, c);
    System.out.println("Compound interest = " + compoundInterest);

  }

}