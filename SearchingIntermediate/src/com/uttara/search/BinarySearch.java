package com.uttara.search;

public class BinarySearch {
	
	public int binarySearch(int[] arr, int value, int low, int high) {
		
		if(low>high)
			return -1;
		
		int mid =low + (high-low)/2;
		
		if(arr[mid] == value) {
			return mid;
		}
		else if(arr[mid] < value) {
			return binarySearch(arr, value, mid+1, high);
		}
		else {
			return binarySearch(arr, value,low , mid-1);
		}
		
	}
	
	public int binarySearchIterative(int[] arr, int value, int low, int high) {
		
		while(low <= high) {
			int mid = low + (high-low)/2;
			if(arr[mid] == value) 
				return mid;
			else if(arr[mid] < value) 
				low = mid + 1;
			else 
				high = mid - 1;
		}
		return -1;	
	}

}
