package dsa.com.arrays;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
		int[] arr = {23,65,32,76,3,88,66,4488,44,22,88};
		System.out.println("Array before reverse : "+Arrays.toString(arr));
		int len = arr.length;
		reverse(arr, len);
		System.out.println("Array after reverse  : "+Arrays.toString(arr));
		
		

	}
		public static void reverse(int[] arr,int len) {
			int start = 0;
			int end = len-1;
			int temp = 0;
			
			while(start<end) {
				temp = arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end--;
			}
		}
}
