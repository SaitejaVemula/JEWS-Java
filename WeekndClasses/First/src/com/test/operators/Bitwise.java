package com.test.operators;

public class Bitwise {

	public static void main(String[] args) {
		
		byte n1 = -64, n2 = 64;
		byte nn1 = (byte) (n1 >>> 1); 
		byte nn2 = (byte) (n2 >> 1);
		
		System.out.println(n1 + " " + n2 + " " + nn1 + " " + nn2);
		
	}

}
