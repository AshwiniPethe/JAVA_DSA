package leetcode;

public class Q1295_Find_Numbers_with_Even_Number_of_Digits {

	public static void main(String[] args) {

		//int[] arr = {2,33,444,5555,66666,777777,34,45454,56565656,0};
		int[] arr = {9000,1,2,3,4,5,6,7,8,9,0};
		
		System.out.println(numOfEvens(arr));
	

	}
	public static int numOfEvens(int[] nums) {
		int count =0 ;
		for(int i = 0; i< nums.length ; i++) {
			int lengthOfParticularValue = String.valueOf(nums[i]).length();
			if(lengthOfParticularValue % 2 == 0 ) {
				count++;
			}
		}
		return count;
	}
}
