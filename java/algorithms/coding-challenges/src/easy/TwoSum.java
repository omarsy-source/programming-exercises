package easy;
import java.util.Arrays;
public class TwoSum {

	// Das Beispiel starten und die vorbereiteten Eingaben bzw. Ausgaben ausführen.
	public static void main(String[] args) {
		int[] arr = {1,6,9,5,8,7,3};
		int tar = 10;
		int []result = twoSum(arr,tar);
		System.out.println(Arrays.toString(result));
	}
	// Ein Zahlenpaar mit der gesuchten Summe finden.
	public static int[] twoSum(int[] nums, int target) {
	       int sum;
	       for (int i = 0 ; i < nums.length ; i++) {
	        for (int j = 0 ; j < nums.length ; j++) {
	            sum = nums[i] + nums[j];
	            if (i != j && sum == target) {
	            return new int[] {i, j};
	            }
	        }
	       }
	       return new int[] {};
	    }

}
