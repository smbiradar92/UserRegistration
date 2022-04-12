package com.sid.username;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Implements {

	Scanner sc = new Scanner(System.in);

	// UC 1&2: First and lastName starting with capital letter with at least 3
	// characters.
	public void validateName() {
		String name = "^[A-Z][a-z]{3,}$";
		Pattern namePattern = Pattern.compile(name);
		String inputName = sc.next();

		if (namePattern.matcher(inputName).matches()) {
			System.out.println("The entered name "
					+ inputName + " is Valid");
		} else {
			System.out
					.println("The entered name is Invalid");
		}

	}

	public void validateEmail() {
		String eMail = "^[a-z0-9]{1,10}([.+-][a-z0-9]+)?@[a-z]+.[a-z]+.[a-z]{2,3}(.[a-z]{2,})?$";
		Pattern emailPattern = Pattern.compile(eMail);
		String inputEmail = sc.next();

		if (emailPattern.matcher(inputEmail).matches()) {
			System.out.println("The entered email "
					+ inputEmail + " is Valid");
		} else {
			System.out.println(
					"The entered email is Invalid");
		}

	}

	public void validateMobileNum() {
		String mobileNum = "^[+]?[0-9]{2}[\\s][0-9]{1,11}$";
//		String mobileNum = "^([+]?[1-9]{2})[\\s][0-9]{1,10}$";
	
		Pattern mobileNumPattern = Pattern
				.compile(mobileNum);
		String inputMob = sc.next();

		if (mobileNumPattern.matcher(inputMob).matches()) {
			System.out.println("The entered Mobile number "
					+ inputMob + " is Valid");
		} else {
			System.out.println(
					"The entered Mobile number is Invalid");
		}

	}

	public void validatePassword() {
		String password = "^[a-zA-Z0-9@!#%^&*]{8,15}$";
		Pattern passPattern = Pattern.compile(password);
		String inputpass = sc.next();

		if (passPattern.matcher(inputpass).matches()) {
			System.out.println("The entered password "
					+ inputpass + " is Valid");
		} else {
			System.out.println(
					"The entered email is Invalid");
		}

	}
	
	
}
