package com.uttara.sort;

public class InsertionSort {
	
	public void insertionSort(int[] arr, int n) {
		int j, v;
		//Fix the position for element to be sorted
		for(int i = 1; i <= n-1 ; i++) {
			v = arr[i];
			j = i-1;
			//Find the suitable pos for element(at i) to be inserted
			while(j >= 0 && arr[j] > v ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = v;
		}
	}

}
