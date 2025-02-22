package dsa.com.loops.whileloop;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Reverse the entered number ");
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		int temp = 0;
		int rev = 0;
		while (num>0) {
			temp = num%10;
			rev = (rev*10 )+temp;
			num=num/10;
			
		}
		
		System.out.println("Reverse is : "+rev);
	}

}
