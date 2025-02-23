package dsa.com.linearsearch;

public class Richest_Customer_Wealth {

	public static void main(String[] args) {

		int[][] arr= {
				{1,2,3},
				{3,3,4},
				{9,0,0},
		};
		
		System.out.println(whoIsWealthy(arr));
		

	}
	public static int whoIsWealthy(int[][] accounts) {
		
		int ans = 0;
		for(int person = 0 ; person<accounts.length ; person++) {
			int sum = 0;
			for(int account = 0 ; account<accounts[person].length ; account++) {
				sum = sum+accounts[person][account];
			}
			if(ans<sum) {
				ans = sum;
			}
		}
		
		
		return ans;
	}

}
