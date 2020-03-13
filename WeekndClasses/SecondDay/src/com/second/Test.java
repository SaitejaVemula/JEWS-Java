package com.second;

public class Test {

	public final static void main(String[] args) {
		final FinalExample myself = new FinalExample(22, "Saiteja");		
		System.out.println("Username is :  " + myself.userName);
		System.out.println("User's age is :  " + myself.userAge);
		System.out.println();
		
		final FinalExample myFriend = new FinalExample(28, "Abhilash");		
		System.out.println("Username is :  " + myFriend.userName);
		System.out.println("User's age is :  " + myFriend.userAge);
		System.out.println();
		
		final FinalExample myOtherFriend = new FinalExample(24, "Naresh");
		System.out.println("Username is :  " + myOtherFriend.userName);
		System.out.println("User's age is :  " + myOtherFriend.userAge);
		System.out.println();
	}

}
