package practice.sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 67, 3, 56, 73, 5, 2 };

		toMergeSort(arr, 0, arr.length - 1);

		Arrays.stream(arr).forEach(System.out::println);

	}

	public static void toMergeSort(int[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		toMergeSort(arr, low, mid);
		toMergeSort(arr, mid + 1, high);
		toMerge(arr, low, mid, high);
	}

	private static void toMerge(int[] arr, int low, int mid, int high) {
		int left = low;
		int right = mid + 1;
		ArrayList<Integer> newarr = new ArrayList<Integer>();
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				newarr.add(arr[left]);
				left++;
			} else {
				newarr.add(arr[right]);
				right++;
			}
		}
		while (left <= mid) {
			newarr.add(arr[left]);
			left++;
		}
		while (right <= high) {
			newarr.add(arr[right]);
			right++;
		}
		for (int i = low; i <= high; i++) {
			arr[i] = newarr.get(i - low);
		}
	}
}
