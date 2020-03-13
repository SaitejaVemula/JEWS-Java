package com.test.operators;
import java.util.Scanner;

public class ArithmeticOperators {

	public int add(int x, int y) {
		return x + y;
	}

	public int substract(int x, int y) {
		return x - y;
	}

	public int multiply(int x, int y) {
		return x * y;
	}

	public float divide(int x, int y) {
		return (x * 1.0f) / y;
	}

	public int modulus(int x, int y) {
		return x % y;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArithmeticOperators a = new ArithmeticOperators();

		int x, y, choice;		
		
		System.out.print("Enter the values of x and y :  ");
		x = scan.nextInt();
		y = scan.nextInt();

		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");

		System.out.print("Enter your choice :  ");
		choice = scan.nextInt();
		
		switch (choice) {
			case 1 : System.out.println(a.add(x,y)); break;
			case 2 : System.out.println(a.substract(x,y)); break;
			case 3 : System.out.println(a.multiply(x,y)); break;
			case 4 : System.out.println(a.divide(x,y)); break;
			case 5 : System.out.println(a.modulus(x,y)); break;
			default : System.out.println("You've entered the wrong choice");
		}
		
		
	}

}
