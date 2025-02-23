package dsa.com.loops.dowhile;

import java.util.*;

public class weekday_weekend {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String day;
		
		do {
			
			System.out.println("Please Enter day :");
			day = sc.next();
			if(day.equals("STOP")) {
				break;
			}
			else {
				switch (day) {
					case "monday","tuesday","wednesday","thursday","friday"-> System.out.println("Weekday");
					case "saturday","sunday"-> System.out.println("weekend");
					default->System.out.println("Please enter a valid day");
				}
			}
		}while(!day.equals("STOP"));
		

	}

}
