package controller;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import model.MergeSort;
import model.QuickSort;

public class Main {
	
	public static void main(String[] args) {
		
		// start of program

		int[] array1 = {10,9,8,7,6,5,4,3,2,1,0};
		int[] array2 = {10,9,8,7,6,5,4,3,2,1,0};
		
		MergeSort mergeSort = new MergeSort();
		QuickSort quickSort = new QuickSort();
		
		System.out.println("******** Merge Sort ********");
		System.out.println(); 
		System.out.println("Array before merge sort -> " + Arrays.toString(array2));
		long merge_startTime = System.nanoTime();
		mergeSort.sort(array2);
		long merge_endTime = System.nanoTime();
		System.out.println("Array after merge sort -> " + Arrays.toString(array2));
		System.out.println(); 

		long merge_duration_nano = merge_endTime - merge_startTime;
		double merge_duration_milli = merge_duration_nano / 1000000.0;
		double merge_duration = merge_duration_nano / 1000000000.0;
		
		System.out.println("Time to complete -> " + merge_duration_nano + " nanoseconds (ns)");
		System.out.println("Time to complete -> " + merge_duration_milli + " milliseconds (ms)");
		System.out.println("Time to complete -> " + merge_duration + " seconds (s)");
		System.out.println();
		System.out.println("***************************");
		
		System.out.println("Array before quick sort -> " + Arrays.toString(array1));
		long quick_startTime = System.nanoTime();
		quickSort.sort(array1, 0, array1.length - 1);
		long quick_endTime = System.nanoTime();
		System.out.println("Array after quick sort -> " + Arrays.toString(array1));
		System.out.println(); 
		
		long quick_duration_nano = quick_endTime - quick_startTime;
		double quick_duration_milli = quick_duration_nano / 1000000.0;
		double quick_duration = quick_duration_nano / 1000000000.0;
		
		System.out.println("Time to complete -> " + quick_duration_nano + " nanoseconds (ns)");
		System.out.println("Time to complete -> " + quick_duration_milli + " milliseconds (ms)");
		System.out.println("Time to complete -> " + quick_duration + " seconds (s)");
		System.out.println();
	}
	
	
	
	
	
	
}
