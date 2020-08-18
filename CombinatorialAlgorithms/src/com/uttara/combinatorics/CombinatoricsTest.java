package com.uttara.combinatorics;

public class CombinatoricsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binary Generation for 3 : " );
		Combinatorics.binarySequenceGen(3);
		
		System.out.println("K symbol sequence of n length : ");
		Combinatorics.kSequenceGen(3,3);
		
		System.out.println("Permutations of String ");
		Combinatorics.permutations("abcde");
		
		System.out.println("Combinations of the String : ");
		Combinatorics.combinations("abcde");
		
		System.out.println("Combinations with Restriction : ");
		Combinatorics.combinationsOfFixed("abcde", 4);
		
		System.out.println("Permutations with Restriction : ");
		Combinatorics.permutationsFixed("abcde", 3);
		
	}

}
