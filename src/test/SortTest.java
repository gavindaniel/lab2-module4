package test;

import java.util.Arrays;

import org.junit.Test;

import controller.Main;

public class SortTest {
	
	int size = 500000;
	
	int[] array1 = new int[size];
	int[] array2 = new int[size];
	
	@Test
	public void test() {
//		for (int i = 0; i < size; i++) {
//			int random = (int) ((Math.random() * size) + 1);
//			array1[i] = random;
//			array2[i] = random;
//		}
		int temp = 1;
		for (int i = 0; i < size; i++) {
			array1[i] = temp;
			array2[i] = temp;
			temp++;
		}
		array1[size/2] = 0;
		array2[size/2] = 0;
		
//		System.out.println("**************** Test ****************");
//		System.out.println();
//		System.out.println("Array -> " + Arrays.toString(array1));
//		System.out.println("Array -> ");
		System.out.println();
		Main.main(array1, array2);
	}
	
}
