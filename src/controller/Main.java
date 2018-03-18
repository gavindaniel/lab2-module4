package controller;

import model.Tree;

import java.util.Arrays;

import model.MergeSort;

public class Main {

	//private Tree mergeTree;
	
	public static void main(String[] args) {
		
		// start of program

		int[] array1 = {0,1,2,3,4,5,6,7,8,9,10};
		int[] array2 = {10,9,8,7,6,5,4,3,2,1,0};
		
		MergeSort mergeSort = new MergeSort();
		
//		mergeSort.sort(array1);
		
		System.out.println("Array before sorting -> " + Arrays.toString(array2));
		mergeSort.sort(array2);
		System.out.println("Array after sorting -> " + Arrays.toString(array2));
		System.out.println("***************************");
		
		
		
	}
	
	
	
	
	
	
}
