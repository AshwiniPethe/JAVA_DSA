package dsa.com.switchcase.newformat;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class weekday_weekend {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		
		
		switch (day) {
		case "monday","tuesday","wednesday","thursday","friday"-> System.out.println("Weekday");
		case "saturday","sunday"-> System.out.println("weekend");
		default->System.out.println("Please enter a valid day");
		}

	}

}
