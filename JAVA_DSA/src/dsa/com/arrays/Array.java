package dsa.com.arrays;

import java.util.*;
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value for index "+i+" : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
}		
}
