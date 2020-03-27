/*
  6.   Java Program to Calculate Simple Interest 
  7.   Java Program to Calculate Compound Interest
  9.   Java Program to check Leap Year
11. Swaping of two Numbers
13. Write a programme to find unary Operator and Binary Operators
14. To check the Logical Operators
15. To check the Assignment Operators
16. Terinary Operator
17. Write a programme to print 1 to 10 numbers To print Forward Direction and Backword Direction Using While loop and do while loop
20. Write a programme to find the DD-MM-YY using switch statement

*/
import java.util.Scanner;

public class Operators {

  public static void operatorName(String sign) {  

  }

  public static void noOfOperands(String sign) {
    /* 
      Unary operators :
      Unary +
      Unary -
      !
      ++
      --
    */

    /* 
      Binary operators :
      +
      -
      *
      /
      %
      ==
      &&
      ||

    */
    
    switch(sign) {
      case "+" : 
      case "-" : System.out.println(sign + " is both unary and binary operator"); break;

      case "~" : 
      case "!" : 
      case "++" : 
      case "--" : System.out.println(sign + " is a unary operator"); break;
      
      case "*" : 
      case "/" : 
      case "%" : 
      case "=" : 
      case "+=" : 
      case "-=" : 
      case "*=" : 
      case "/=" : 
      case "%=" : 
      case ">" : 
      case ">=" : 
      case "<" : 
      case "<=" : 
      case "==" : 
      case "!=" : 
      case "||" : 
      case "|" : 
      case "&" : 
      case "^" : 
      case "<<" : 
      case ">>" : 
      case ">>>" : 
      case "&&" : System.out.println(sign + " is a binary operator"); break;

      case "?:" : System.out.println(sign + " is a ternary operator"); break;

      default: System.out.println("You've entered an incorrect operator");
      
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the operator :  ");
    String sign = sc.nextLine();
    sc.close();

    noOfOperands(sign);

  }
}