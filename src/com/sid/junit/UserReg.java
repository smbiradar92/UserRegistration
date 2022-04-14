package com.sid.junit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserReg {

	public String validatefName(String fname) {
		fname = "^[A-Z][a-z]{3,}$";
		Pattern namePattern = Pattern.compile(fname);
		Matcher matcher = namePattern.matcher(fname);
		if (matcher.matches())
			return "valid";
		return "Invalid";

	}

	public String validatelName(String lname) {
		lname = "^[A-Z][a-z]{3,}$";
		Pattern namePattern = Pattern.compile(lname);
		Matcher matcher = namePattern.matcher(lname);
		if (matcher.matches())
			return "valid";
		return "invalid";

	}

	public String validateEmail(String email) {
		email = "^[a-z0-9]{1,10}([.+-][a-z0-9]+)?@[a-z]+.[a-z]+.[a-z]{2,3}(.[a-z]{2,})?$";
		Pattern emailPattern = Pattern.compile(email);
		Matcher matcher = emailPattern.matcher(email);
		if (matcher.matches())
			return "Valid";
		return "invalid";
	}

	public String validateMobileNum(String mobileNum) {
		mobileNum = "^([+]?[1-9]{2})[\\s][0-9]{1,10}$";

		Pattern mobileNumPattern = Pattern
				.compile(mobileNum);
		Matcher matcher = mobileNumPattern
				.matcher(mobileNum);
		if (matcher.matches())
			return "valid";
		return "Invalid";
	}

	public String validatePassword(String password) {
		password = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}]{1})[(a-zA-Z0-9).(+-_!@#$%^&*(){}'.,){1}]{8,}$";

		Pattern passPattern = Pattern.compile(password);
		Matcher matcher = passPattern.matcher(password);
		if (matcher.matches())
			return "Valid";

		return "Invalid";
	}

}
