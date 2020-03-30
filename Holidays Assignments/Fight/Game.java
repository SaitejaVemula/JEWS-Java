import java.util.Random;
import java.util.Scanner;

public class Game {

  byte MAX_HEALTH = 100;
  byte MAX_SHIELD = 50;

  byte user_health = MAX_HEALTH;
  byte comp_health = MAX_HEALTH;

  byte user_shield = 0;
  byte comp_shield = 0;

  // public static byte punch() {

  // } 

  // public static byte defend() {
    
  // }

  public static void end() {
    System.out.println("You've entered \"end\". Quitting.... ");
  }


  public static void main(String[] args) {
    // Ask user for input
    // Check if the input is a valid command
    // if its a valid command, call it's method
    // else ask for the input again

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    System.out.print("Please enter your name :  ");
    String user_name = sc.nextLine();
    System.out.print("Please enter your opponent's name :  ");
    String comp_name = sc.nextLine();
    String input;
    boolean isValidInput = false;

    do {

      System.out.print(name + ", select \"punch\", \"defend\" or \"end\" :  ");
      input = sc.nextLine().toLowerCase();
      
      isValidInput = (input.equals("punch") || input.equals("defend") || input.equals("end")) ? true : false ;

      if(!isValidInput) {
        System.out.println("You've entered wrong option. Please try again.");
      }

    } while (!isValidInput);

    switch(input) {
      case "punch"  : health -= punch(); break;
      case "defend" : shield += defend(); break;
      case "end"    : end(); break;
    }
    
  }
}