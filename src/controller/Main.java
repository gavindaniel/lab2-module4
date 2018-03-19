package controller;

import model.MergeSort;
import model.QuickSort;

public class Main {
	
	public static void main(int[] array1, int[] array2) {
		
		MergeSort mergeSort = new MergeSort();
		QuickSort quickSort = new QuickSort();
		
		System.out.println("******************** Merge Sort ********************"); 
		
		long merge_startTime = System.nanoTime();
		mergeSort.sort(array2);
		long merge_endTime = System.nanoTime(); 

		long merge_duration_nano = merge_endTime - merge_startTime;
		double merge_duration_milli = merge_duration_nano / 1000000.0;
		double merge_duration = merge_duration_nano / 1000000000.0;
		
		System.out.println("Time to complete -> " + merge_duration_nano + " nanoseconds (ns)");
		System.out.println("Time to complete -> " + merge_duration_milli + " milliseconds (ms)");
		System.out.println("Time to complete -> " + merge_duration + " seconds (s)");
		System.out.println();
		
		System.out.println("******************** Quick Sort ********************");
		
		long quick_startTime = System.nanoTime();
		quickSort.sort(array1, 0, array1.length - 1);
		long quick_endTime = System.nanoTime();
 		
		long quick_duration_nano = quick_endTime - quick_startTime;
		double quick_duration_milli = quick_duration_nano / 1000000.0;
		double quick_duration = quick_duration_nano / 1000000000.0;
		
		System.out.println("Time to complete -> " + quick_duration_nano + " nanoseconds (ns)");
		System.out.println("Time to complete -> " + quick_duration_milli + " milliseconds (ms)");
		System.out.println("Time to complete -> " + quick_duration + " seconds (s)");
	}
	
}
