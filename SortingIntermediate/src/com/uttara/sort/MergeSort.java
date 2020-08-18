package com.uttara.sort;

public class MergeSort {

	public void mergeSort(int[] arr, int low, int high) {
		int mid;
		if(low != high) {
			mid = (low+high)/2;
			mergeSort(arr, low, mid);
			mergeSort(arr, mid+1, high);
			merge(arr , low, mid, high);
		}
	}

	private void merge(int[] arr, int low, int mid, int high) {
		// TODO Auto-generated method stub
		int[] temp = new int[20];
		int i = low;
		int j = mid+1;
		int k = low;
		
		while(i <= mid && (j <= high)) {
			if(arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			}
			else {
				temp[k++] = arr[j++];
			}
		}
		
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		
		while(j <= high) {
			temp[k++] = arr[j++];
		}
		
		for(i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
		
	}
}
