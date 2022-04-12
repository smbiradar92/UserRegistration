package com.sid.username;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		String str1 = "^[A-Z][a-z]{3,}$";
		
		Pattern namePattern = Pattern.compile(str1);
		System.out.println("Enter the FirstName");
		
		Scanner sc = new Scanner(System.in);
		String fName = sc.next();
		
		if(namePattern.matcher(fName).matches()) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		
	}
}
