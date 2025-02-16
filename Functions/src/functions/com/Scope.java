package functions.com;

public class Scope {
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a above outside block "+a);
		{
			int b = 11;
			a=100;
			System.out.println("a inside block "+a);
			System.out.println("b inside block "+b);
		}
		int b=1;
		System.out.println("a outside block "+a);
		System.out.println("b outside block "+b);
	}
}
