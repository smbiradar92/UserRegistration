package com.sid.username;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Implements {

	// UC 1&2: First and lastName starting with capital letter with at least 3
	// characters.
	public void validateName() {
		String name = "^[A-Z][a-z]{3,}$";
		Pattern namePattern = Pattern.compile(name);
		Scanner sc = new Scanner(System.in);
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
		Scanner sc = new Scanner(System.in);
		String inputName = sc.next();

		if (emailPattern.matcher(inputName).matches()) {
			System.out.println("The entered email " + eMail
					+ " is Valid");
		} else {
			System.out
					.println("The entered name is Invalid");
		}

	}
}
