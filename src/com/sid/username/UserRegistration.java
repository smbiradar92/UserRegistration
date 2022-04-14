package com.sid.username;

public class UserRegistration {

	public static void main(String[] args) {

		UserReg impl = new UserReg();
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
		System.out.println("**********All valid emails*********");
		System.out.println(impl.clearAllEmail("abc@yahoo.com"));
		System.out.println(impl.clearAllEmail("abc-100@yahoo.com"));
		System.out.println(impl.clearAllEmail("abc.100@yahoo.com"));
		System.out.println(impl.clearAllEmail("abc111@abc.com"));
		System.out.println(impl.clearAllEmail("abc-100@abc.net"));
		System.out.println(impl.clearAllEmail("abc.100@abc.com.au"));
		System.out.println(impl.clearAllEmail("abc@1.com"));
		System.out.println(impl.clearAllEmail("abc+100@yahoo.com"));
	
//		System.out.println(
//				"<------------------------------------------------>");
//		System.out.println("Enter the password");
//		impl.validatePassword();
//	
	}
}
