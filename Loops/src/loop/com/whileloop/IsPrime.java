package loop.com.whileloop;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		int number = sc.nextInt();
		
		if(isPrime(number))
			System.out.println(number +" is prime.");
		else 
			System.out.println(number +" is not prime.");

	}
	
	public static boolean isPrime(int num) {
		int count=0;
		if(num%2==0) {
			return false;
		}
		
		for (int i=3; i<=num;i+=2) {
			if(num%i==0) {
				count++;
			}
		}
		if (count==1)
			return true;
		else 
			return false;
	
	}

}
