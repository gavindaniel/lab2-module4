package model;

public class QuickSort {

	public void sort(int[] array, int low_index, int high_index) {
		
		if (array.length < 2) 
			return;
		
		if (low_index < high_index) {
			
			int partition_index = partition(array, low_index, high_index);
			
			sort(array, low_index, partition_index - 1);
			sort(array, partition_index + 1, high_index);
			
		}
		
	}
	
	public int partition(int[] array, int low_index, int high_index) {
		
		int pivot = array[high_index]; 
		
		int index = low_index - 1;
		int temp;
		
		for (int i = low_index; i < high_index; i++) {
			
			// check if current element is less than or equal to pivot element
			if (array[i] <= pivot) {
				index++;
				temp = array[index];
				array[index] = array[i];
				array[i] = temp;
			}
		}
			
		temp = array[index + 1];
		array[index + 1] = array[high_index];
		array[high_index] = temp;
		
		return (index + 1);	
	}
}
