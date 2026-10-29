package Exercise03;

import java.util.Arrays;

public class MergeSort {

	// Das Array aufteilen und die sortierten Teilbereiche zusammenführen.
	public static void mergeSort(int[] arr, int left, int right) {
		if (left >= right) {
			return;
		} else {
			int mid = (left + right) / 2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right); 
		}
	}

	// Zwei sortierte Teilbereiche in der richtigen Reihenfolge zusammenführen.
	public static void merge(int[] arr, int left, int mid, int right) {
		int i, j , k;
		int firstNum = mid - left + 1; //quantity der left seite
		int lastNum = right - mid; // quantity der right seite
		int [] leftArray = new int[firstNum];
		int [] rightArray = new int[lastNum];
		
		for (i = 0 ; i < firstNum; i++ ) {
			leftArray[i] = arr[left + i];
		}
		for (j = 0 ; j < lastNum; j++ ) {
			rightArray[j] = arr[mid + 1 + j];
		}
		i = j = 0;
		k = left;
		while ( i < firstNum && j < lastNum) {
			if (leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while (i < firstNum) {
			arr[k] = leftArray[i];
			i++;
			k++;
	} 
		while (i < lastNum) {
			arr[k] = rightArray[j];
			j++;
			k++;
	} 
		
	}
}