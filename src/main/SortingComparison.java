package main;

import java.util.Random;

public class SortingComparison {
	/**
	 * Generate random array
	 * @param size
	 * @return random array
	 */
	public static int[] getRandomArray(int size) {
		int[] arr = new int[size];
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt();
		}
		return arr;
	}
	
	/**
	 * Basic selection sort implementation
	 * @param arr array to be sorted
	 */
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i], minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			arr[minIndex] = arr[i];
			arr[i] = min;
		}
	}
	
	/**
	 * Basic insertion sort implementation
	 * @param arr array to be sorted
	 */
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i, temp = arr[i];
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	/**
	 * Basic bubble sort implementation
	 * @param arr array to be sorted
	 */
	public static void bubbleSort(int[] arr) {
		// TODO
	}
	
	public static void main(String[] args) {
		int[] arraySizes = {5000, 10000, 25000, 50000};
		for (int size : arraySizes) {
			System.out.println("n=" + size);
			int[] largeArray = getRandomArray(size);
			// the statement below retrieves and stores the current time in milliseconds
			// 1000 milliseconds = 1 second
			// also, a long is basically a large (64-bit to be precise) int
			long startTime = System.currentTimeMillis();
			selectionSort(largeArray);
			System.out.println("\tSelection sort took " + (System.currentTimeMillis() - startTime) + "ms");
			largeArray = getRandomArray(size);
			
			startTime = System.currentTimeMillis();
			insertionSort(largeArray);
			System.out.println("\tInsertion sort took " + (System.currentTimeMillis() - startTime) + "ms");
			largeArray = getRandomArray(size);
			
			startTime = System.currentTimeMillis();
			bubbleSort(largeArray);
			System.out.println("\tBubble sort took " + (System.currentTimeMillis() - startTime) + "ms");
		}
	}

}
