package dsa.com.switchcase.newformat;

import java.util.Scanner;

public class Find_Weekday_Weekend {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a valid day");
		String day = sc.next();
		
		
		switch (day) {
		case "monday","tuesday","wednesday","thursday","friday"-> System.out.println("Weekday");
		case "saturday","sunday"-> System.out.println("weekend");
		default->System.out.println("Please enter a valid day");
		}

	}


}
