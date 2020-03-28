import java.util.Scanner;

public class Operators {

  // This method prints the type/category of the given operator
  public static void operatorName(String sign) {  
    switch(sign) {
      case   "+" :
      case   "-" :
      case   "*" :
      case   "/" :
      case   "%" : System.out.println(sign + " is an Arithmetic operator"); break;

      case  "++" : System.out.println(sign + " is a pre/post increment operator"); break;
      case  "--" : System.out.println(sign + " is a pre/post decrement operator"); break;

      case   "=" : 
      case  "+=" : 
      case  "-=" : 
      case  "*=" : 
      case  "/=" : 
      case  "%=" : System.out.println(sign + " is an Assignment operator"); break;
      
      case  "==" : 
      case  "!=" :
      case   ">" :
      case  ">=" :
      case   "<" :
      case  "<=" : System.out.println(sign + " is a Relational operator"); break;

      case  "&&" : 
      case  "||" : System.out.println(sign + " is a Logical operator"); break;
      
      case   "&" : 
      case   "|" : 
      case   "^" : 
      case   "~" : System.out.println(sign + " is a Bitwise operator"); break;
      
      case  "<<" : 
      case  ">>" : 
      case ">>>" : System.out.println(sign + " is a Shift operator"); break;
      
      case  "?:" : System.out.println(sign + " is a ternary operator"); break;

      default    : System.out.println("Please enter a valid operator"); 
    } 
  }
  
  // This method prints the no of operands it needs
  public static void noOfOperands(String sign) {
    switch(sign) {
      case   "+" : 
      case   "-" : System.out.println(sign + " is both unary and binary operator"); break;

      case   "~" : 
      case   "!" : 
      case  "++" : 
      case  "--" : System.out.println(sign + " is a unary operator"); break;
      
      case   "*" : 
      case   "/" : 
      case   "%" : 
      case   "=" : 
      case  "+=" : 
      case  "-=" : 
      case  "*=" : 
      case  "/=" : 
      case  "%=" : 
      case   ">" : 
      case  ">=" : 
      case   "<" : 
      case  "<=" : 
      case  "==" : 
      case  "!=" : 
      case  "||" : 
      case   "|" : 
      case   "&" : 
      case   "^" : 
      case  "<<" : 
      case  ">>" : 
      case ">>>" : 
      case  "&&" : System.out.println(sign + " is a binary operator"); break;

      case  "?:" : System.out.println(sign + " is a ternary operator"); break;

      default    : System.out.println("You've entered an incorrect operator");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the operator :  ");
    String sign = sc.nextLine();
    sc.close();

    noOfOperands(sign);
    operatorName(sign);
  }
}