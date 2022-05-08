package com.learnings.dsa.client;

public class Node1 {
	int val;
	public Node1 left;
	public Node1 right;

	// Helper function that allocates a new node
	// with the given data and NULL left and right
	// pointers.
	public Node1(int item) {
		val = item;
		left = right = null;
	}
}
