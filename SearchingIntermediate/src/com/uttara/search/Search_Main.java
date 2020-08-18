package com.uttara.search;

public class Search_Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearSearch search = new LinearSearch();
		int[] array = new int[]{12,34,945,367,679,987,495,100,108,203};
		System.out.println("Before Linear Search");
		for (int i = 0; i < 10; i++) {
			System.out.print(" " +array[i]);
		}
			System.out.println();
			System.out.println("**********************************************");
		
		System.out.println(" Linear Search for 203: " +search.linearSearch(array, 203));
					
			BinarySearch binsearch = new BinarySearch();
			System.out.println("Before Binary Search");
			int[ ] arr = new int[] {12,34,45,67,79,87,95,100,108,203};
			for (int i = 0; i < arr.length; i++) {
				System.out.print(" " +arr[i]);
			}
				System.out.println();
				System.out.println("**********************************************");
			System.out.println("Searching for 87 : ");	
			System.out.println(" : " +binsearch.binarySearch(arr, 87, 0, 9));
			System.out.println(" : " +binsearch.binarySearchIterative(arr, 87, 0, 9));
			
	}

}
