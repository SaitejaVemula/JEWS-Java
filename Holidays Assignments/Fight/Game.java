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
    String name = sc.nextLine();
    String input;
    boolean isValidInput = false;

    do {

      System.out.print(name + ", select \"punch\", \"defend\" or \"end\" :  ");
      input = sc.nextLine().toLowerCase();

      System.out.println("Input = " + input + " , isValidInput = " + isValidInput);
      
      isValidInput = (input == "punch" || input == "defend" || input == "end") ? true : false ;
      System.out.println("Input = " + input + " , isValidInput = " + isValidInput);

      if(!isValidInput) {
        System.out.println("You've entered wrong option. Please try again.");
      }

    } while (!isValidInput);

    System.out.println("You've selected :  " + input);

    
  }
}