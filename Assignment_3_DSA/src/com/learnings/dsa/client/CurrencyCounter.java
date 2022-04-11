package com.learnings.dsa.client;

import java.util.*;

import com.learnings.dsa.service.CurrencyDenominations;
import com.learnings.dsa.service.MergeSort;

public class CurrencyCounter {

	public int NUM_ELEMENTS;
	public Integer array[]; //= {100, 50, 20, 10};;
	Scanner sc = new Scanner(System.in);
	 int  amount = 560 ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrencyCounter cc = new CurrencyCounter();
		cc.countCurrencyDenomination();
				
	}

	private void countCurrencyDenomination() {
		System.out.println("Enter the no. of currency denominations");

		NUM_ELEMENTS = sc.nextInt();
		array = new Integer[NUM_ELEMENTS];

		getInputValues();
		
		//Currently it's not being used as we need the sorting order in desc, whereas the merge giving in ascending
		/*
		MergeSort obj = new MergeSort();
		System.out.println("original array");
		//obj.display(array);
		//obj.mergesort(array,0,array.length -1);
		
		//System.out.println("Sorted array...!");
		//obj.display(array);
		 
		 */
		
		CurrencyDenominations cd = new CurrencyDenominations();
		//int result = 
				cd.getCurrencyDenomination(amount, array) ;
		
		/*if (result == -1 ) {
			 System.out.println("Cannot tender exact change: Balance is "+ amount);
		}
		else {
			System.out.println("Number of Notes for amount " + amount + "is :" +   result);
			
		}*/

	}

	private void getInputValues() {
		// TODO Auto-generated method stub
		System.out.println("Enter the currency denominations now..");
		for (int i = 0; i <= NUM_ELEMENTS - 1; i++) {
			System.out.println("Enter the elements at position  " + i + ":");
			array[i] = sc.nextInt();

		}
			
		System.out.println("Enter the denomination amount ...");
		amount = sc.nextInt();
	}
}
