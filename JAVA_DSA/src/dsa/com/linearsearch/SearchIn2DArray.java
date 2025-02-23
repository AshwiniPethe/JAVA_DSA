package dsa.com.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][]arr = {
				{45,67,23,89,90},
				{3,5,21,55,23,56,0},
				{333,66,1,888,1223},
				{10000,2012}
		};
		int target = 0;
		int len = arr.length;
		System.out.println(Arrays.deepToString(arr));
		findIndex(arr, target, len);
		
	}
	public static void findIndex(int[][] arr , int target , int len) {
		
		for(int i = 0 ; i< len ;i++) {
			int length = arr[i].length;
			for(int j = 0 ; j < length ; j++) {
				if(arr[i][j]==target) {
					System.out.println(target + " is at index arr ["+i+"] ["+j+"]");
				}
			}
			
		}
	}
}
