package com.stack;

import java.util.LinkedList;

public class StackUsingLinkedList {
	
	ListNode first = null;
	class ListNode {
		int data;
		ListNode next;
	}

	//LIFO
	public static void main(String[] args) {
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(12);
		stack.display();
		stack.pop();
		stack.display();
		
	}

	private void display() {
		ListNode current = first;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
			
		
	}

	private void pop() {
		ListNode node = first;
		first = first.next;
		
	}

	private void push(int i) {
		
		ListNode node = new ListNode();
		node.data = i;
		node.next = first;
		first = node;
		
	}
}
