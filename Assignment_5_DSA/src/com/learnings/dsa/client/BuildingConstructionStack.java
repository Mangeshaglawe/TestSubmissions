package com.learnings.dsa.client;

import java.io.*;
//Importing all utility classes
import java.util.*;

public class BuildingConstructionStack<T> {
	public Integer array[];
	int targetFloors = 0;
	Stack<Integer> s1 = new Stack<Integer>();

	public void getInputValues(int targetFloors) {
		// TODO Auto-generated method stub

		try (Scanner in = new Scanner(System.in)) {

			array = new Integer[targetFloors + 1];

			for (int i = 1; i <= targetFloors; i++) {
				System.out.println("Enter the floor size given on day" + i + ":");
				array[i] = in.nextInt();

			}

			// Arrays.sort(array, Collections.reverseOrder());
			//Stack in the Sequential order 
			System.out.print("targetFloors : " + targetFloors + " ");
			for (int i = 1; i <= targetFloors; i++) {
				s1.push(i);
				
			}
			// display(targetFloors);
			compare(targetFloors, array);
			// computeOrderOfConstruction(targetFloors, array);

		}
	}

	private void compare(int targetedFloors, Integer[] inputArray) {

		// TODO Auto-generated method stub
		String missing = "";
		int missingindex = 0;
		String strSortedReminder = "";
		String[] missingArray = null;
		for (int i = 1; i <= targetedFloors; i++) {

			System.out.println();
			if (!s1.isEmpty()) {
				//If the First value matches with the i value pop it 
				if (s1.peek() == inputArray[i]) {

					int value = s1.pop();
					String strSorted = "";
					strSortedReminder = "";

					if (missing != "") {
						missingArray = missing.split(",");

						Arrays.sort(missingArray, Collections.reverseOrder());
						
						// for (String str : missingArray) {
						for (int ii = 0; ii <= missingArray.length - 1; ii++) {
							if (s1.peek() - Integer.parseInt(missingArray[ii]) == 0) {
								strSorted += missingArray[ii] + " ";
								s1.pop();
							} else

								strSortedReminder += missingArray[ii] + ",";

						}
						System.out.print("Days " + i + ":" + value + " " + strSorted);
					} else {
						System.out.print("Days " + i + ":" + value);
					}
					if (!s1.isEmpty() && strSortedReminder.length() > 0 && missing != ""
							&& strSortedReminder.contains(","))
						missing = strSortedReminder.substring(0, strSortedReminder.length() - 1);// "";
					else
						missing = "";
					

				} else {
					System.out.println("Days " + i + ":" + "");
					if (missing.length() == 0) {
						missing = inputArray[i].toString();
					} else {
						missing = inputArray[i].toString() + "," + missing;
						missingArray = missing.split(",");
						
					}
					missingindex = i;
				}

			}

		}

	}

	private void display(int targetFloors) {
		// TODO Auto-generated method stub
		int topValue = 0;// s1.search(array);
		// System.out.println("peek : " + s1. + " ");

		for (int i = 1; i <= targetFloors; i++) {
			// System.out.println("Stack : " + s1.elementAt(i).toString() + " ");
			System.out.println("Stack : " + s1.peek() + " ");
			System.out.println("pop : " + s1.pop() + " ");
			// System.out.println("peek : " + s1.search(array[i]) + " ");

		}
	}

	private void computeOrderOfConstruction(int targetedFloors, Integer[] availabilityStack) {
		// TODO Auto-generated method stub

		System.out.println("The order of construction is as follows");
		String str = "";
		String missing = "";
		int value = -1;
		boolean istargetedFloorsPopped = false;
		for (int i = 1; i <= targetedFloors; i++) {

			// System.out.println(" day : " + i + " :" + str);
			if (str.length() == 0) {
				str = availabilityStack[i].toString();

				if (value == -1) {
					missing = availabilityStack[i].toString(); // + "," + missing;
					System.out.println("misss : " + missing);
				}
//				else {
//					missing = value + ","  + missing;
//					System.out.println("mis : " + missing); 
//				}
			} else {
				str = availabilityStack[i] + "," + str;
				missing = value + "," + missing;
				// System.out.println("availabilityStack : " + i + " :" + availabilityStack[i]);
				System.out.println("missings : " + missing);

			}
			/*
			 * if (value == -1) { missing = availabilityStack[i].toString(); // + "," +
			 * missing; System.out.println("misss : " + missing); } else { missing = value +
			 * "," + missing; //System.out.println("availabilityStack : " + i + " :" +
			 * availabilityStack[i]); System.out.println("missings : " + missing); }
			 */

			// System.out.println("str " + str + " targetedFloors : " + targetedFloors +
			// "Value : " + value + "availabilityStack " + availabilityStack[i] +" missing
			// :" + missing + " i : " + i );

			if (!s1.isEmpty()) {

				value = s1.pop();
				int nxtValue = value + 1;
				System.out.println("str " + str + " targetedFloors : " + targetedFloors + "Value : " + value
						+ "availabilityStack " + availabilityStack[i] + " missing :" + missing + " i : " + i);
				// && str.contains(Integer.toString(i))
				if ((value == availabilityStack[i] || (availabilityStack[i] == targetedFloors))
						&& str.contains(missing)) {
					System.out.println("Days " + i + ":" + str);
					str = "";
					missing = "";
					istargetedFloorsPopped = true;
					continue;

					// System.out.println("String day : " + i + " :" + str);
				}
				if (str.contains(missing) && missing != "" && istargetedFloorsPopped) {
					System.out.println("missing : " + missing);
					// System.out.println("str : " + str);
					System.out.println("Day " + i + ":" + str);
					missing = "";
					str = "";
					continue;
				} else {
					System.out.println("Day " + i + ": ");
					missing = "";
					// System.out.println("missing : " + missing);
					// System.out.println("String day : " + i + " :" + str);
					// str = availabilityStack[i] + ",";

				}
			}

		}

	}

}
