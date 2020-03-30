import java.util.Random;
import java.util.Scanner;

public class Game {

  int MAX_HEALTH = 100;
  int MAX_SHIELD = 50;

  int user_health = MAX_HEALTH;
  int comp_health = MAX_HEALTH;

  int user_shield = 0;
  int comp_shield = 0;


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
    
  }
}