package dsa.com.arrays;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int[] arr = {4,12,56,15,78,34,20,45};
		System.out.println("Array before Swap : "+Arrays.toString(arr));
		int swapIndex1=2;
		int swapIndex2=6;
		swap(arr, swapIndex1, swapIndex2);
		System.out.println("Array after Swap :  "+Arrays.toString(arr));
	}
	public static void swap(int[] arr,int ind1 , int ind2) {
		int temp;
		
		temp=arr[ind1];
		arr[ind1]=arr[ind2];
		arr[ind2]=temp;
	}
	
}
