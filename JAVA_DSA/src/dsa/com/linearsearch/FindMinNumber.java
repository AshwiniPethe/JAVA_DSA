package dsa.com.linearsearch;

import java.util.Arrays;

public class FindMinNumber {

	public static void main(String[] args) {
		int[] arr = {65,45,23,89,12,800,0,-33,10000};
		int len = arr.length;
		System.out.println("In Array "+Arrays.toString(arr)+" Minimum value is "+findmin(arr, len));

	}

	public static int findmin(int[] arr , int len) {
		int min = 0;
		for(int i = 1 ; i < len ;i++) {
			if(arr[i-1]<arr[i])
				min=arr[i-1];
			else
				min=arr[i];
		}
		
		return min;
	}
}
