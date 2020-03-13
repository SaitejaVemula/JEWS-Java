package com.test.operators;
import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hey, you.... What's your name?   ");
		String nickName = scan.nextLine();
		
		System.out.println("What's your actual name? Not one of those silly names...   ");
		String actualName = scan.nextLine();
		
		if( nickName.toLowerCase().equalsIgnoreCase(actualName) ) {
			System.out.println("Okay, now tell me your age...   ");;
		} else {
			System.out.println("I caught you lying about your name....");
			System.out.println("But its okay. Now, tell me your age...   ");
		}
		
		byte userAge = scan.nextByte();
		
		boolean isAnAdult = userAge >= 18;
		
		if( isAnAdult ) {
			System.out.println("So.....");
			System.out.println("You've made it till here.");
		} else {
			System.out.println("Get outta here, kiddo. You're too young to talk to me.");
			System.out.println("Byeeeee");
			System.exit(0);
		}
	}

}
