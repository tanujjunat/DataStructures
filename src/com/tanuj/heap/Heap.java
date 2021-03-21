package com.tanuj.heap;

public class Heap {
	
	int [] array;
	int left;
	int right;
	int root;
	
	public Heap(int[] array) {
		this.array = array;
	}

	public int [] maxHeapify(int [] array, int largest) {
		
		root = largest;
		left = 2 * root + 1;
		right = (2 * root) + 2;
		if (array.length-1 < left && array.length-1 < right) {
			return array;
		} else {
			if (array[root] > array[left] && array[root] > array[right]) {
				return array;
			}
			if (array[root] < array[left]) {
				swap(array, root, left);
				largest = left;
			} if (array[root] < array[right]) {
				swap(array, root, right);
				largest = right;
			} 
			maxHeapify(array, largest);
		}
		
		return array;
		
	}

	private void swap(int[] array, int root, int child) {
		int temp = array[root];
		array[root] = array[child];
		array[child] = temp;
		
	}
	
	public int [] buildHeap(int [] array) {
		for (int i = ((array.length)/2)-1; i>=0 ; i--) {
			array = maxHeapify(array, i);
		}
		return array;
		
	}

}
