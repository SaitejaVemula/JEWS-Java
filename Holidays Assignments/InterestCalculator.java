import java.util.Scanner;

public class InterestCalculator {

  /*
  Simple Interest=PTR/100
  Compound Interest=P((1+R)/100)^n
  P: Principle
  */ 

  public static float calculateSimpleInterest(float p, int t, float r) {
    return (p * t * r) / 100;
  }

  // public static float calculateCompoundInterest() {

  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the principle amount :  ");
    float p = sc.nextFloat();

    System.out.print("Enter the time period (in years) :  ");
    int t = sc.nextInt();

    System.out.print("Enter the rate of interest(%) per year :  ");
    float r = sc.nextFloat();

    System.out.print("Enter the number of compoundings ")

    // float simpleInterest = calculateSimpleInterest(p, t, r);

    // System.out.println("Simple interest = " + simpleInterest);



  }

}