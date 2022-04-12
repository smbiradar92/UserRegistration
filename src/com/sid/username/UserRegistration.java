package com.sid.username;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		String str1 = "^[A-Z][a-z]{3,}$";
		String str2 = "^[A-Z][a-z]{3,}$";

		Pattern fnamePattern = Pattern.compile(str1);
		System.out.println("Enter the FirstName");

		Scanner sc = new Scanner(System.in);
		String fName = sc.next();
//		
//		if(fnamePattern.matcher(fName).matches()) {
//			System.out.println("Valid");
//		}else {
//			System.out.println("Invalid");
//		}

		Pattern lnamePattern = Pattern.compile(str1);
		System.out.println("Enter the LastName");
		String lName = sc.next();

		if (lnamePattern.matcher(lName).matches()
				&& fnamePattern.matcher(fName).matches()) {
			System.out.println(
					"The entered firstName and LastName is Valid");
		} else {
			System.out.println(
					"The entered firstName and LastName is Invalid");
		}

	}
}
