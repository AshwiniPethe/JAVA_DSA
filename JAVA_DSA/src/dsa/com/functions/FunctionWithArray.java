package dsa.com.functions;

import java.util.Arrays;

public class FunctionWithArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		funcWithRef(arr);
		System.out.println(arr[0]);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	public static void funcWithRef(int array[]) {
	array[0]=10;	
	}
}
