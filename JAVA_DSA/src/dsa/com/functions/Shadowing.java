package dsa.com.functions;

public class Shadowing {
	
	static int a = 100;
	
	public static void main(String[] args) {
		System.out.println(a);
		fun(a);
		int a = 10; // value of a as 100 is shadowed here.
		System.out.println(a);
		fun(a);
	}
	
	public static void fun(int a) {
		
		System.out.println("inside function "+a);
	}
}
