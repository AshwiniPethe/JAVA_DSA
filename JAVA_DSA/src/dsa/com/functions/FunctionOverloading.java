package dsa.com.functions;

public class FunctionOverloading {
	public static void main(String[] args) {
		fun();
		fun(1,2);
		fun(3);
		fun("Ashwini Pethe");
		
	}
	
	public static void fun(int a , int b) {
		System.out.println(a +" , "+b);
	}
	public static void fun(int a) {
		System.out.println(a);
	}
	public static void fun() {
		System.out.println("No Arg");
	}
	public static void fun(String name) {
		System.out.println(name);
	}
}
