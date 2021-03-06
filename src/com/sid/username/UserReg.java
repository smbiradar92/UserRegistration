package com.sid.username;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserReg {

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
//		String password = "^?=.*[A-Za-z0-9@!#%^&*]{8,}$";									//	UC 5, minimum 8 characters
//		String password = "^?=.*[A-Z]{1,8}[A-Za-z0-9@!#%^&*]{8,}$";							//	UC 6, AtLeast one UpperCase letter
//		String password = "^?=.*[A-Z]{1,8}?=.*[0-9][A-Za-z0-9@!#%^&*]{8,}$";					//	UC 7, AtLeast one Numeric number
//		String password = "^(?=.*[A-Z]{1,8})(?=.*[0-9]{1,8})(?=.*[@!#%^&*+-_=;']{1})[A-Za-z0-9]{8,}$"; // UC 8, Only one special character

		String password = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}]{1})[(a-zA-Z0-9).(+-_!@#$%^&*(){}'.,){1}]{8,}$"; // UC 8, Only one special character

		Pattern passPattern = Pattern.compile(password);
		String inputpass = sc.next();

		if (passPattern.matcher(inputpass).matches()) {
			System.out.println("The entered password "
					+ inputpass + " is Valid");
		} else {
			System.out.println(
					"The entered Password is Invalid");
		}
	}

	public boolean clearAllEmail(String parameters) {

		String checkEmail = "^[a-z0-9]{1,10}([.+-][a-z0-9]+)?@[a-z]+.[a-z]+.[a-z]{2,3}(.[a-z]{2,})?$";
		Pattern clearPattern = Pattern.compile(checkEmail);

		if (clearPattern.matcher(parameters).matches()) {
			return true;
		} else {
			return false;
		}

	}

}
