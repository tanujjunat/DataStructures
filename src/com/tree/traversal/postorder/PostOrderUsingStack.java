package com.tree.traversal.postorder;

import java.util.Stack;

import com.tree.Node;

public class PostOrderUsingStack {
	
	public void traversePostOrder(Node node) {
		
		if (node == null) {
			return;
		}
		
		Stack<Node> nodeStack1 = new Stack<>();
		Stack<Node> nodeStack2 = new Stack<>();
		nodeStack1.push(node);
		
		while (nodeStack1.empty() == false) {
			Node myNode = nodeStack1.pop();
			nodeStack2.push(myNode);
			
			if (myNode.getLeft() != null) {
				nodeStack1.push(myNode.getLeft());
			} 
			if (myNode.getRight() != null) {
				nodeStack1.push(myNode.getRight());
			}
		}
		
		while (nodeStack2.empty() == false) {
			System.out.print(nodeStack2.pop().getData() + " ");
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.setLeft(new Node(2));
		root.setRight(new Node(3));
		root.getLeft().setLeft(new Node(4));
		root.getLeft().setRight(new Node(5));
		root.getRight().setLeft(new Node(6));
		root.getRight().setRight(new Node(7));
		PostOrderUsingStack preObj = new PostOrderUsingStack();
		preObj.traversePostOrder(root);
	}
}
