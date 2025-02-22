package dsa.com.loops.ifelse;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Find the largest of entered numbers");
		System.out.println("Enter number1 : ");
		int number1 = sc.nextInt();
		System.out.println("Enter number2 : ");
		int number2 = sc.nextInt();
		System.out.println("Enter number3 : ");
		int number3 = sc.nextInt();
		int largest = 0;
		
	
		
		if (number1>number2) {
			largest = number1;
		}
		else if (number2 > number3) {
			largest = number2;
		}
		else {
			largest = number3;
		}
		
		System.out.println("largest number is : "+ largest);
	}

}
