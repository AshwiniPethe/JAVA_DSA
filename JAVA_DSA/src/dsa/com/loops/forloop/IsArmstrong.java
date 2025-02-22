package dsa.com.loops.forloop;

public class IsArmstrong {
	static long arm = 0;
	static long temp;
	static boolean result;

	public static void main(String[] args) {
		
		System.out.println("Armstrong number from 1 to 1000000000 : ");
		for(long i = 1 ; i<=1000000000L ;i++) {
			result=isArmstrong(i,String.valueOf(i).length());
			if(result){
				System.out.print(i+" ");
			}
		}
	}

	public static boolean isArmstrong(long num,int len) {
		long temp;
		long arm=0;
		long original = num;
			
		for (int i = 1 ; num>=1; i++) {
			temp = num%10;
			num=num/10;
						
			arm = arm+(multiple(len, temp));
		}
		if(original==arm) {
			return true;
		}else
		{
			return false;
		}
	}
	
	public static long multiple(int len,long value) {
		long temp=1;
		for (int j=1;j<=len;j++) {
			temp = temp*value;
		}
		return temp;
		
//		if (len==1) {
//			return value;
//		}
//		else if(len == 2) {
//			return value*value;
//		}
//		else if(len == 3) {
//			return value*value*value;
//		}
//		else if(len==4) {
//			return value*value*value*value;
//		}
//		else if(len==5) {
//			return value*value*value*value*value;
//		}
//		else if(len==6) {
//			return value*value*value*value*value*value;
//		}
//		else if(len==7) {
//			return value*value*value*value*value*value*value;
//		}
//		return 0;
	}
}
