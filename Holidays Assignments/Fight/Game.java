import java.util.Random;
import java.util.Scanner;

public class Game {

  static byte MAX_HEALTH = 100;
  static byte MAX_SHIELD = 50;

  static byte user_health = MAX_HEALTH;
  static byte comp_health = MAX_HEALTH;

  static byte user_shield = 0;
  static byte comp_shield = 0;

  // public static byte punch() {

  // } 

  // public static byte defend() {
    
  // }

  public static void end() {
    System.out.println("You've entered \"end\". Quitting.... ");
    System.exit(0);
  }


  public static void main(String[] args) {
    // Ask user for input
    // Check if the input is a valid command
    // if its a valid command, call it's method
    // else ask for the input again

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    // System.out.print("Please enter your name :  ");
    // String user_name = sc.nextLine();
    String user_name = "Sai";
    // System.out.print("Please enter your opponent's name :  ");
    // String comp_name = sc.nextLine();
    String input;
    boolean isValidInput = false;

    do {

      do {

        System.out.print(user_name + ", select \"punch\", \"defend\" or \"end\" :  ");
        input = sc.nextLine().toLowerCase();
        
        isValidInput = (input.equals("punch") || input.equals("defend") || input.equals("end")) ? true : false ;

        if(!isValidInput) {
          System.out.println("You've entered wrong option. Please try again.");
        }

      } while (!isValidInput);

      switch(input) {
        case "punch"  : byte amt = (byte) rd.nextInt(50);
                        byte rem_health = 0;
                        if(comp_shield > 0) {
                          rem_health = (byte) (comp_shield - amt);
                          comp_shield -= amt;
                          if(comp_shield < 0) {
                            comp_shield = 0;
                          }
                        }
                        if(rem_health<0) {
                          comp_health -= rem_health;
                        } else {
                          comp_health -= amt;
                        }
                        if(comp_health<0) {
                          comp_health = 0;
                        }
                        break;
        case "defend" : comp_shield += (byte) rd.nextInt(30);
                        if(comp_shield > 50) {
                          comp_shield = MAX_SHIELD;
                        }
                        break;
        case "end"    : end(); break;
      }

      System.out.println("Computer's health now :  " + comp_health);
      System.out.println("Computer's shield now :  " + comp_shield);
    
    } while(comp_health > 0);
    
  }
}