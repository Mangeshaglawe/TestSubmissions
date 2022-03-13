package com.learnings.assignment;

import java.util.Scanner;
import java.util.Random;

public class CredentialService {

	public final static String generatePassword() {
		//depts = new String[] { "Tech", "Admin", "HR", "Legal" };
		String generatedString = null;

		//try (Scanner in = new Scanner(System.in)) {
			
			//if (id < 4 && id >= 0) {
				// System.out.println("You've selected Tech Dept. Id :" + dept[id]);
				
				int leftsideLimit = 48; // letter 'a'
				int rightsideLimit = 122; // letter 'z'
				int targetStringLength = 10;

				Random random = new Random();

				StringBuilder buffer = new StringBuilder(targetStringLength);

				for (int i = 0; i < targetStringLength; i++) {
					int randomLimitedInt = leftsideLimit
							+ (int) (random.nextFloat() * (rightsideLimit - leftsideLimit + 1));
					buffer.append((char) randomLimitedInt);
				}
				generatedString = buffer.toString();
					
			//}

		//}
		return generatedString;

	}

	public static void displayCredentials(Employee emp) {
		final String[] depts;
		depts = new String[] { "Tech", "Admin", "HR", "Legal" };
		String company = "xyz";
		
		try (Scanner in = new Scanner(System.in)) {
			
			/*System.out.println("Please Enter Firstname");
			String firstname = in.next();
			emp.Setfirstname(firstname);
			System.out.println("Please Enter Last Name");
			
			String lastname = in.next();
			emp.setLastname(lastname);
			*/
			System.out.println("Please Enter Dept ID TECH  ID : 0");
			System.out.println("Please Enter Dept ID Admin ID : 1");
			System.out.println("Please Enter Dept ID HR    ID : 2");
			System.out.println("Please Enter Dept ID Legal ID : 3");

			int id = in.nextInt();

			switch (id) {
			case 0:
				System.out.println("You've selected Tech Dept.");
				break;
			case 1:
				System.out.println("You've selected Admin Dept.");
				break;
			case 2:
				System.out.println("You've selected HR Dept.");
				break;
			case 3:
				System.out.println("You've selected Legal Dept.");
				break;
			default:
				System.out.println("You've selected Invalid Dept");
			}
			if (id < 4 && id >= 0) {
				emp.setDept(depts[id]);
			}
			
			System.out.println("Dear " + emp.getfirstname() + " your Email-Id is :" +
			emp.getfirstname() + emp.getLastname() + "@" + emp.getDept() + "." + company +".com");
			
		}
	}
}
