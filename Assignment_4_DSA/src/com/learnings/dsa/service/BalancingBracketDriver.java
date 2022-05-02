package com.learnings.dsa.service;

import java.util.Scanner;

import com.learnings.dsa.client.BalancingBrackets;

public class BalancingBracketDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner in = new Scanner(System.in)) { 
			System.out.println("Enter the String with brackets combination ....!");
			String exp  =  in.next();
//		String expr = "([{}])";
		 
	        // Function call
	        if (BalancingBrackets.areBalancingBracket(exp))
	            System.out.println("Balanced ");
	        else
	            System.out.println("Not Balanced ");
		}

	}

}
