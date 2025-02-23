package dsa.com.linearsearch;

public class SearchInRange {
	public static void main(String[] args) {
		int[] arr = {3,5,2,4,6,7,8,9,23,45,56,78,123,5454,121121,54554,6687};
		int target = 56;
		int startRange = 3;
		int endRange = 15;
		System.out.println(findIndex(arr, target, startRange, endRange));
		
	}
	public static int findIndex(int[] arr , int target , int startRange , int endRange) {
		for(int i = startRange ; i<=endRange ;i++) {
			if(arr[i]==target)
				return i;
		}
		
		return -1;
		
	}
}
