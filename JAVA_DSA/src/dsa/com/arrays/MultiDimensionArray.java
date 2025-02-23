package dsa.com.arrays;

import java.util.Arrays;

public class MultiDimensionArray {

public static void main(String[] args) {
		int[][]  arr = new int[3][3];
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ; j < 3; j++) {
				arr[i][j]=j;
			}
			
		}
		System.out.println(Arrays.deepToString(arr));
		
	}

}
