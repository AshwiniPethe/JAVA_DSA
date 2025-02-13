package ifelse.com;

import java.util.Scanner;

public class AlphabetCaseCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any alphabet ");
		char ch = sc.next().trim().charAt(0);
		
		if (ch >='a' && ch <='z') {
			System.out.println(ch  +" is Lowercase");
		}
		else if(ch >='A' && ch <='Z'){
			System.out.println(ch  +" is Uppercase");
		}
		else {
			System.out.println(ch  +" is not a Valid Alphabet");
		}

	}

}
