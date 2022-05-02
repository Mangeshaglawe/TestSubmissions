package com.learnings.dsa.client;

//import java.util.ArrayDeque;
//import java.util.Deque;

import java.util.Stack;

public class BalancingBrackets {
	

	 	 
	 public static boolean areBalancingBracket(String exp) {
		 Stack<Character> stk = new Stack<Character>();
		 //Deque<Character> stk     = new ArrayDeque<Character>();
		 
		 if(exp.length() % 2 == 1 ) {
			 System.out.println("The given expression is not balanced as number of start \n brackets don't match up with the end brackets");
		 
			 return false;
		 }else {
			 
			 for (int i = 0 ; i < exp.length(); i ++) {
				 char bracket = exp.charAt(i);
				 
				 if (bracket == '(' ||  bracket== '[' || bracket == '{')
		            {
		                stk.push(bracket);
		                continue;
		            }
				 if (stk.isEmpty())
		                return false;
		            char lookup;
		            switch (bracket) {
		            case ')':
		            	lookup = stk.pop();
		                if (lookup == '{' || lookup == '[')
		                    return false;
		                break;
		 
		            case '}':
		            	lookup = stk.pop();
		                if (lookup == '(' || lookup == '[')
		                    return false;
		                break;
		 
		            case ']':
		            	lookup = stk.pop();
		                if (lookup == '(' || lookup == '{')
		                    return false;
		                break;
		            }
				 
			 }
		 }
		 
		  return (stk.isEmpty());
	 }

}
