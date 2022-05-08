package com.learnings.dsa.service;

import com.learnings.dsa.client.*;


public class SkewedBTDriver {
	//public static Node1 node;
	//static Node1 prevNode = null;
	//static Node1 headNode = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	System.out.println("Test");
		SkewedBTClient tree = new SkewedBTClient();
		tree.node = new Node1(5);
		tree.node.left = new Node1(3);
		tree.node.right = new Node1(6);

		tree.node.left.left = new Node1(2);
		tree.node.left.right = new Node1(4);

		// Order of the Skewed tree can
		// be defined as follows -
		// For Increasing order - 0
		// For Decreasing order - 1
		int order = 0;
		tree.flattenBTToSkewed(tree.node, order);
		tree.traverseRightSkewed(tree.headNode);

	}

}
