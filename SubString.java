package com.java.classes;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the String Value:");
		String a = s.nextLine();
		int Length = a.length(); //to get length of the string
		System.out.println("Enter the number to generate sub string:");
		int getDigit = s.nextInt(); //to get substring digit
		System.out.println("SubString value is:");
		System.out.print("'");
		for(int i=getDigit;i<Length;i++){
			System.out.print(a.charAt(i));
		}
		System.out.print("'");
	}
}
