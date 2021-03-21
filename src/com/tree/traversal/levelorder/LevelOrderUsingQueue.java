package com.tree.traversal.levelorder;

import java.util.LinkedList;
import java.util.Queue;

import com.tree.Node;

public class LevelOrderUsingQueue {
	
	public void traverseLevelOrder(Node node) {
		
		if (node == null) {
			return;
		}
		
		Queue<Node> nodeQueue = new LinkedList<>();
		nodeQueue.add(node);
		
		while (!nodeQueue.isEmpty()) {
			Node myNode = nodeQueue.poll();
			System.out.print(myNode.getData() + " ");
			
			if (myNode.getLeft() != null) {
				nodeQueue.add(myNode.getLeft());
			}
			
			if (myNode.getRight() != null) {
				nodeQueue.add(myNode.getRight());
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
		LevelOrderUsingQueue preObj = new LevelOrderUsingQueue();
		preObj.traverseLevelOrder(root);
	}




}
