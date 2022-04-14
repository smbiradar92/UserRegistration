package com.sid.junit;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

	@Test
	public void validateFirstName() {

		UserReg user = new UserReg();
		String actual = user.validatefName("Sid");
		String expected = "Invalid";
		Assert.assertEquals(actual, expected);
	}

	public void validateLastName() {

		UserReg user = new UserReg();
		String actual = user.validatelName("Biradar");
		String expected = "Invalid";
		Assert.assertEquals(actual, expected);
	}

	public void validateEmail() {

		UserReg user = new UserReg();
		String actual = user.validateEmail("sid@bl.co.in");
		String expected = "Invalid";
		Assert.assertEquals(actual, expected);
	}

	public void validatePassword() {
		UserReg user = new UserReg();
		String actual = user
				.validatePassword("Smb@9876543");
		String expected = "Invalid";
		Assert.assertEquals(actual, expected);
	}
}
