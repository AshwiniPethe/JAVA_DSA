package dsa.com.linearsearch;

public class MaxWealth {

	public static void main(String[] args) {
		int[][] arr= {
				{1,2,3},
				{3,3,4},
				{9,6,1},
				{10,10,10}
		};
		
		int len = arr.length;
		System.out.println(whoIsWealthy(arr, len));
		}
	
	public static int whoIsWealthy(int[][] arr,int len) {
		int wealth = 0;
		int max = 0;
		int[] wealthy = new int[len];
		for(int i = 0 ; i<len ; i++) {
			int length = arr[i].length;
			for(int j = 0 ; j<length ; j++) {
				wealth = wealth+arr[i][j];
			}
			wealthy[i]=wealth;
		}
		
		for(int i = 1 ; i<len ; i++) {
			if(wealthy[i-1]>wealthy[i])
				max = wealthy[i-1];
			else
				max = wealthy[i];
		}
		
		for(int i = 1 ; i<len ; i++) {
				if(max==wealthy[i])
					return i;
		}
		
		
		return -1;
	}
}
