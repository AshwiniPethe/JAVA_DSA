package loop.com.forloop;

import java.util.Scanner;

public class OccuranceOfANumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a big number : ");
		int bignum = sc.nextInt();
		System.out.println("which digit's occurance you want to find : ");
		int digit =  sc.nextInt();
		int temp,count=0;
		
		int len = String.valueOf(bignum).length();
		
		for(int i = 0; i < len ;i++) {
			
		temp = bignum%10;
		bignum=bignum/10;
		if (temp==digit)
			count++;
			
		}
		System.out.println("Occurance of : "+digit+" is "+count+" times" );
	}

}
