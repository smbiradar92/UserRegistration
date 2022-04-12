package com.sid.username;

public class UserRegistration {

	public static void main(String[] args) {

		Implements impl = new Implements();
		System.out.println("Enter the FirstName");
		impl.validateName();
		System.out.println(
				"<------------------------------------------------>");
		System.out.println("Enter the LastName");
		impl.validateName();
		System.out.println(
				"<------------------------------------------------>");
		System.out.println("Enter the email id");
		impl.validateEmail();
	System.out.println(
				"<------------------------------------------------>");
		System.out.println("Enter the mobileNumber");
		impl.validateMobileNum();
		System.out.println(
				"<------------------------------------------------>");
		System.out.println("Enter the password");
		impl.validatePassword();
		System.out.println(
				"<------------------------------------------------>");

	}
}
