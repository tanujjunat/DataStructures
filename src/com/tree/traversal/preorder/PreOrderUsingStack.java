package com.tree.traversal.preorder;

import java.util.Stack;

import com.tree.Node;

public class PreOrderUsingStack {
	
	public void traversePreOrder(Node node) {
		
		if (node == null) {
			return;
		}
		
		Stack<Node> nodeStack = new Stack<>();
		nodeStack.push(node);
		
		while (nodeStack.empty() == false) {
			Node myNode = nodeStack.pop();
			System.out.print(myNode.getData() + " ");
			
			if (myNode.getRight() != null) {
				nodeStack.push(myNode.getRight());
			} 
			if (myNode.getLeft() != null) {
				nodeStack.push(myNode.getLeft());
			}
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
		PreOrderUsingStack preObj = new PreOrderUsingStack();
		preObj.traversePreOrder(root);
	}
}
