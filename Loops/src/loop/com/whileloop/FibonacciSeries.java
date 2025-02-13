package loop.com.whileloop;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Fibonacci Series is: ");
		int n1 = 0 ;
		int n2 = 1 ;
		int temp=0;
		
		while (temp<=100) {
		temp=n1+n2;
		n1=n2;
		n2=temp;
		System.out.print(temp+"     ");
		}
		
	}

}
