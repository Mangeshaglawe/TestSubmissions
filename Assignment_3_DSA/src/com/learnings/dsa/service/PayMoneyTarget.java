package com.learnings.dsa.service;

import java.util.Scanner;



public class PayMoneyTarget {
	Scanner sc = new Scanner(System.in);
	public int num_elements;
	public int target_elements;
	public int array[]; //= {100, 50, 20, 10};;
	public int targetarray[]; //= {100, 50, 20, 10};;
	int target []  ;
	
	
			
	private int findTarget(int[] arr,int target) {
		// TODO Auto-generated method stub
		
		
		
		//arrays.reduce
		//getInputValues();
		int accumulator = 0;
		for(int i = 0 ;i < arr.length;i++) {
			accumulator = accumulator + arr[i];
			
			if (accumulator >= target) {
				
				return i + 1;
			}
			//System.out.println("Target not achieved "  );
		}
		return -1 ;
				
	}
	
	public void getInputValues() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the no. of elements of array");
		num_elements = sc.nextInt();
		array = new int[num_elements];
		
		System.out.println("Enter the no. of elements of target");
		target_elements = sc.nextInt();
		targetarray = new int[target_elements];
		
		
		System.out.println("Enter the elements of array..");
		
		for (int i = 0; i <= num_elements - 1; i++) {
			System.out.println("Enter the elements at position  " + i + ":");
			array[i] = sc.nextInt();

		}
		
		
		
		System.out.println("Enter the target amount array..");
		
		for (int i = 0; i <= target_elements - 1; i++) {
			System.out.println("Enter the elements at position  " + i + ":");
			targetarray[i] = sc.nextInt();

		
		}
		displayTarget(array,targetarray);
		
		
	}
	
	private void displayTarget(int[] arr,int[] target) {
		//int target[]  = { 45, 200};
		
		for(int i = 0 ;i < target.length;i++) {
			int iterations =  findTarget(arr,target[i]);
			 
			if (iterations  > 0 )
				System.out.println("Target " + target[i]  + " achieved  after " + (i +1)  + " transactions"  );
			else
				System.out.println("Target " + target[i]  +  " not achieved  after " + (i + 1) + " transactions"  );
				
		}
		
	}

}
