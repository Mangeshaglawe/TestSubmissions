package com.learnings.dsa.client;

 public class Node {
	//A binary tree node
	
		public int data = 0;
		public int count = 0; 
		public Node left;
		public Node right;

		Node(int nodeData) {
			this.data = nodeData;
			left = right = null;
			this.count = 1;
		}



		
	}


