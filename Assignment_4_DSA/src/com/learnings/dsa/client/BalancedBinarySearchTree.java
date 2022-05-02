package com.learnings.dsa.client;

import java.util.ArrayList;
//import java.util.HashSet;



public class BalancedBinarySearchTree {
//	 Node root;
	boolean pairFound ;
	// Constructor
	
	public Node insertNode(Node root, int key) {
		
				
		if (root == null) {
			root =  new Node(key);
			return root;
		}
		//System.out.println("Root : " + root.data);
		
		//If node already exists do not add duplicates
		 if (key == root.data)
		    {
		    (root.count)++;
		        return root;
		    }
		
		if (key < root.data) {
			//System.out.println("Root : " + root.data);
			root.left = insertNode(root.left, key);
		}
		else
			root.right = insertNode(root.right, key);
		return root;

	}

	public boolean findSumPair(Node node, int key) {
		// (Node root, int sum, HashSet<Integer> set ) {
		ArrayList<Integer> a1 = new ArrayList<>();

		// a2 list contains all the values of BST returned by treeToList method
		ArrayList<Integer> bstList = treeToList(node, a1);
		System.out.println("List : " + bstList.size());

		int start = 0; // Starting index of bstList

		int end = bstList.size() - 1; // Ending index of bstList
		


		while ((start < end)) {

			if ((bstList.get(start) + bstList.get(end) == key)) // Target Found!
			{
				System.out.println("Pair Found: " + bstList.get(start) + " + " + bstList.get(end) + " " + "= " + key);
				pairFound = true;
//				 return true;
				end--;
				start++;
				continue;
			}

			if (bstList.get(start) + bstList.get(end) > key) // decrements end
			{
				end--;
			}

			if (bstList.get(start) + bstList.get(end) < key) // increments start
			{
				start++;
			}
			
		}

		if (pairFound == false) {
			System.out.println("No such values are found in the BST!");
			return false;
		} else
			return true;

	}

	private ArrayList<Integer> treeToList(Node node, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		
		if (node == null)
			return list;

		treeToList(node.left, list);
		list.add(node.data);
		treeToList(node.right, list);

		return list;

	}



}
