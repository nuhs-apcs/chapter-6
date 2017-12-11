package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import main.SortingComparison;

public class BubbleSortTest {
	private static String formatArray(int[] arr) {
		if (arr.length == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int x : arr) {
			builder.append(x);
			builder.append(", ");
		}
		builder.setLength(builder.length() - 2);
		builder.append("]");
		return builder.toString();
	}
	
	@Test
	public void testBubbleSort() {
		int[] arr = SortingComparison.getRandomArray(25);
		for (int i = 0; i < arr.length; i++) {
			arr[i] %= 1000;
		}
		int[] arr2 = new int[25];
		System.arraycopy(arr, 0, arr2, 0, 25);
		Arrays.sort(arr2);
		SortingComparison.bubbleSort(arr);
		assertEquals(formatArray(arr2), formatArray(arr));
	}
}
