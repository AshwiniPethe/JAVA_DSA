package dsa.com.binarysearch;

import java.util.Arrays;

public class Order_Agnostic_BinarySearch {

	public static void main(String[] args) {

//		1. find if array is asc or dec
//		2. then find the target's index.
		
		// Ascending array
		//int[] arr= {-100,-3,-1,0,2,4,6,9,12,34,56,67,89,90,95,100,200,500};
		
		// Descending array
		int[] arr= {500,450,340,230,120,100,60,30,2,0,-1,-11,-30,50,-1000};
		int len = arr.length;
		int target = 0;
		boolean isAscending = arr[0]<arr[len-1];
		int target_index=BinarySearch(isAscending, arr, len, target);
		System.out.println(Arrays.toString(arr));
		System.out.println("index of element "+target+" is : "+target_index);
		

	}
		public static int BinarySearch(boolean isAsc ,int[] arr , int len,int target) {
			int start = 0;
			int end = len-1;
			int mid;
			
			for(int i = start;i<len;i++) {
				mid = start +((end-start)/2);
				if(arr[mid]==target)
					return mid;
				if(isAsc) {
					if(arr[mid]<target) 
						start=mid+1;
					else
						end=mid-1;	
				}
				else {
					if(arr[mid]>target) 
						start=mid+1;
					else
						end=mid-1;
				}
			}
			return -1;
		}
}
