package com.tanuj.heap;

public class HeapDemo {
	
	public static void main(String[] args) {
		int [] array = {8,7,42,4,6,28,32,1,2,1,3,9,3,4,7};
		
		Heap heap = new Heap(array);
		int [] heapified = heap.maxHeapify(array, 0);
		for (int i=0; i< heapified.length ; i++) {
			System.out.print(heapified[i] + " ");
		}
		
		System.out.println();
		
		int [] normalarray = {8,7,42,4,6,28,32,1,2,1,3,9,3,4,7};
		int [] heaped = heap.buildHeap(normalarray);
		for (int i=0; i< heaped.length ; i++) {
			System.out.print(heaped[i] + " ");
		}
	}

	
	
	
}
