package com.greatlearning.itsupport.service;

import java.util.Random;

import com.greatlearning.itsupport.model.Employee;

public class Service {
	private String emailId = "";

	private char[] generatePassword() {
		Random random = new Random();
		char[] password = new char[8];

		String capitalLetters = "ABCDEFGHIJKLMONOPQRSTUVWXYZ";
		String smallLetters = capitalLetters.toLowerCase();
		String numbers = "0123456789";
		String splCharacters = " !@#$%^&*()_-+={[}]|\\:;\"'<,>.?/";
		String[] optionList = { capitalLetters, smallLetters, numbers, splCharacters };

		for (int i = 0; i < 8; i++) {
			int index = random.nextInt(optionList.length);
			password[i] += optionList[index].charAt(random.nextInt(optionList[index].length()));
		}

		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		firstName = firstName.toLowerCase();
		lastName = lastName.toLowerCase();
		emailId = firstName.concat(lastName) + "@" + department + ".greatlearning.com";

		return emailId;
	}

	public void showCredentials(Employee employee) {
		String password = String.valueOf(generatePassword());

		System.out.println("Dear " + employee.getFirstName() + ", your generated credentials are as follows:");
		System.out.println("Email    --> " + emailId);
		System.out.println("Password --> " + password);

	}
}
