package com.learnings.dsa.client;

//Java implementation to flatten the
//binary search tree into a skewed
//tree in increasing / decreasing order


 

public class SkewedBTClient {
	public  Node1 node;
	 Node1 prevNode = null;
	 public Node1 headNode = null;

	// Function to to flatten the binary
	// search tree into a skewed tree in
	// increasing / decreasing order
	public  void flattenBTToSkewed(Node1 root, int order) {

		// Base Case
		if (root == null) {
			return;
		}

		// Condition to check the order
		// in which the skewed tree to
		// maintained
		if (order > 0) {
			flattenBTToSkewed(root.right, order);
		} else {
			flattenBTToSkewed(root.left, order);
		}
		Node1 rightNode = root.right;
		Node1 leftNode = root.left;

		// Condition to check if the root Node
		// of the skewed tree is not defined
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		// Similarly recurse for the left / right
		// subtree on the basis of the order required
		if (order > 0) {
			flattenBTToSkewed(leftNode, order);
		} else {
			flattenBTToSkewed(rightNode, order);
		}
	}

	// Function to traverse the right
	// skewed tree using recursion
	public  void traverseRightSkewed(Node1 root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewed(root.right);
	}

	// Driver Code
	/*public static void main(String[] args) {
		// 5
		// / \
		// 3 6
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
	*/
}
