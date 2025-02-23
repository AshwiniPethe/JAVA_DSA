package dsa.com.linearsearch;

import java.util.Arrays;

public class SearchNum {

	public static void main(String[] args) {
		int[] arr = {34,65,23,87,45,23,76,450,23,56};
		int len=arr.length;
		int target = 340;
		int targetIndex = find(arr,target,len);
		System.out.println("In "+Arrays.toString(arr)+" array , target "+target +" is at index : " + targetIndex +" !!😊😊😊😊");
		

	}
	public static int find(int[] arr , int target,int len) {
		if(arr==null)
			return -1;
		for(int i = 0 ; i<len ; i++) {
			if(arr[i]==target)
				return i;
		}
		
		return -1;
	}
}
