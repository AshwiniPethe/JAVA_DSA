package loop.com.forloop;

public class PrimeSeries_Kunal_Logic {

	public static void main(String[] args) {
		
		System.out.println("Print prime number from 1 to 1000");

		//NOTE : 1 is not a prime number because 1 does not a two positive divisor.
		//Prime numbers are those who has exactly 2 divisors.
		// " 2 " is the only even prime number. 
		
		for(int i = 1 ; i<=1000;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
				
		}
		

	}
	
	static boolean isPrime(int n) {
		if(n <= 1)
			return false;
		
		int c = 2 ;
		while (c * c <=n) {
			if(n % c == 0 )
				return false;
			c++;
		}
		return c*c>n;
	}
}
