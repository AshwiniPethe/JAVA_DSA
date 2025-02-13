package loop.com.whileloop;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("run this program until user enters 'X' or 'x' ");
		
		
		
		while (true) {
			
			System.out.println("Enter any OPERATOR :  +    -    *    /    %   ");
			char op = sc.next().trim().charAt(0);
			int result = 0;
			
			if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
				System.out.println("Enter Number 1 : ");
				int number1 = sc.nextInt();
				System.out.println("Enter Number 2 : ");
				int number2 = sc.nextInt();
				
				if (op=='+') {
					result = number1 + number2 ;
				}
				if (op=='-') {
					result = number1 - number2 ;
				}
				if (op=='*') {
					result = number1 * number2 ;
				}
				if (op=='/') {
					if(number2!=0) {
					result = number1 / number2 ;
					}
					else
						System.out.println("Number 2 should not be 0");
				}
				if (op=='%') {
					if(number2!=0) {
						result = number1 %  number2 ;
					}
					else {
						System.out.println("Number 2 should not be 0");
					}
				}
				System.out.println("Result is : "+ result);
			}
			
			
			if (op=='X' || op=='x') {
				break;
			}
		}

	}

}
