package loop.com.forloop;

public class PrimeSeries {

	public static void main(String[] args) {
		
		System.out.println("Print prime number from 1 to 1000");

		//NOTE : 1 is not a prime number because 1 does not a two positive divisor.
		//Prime numbers are those who has exactly 2 divisors.
		// " 2 " is the only even prime number. 
		
		System.out.print("2 ");
		for(int i=3; i<=1000;i+=2) {
			isPrime(i);
		}
		

	}
	
	public static void isPrime(int num) {
		int count=0;
		for (int i=3; i<=num;i+=2) {
			if(num%i==0) {
				count++;
			}
		}
		if (count==1)
			System.out.print(num+" ");
	}

}
