package com.learnings.dsa.service;

import java.util.Arrays;
import java.util.Collections;

public class CurrencyDenominations {

	public void getCurrencyDenomination(int amount, Integer[] notes) {
		Arrays.sort(notes, Collections.reverseOrder());
		display(notes);

		int[] noteCounter = new int[notes.length];
		for (int index = 0; index < notes.length; index++) {
			if (amount >= notes[index]) {
				noteCounter[index] = amount / notes[index];
				amount = amount - noteCounter[index] * notes[index];
			}
		}
		if (amount > 0) {
			for (int i = 0; i < notes.length; i++) {
				if (noteCounter[i] != 0) {
					System.out.println("Notes: " + notes[i] + "number: " + noteCounter[i]);
				}

			}
			System.out.println("Cannot tender exact change: Balance is " + amount);
			// return -1;
		} else {
			for (int loop = 0; loop < notes.length; loop++) {
				if (noteCounter[loop] != 0) {
					System.out.println("Notes: " + notes[loop] + "number: " + noteCounter[loop]);

				}

			}
			// return noteCounter[loop];
		}
		// return -1;

	}

	private void display(Integer[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "   ");
			System.out.println();
		}

	}

}
