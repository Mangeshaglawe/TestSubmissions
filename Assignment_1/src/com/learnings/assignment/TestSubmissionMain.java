package com.learnings.assignment;

import java.util.Scanner;

public class TestSubmissionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner in = new Scanner(System.in)) {

			System.out.println("Please Enter Firstname");
			String firstname = in.next();
			System.out.println("Please Enter Last Name");
			String lastname = in.next();
			
			Employee emp = new Employee(firstname,lastname);
			
			String generatedString = CredentialService.generatePassword();
			CredentialService.displayCredentials(emp);
			System.out.println("Your Password is : " + generatedString);
		}
	}

}
