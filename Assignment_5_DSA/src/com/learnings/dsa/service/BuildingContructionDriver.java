package com.learnings.dsa.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

import com.learnings.dsa.client.BuildingConstructionStack;

public class BuildingContructionDriver {
	/*public Integer array[];
	int targetFloors  = 0 ;
	Stack<Integer> s1 = new Stack<Integer>();
	
	private void getInputValues(int targetFloors) {
		// TODO Auto-generated method stub
		
		try (Scanner in = new Scanner(System.in)) { 
			
			System.out.println("Enter the total no. of floors in the building...!");
			targetFloors  =  in.nextInt();
			
			
			array = new Integer[targetFloors];
			
			//getInputValues(targetFloors);
			
			for (int i = 1; i <= targetFloors; i++) {
				System.out.println("Enter the floor size given on day" + i + ":");
				array[i] = in.nextInt();

			}
			
			//Arrays.sort(array, Collections.reverseOrder());

			for (int i = targetFloors; i <= targetFloors; i++) {
				s1.push(i);
				System.out.print("Stack : " + i + " ");
				System.out.println();
				//array[i] = in.nextInt();

			}
			
			
			computeOrderOfConstruction(targetFloors, array);
			
		}
	}
		
			
	private void computeOrderOfConstruction(int targetedFloors, Integer[] availabilityStack) {
		// TODO Auto-generated method stub
		
		 System.out.println("The order of construction is as follows");
		 String str = null;
		for (int i = 1; i <= targetedFloors; i++) {
			
			//str += availabilityStack[i] + ","; 
			 while (!s1.isEmpty()) {
								 
				 if(s1.pop() == availabilityStack[i])
					 System.out.println("Day" + i + ":" + str); 
				 else {
					 System.out.println("Day" + i + ": " );
					 str += availabilityStack[i] + ",";
				 }
			 }
				 
			
		}
		
		
	}

*/




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BuildingConstructionStack<Integer> ordering = new BuildingConstructionStack<Integer>() ;
		//Integer array[];
		try (Scanner in = new Scanner(System.in)) { 
			System.out.println("Enter the total no. of floors in the building...!");
			int targetFloors  =  in.nextInt();
			//array = new Integer[targetFloors];
			
//			ordering.getInputValues();
			ordering.getInputValues(targetFloors);
			
		}
		

	}

}
