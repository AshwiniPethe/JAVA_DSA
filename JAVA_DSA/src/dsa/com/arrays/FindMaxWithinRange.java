package dsa.com.arrays;

public class FindMaxWithinRange {

	public static void main(String[] args) {
		// Find max
		// Find max within range
		// work on edge cases
		
		findMax();
		findMaxWithinRange();
	}
	
	public static void findMax() {
		int[] arr = {99,98,100,34,7,13,12,10000};
		int max =0;
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("max : " +max);
	}
	
	public static void findMaxWithinRange() {
		int[] arr = {99,98,100,34,7,10,12,13,14};
		int max =0;
		int start = 2;
		int end = 7;
		for (int i = start; i < end; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.print("Array within range : " +start +" and "+end +" is [ " );
		for (int i = start; i < end+1; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("] and ");
		System.out.println("max is  : " +max);
	}
}
 