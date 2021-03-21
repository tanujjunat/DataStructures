package com.graph.traversal.bfs;

public class MainClass {

	public static void main(String[] args) {
		int [] arr = {-1,5,-3};    //1,2,3  1,2,3,12,23,123  here max sum  = 6
		//int [] arr1= {1,-2,3};    // here max sum of subarray: 3 // siize could 10^9
		//{-1, 2, 1, -4, 4, 5}	
		//8, 6, 5, 9, 5
			
		System.out.println(getMaxSum(arr));		
		
	}

	private static Integer getMaxSum(int[] arr) {
		int maxSum = 0;	
		//int ansArr[] = new int[arr.length];
		//initialize(ansArr);
		for (int i = 0; i<arr.length;i++) {
			int sum = 0;
			for (int j = i; j< arr.length;j++) {
				sum  = sum + arr[j];
			}
			if (maxSum < sum) {
				maxSum = sum;
			} 
			if (maxSum < arr[i]) {
				maxSum = arr[i];
			}
			
		}		
		return maxSum;
	}

	
}
