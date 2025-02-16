package functions.com;

import java.util.Arrays;

public class VarLength {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		fun(arr);
		
		int a = 1000;
		int arr2[] = {1,2};
		fun(a,arr2);
		
		String name = "Ashwini Pethe";
		int arr3[] = {1,2,3,4,5,6,7,8,9,10};
		fun(a,name,arr3);
		
		int pandavfamilymembers=9;
		String[] names = {"Draupadi","Yudhishthir","Bheem","Arjun","Nakul","Sahadev","Pandu","Kunti","Madri"};
		fun(pandavfamilymembers,names);
	}
	public static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}
	public static void fun(int a , int ...v) {
		System.out.println(a+ " , "+Arrays.toString(v));
	}
	public static void fun(int a , String b ,int ...v) {
		System.out.println(a+" , "+b+" ,"+Arrays.toString(v));
	}
//	public static void fun(int a , String ...b ,int ...v) { // not permisible because variable datatype should be at the end.
//		System.out.println(a+" , "+b+" ,"+Arrays.toString(v));
//	}
	
	public static void fun(int a , String ...b) {
		System.out.println("There where total "+a +" family members in Pandu family and their names are :"+Arrays.toString(b));
	}
	
}
