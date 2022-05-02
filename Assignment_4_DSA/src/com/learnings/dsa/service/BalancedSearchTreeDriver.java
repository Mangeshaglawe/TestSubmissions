package com.learnings.dsa.service;

import com.learnings.dsa.client.BalancedBinarySearchTree;
import com.learnings.dsa.client.Node;


public class BalancedSearchTreeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Node root = new Node()  ;
		
		BalancedBinarySearchTree bst = new BalancedBinarySearchTree();
		
		Node root = null ;
		
		root = bst.insertNode(root, 15);
		
		bst.insertNode(root, 10);
		bst.insertNode(root, 40);
		bst.insertNode(root, 5);
		bst.insertNode(root, 0);
		bst.insertNode(root, 50);
		bst.insertNode(root, 45);
				
		int key = 50;
		bst.findSumPair(root, key);
				
	}

}
