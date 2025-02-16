package switchcase.com.oldformat;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class weekday_weekend {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String day = sc.next();
		
		
		switch (day) {
		case "monday": 
		case "tuesday": 
		case "wednesday": 
		case "thursday": 
		case "friday": {
			System.out.println("Weekday");
			break;
		}
		case "saturday": 
		case "sunday": {
			System.out.println("weekend");
			break;
		}
		default:
			System.out.println("Please enter a valid day");
		}

	}

}
