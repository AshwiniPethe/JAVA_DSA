package dsa.com.linearsearch;

import java.util.Arrays;

public class SearchInString {

	public static void main(String[] args) {
		String name = "ashwini";
		char letter = 'w';
		int len = name.length();
		int targetIndex = findIndex(name, len, letter);
		System.out.println("In "+name+" , '"+letter +"' is at index : " + targetIndex +" !!😊😊😊😊");
		

	}
	public static int findIndex(String name , int len , char letter) {
		for(int i = 0 ; i<len ;i++) {
			char namevalue = name.charAt(i);
			if(namevalue==letter)
				return i;
		}
		return -1;
	}
}
