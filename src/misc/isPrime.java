package misc;

public class isPrime {

	public static void main(String[] args) {
	
		System.out.println(isPrime(53));		
		
			
		
	}
	
	public static boolean isPrime(int num) {
		int flag = 0;

		for (int i = 2 ; i  < (num/2)+1 ; i++) {
			if (num%i==0) {
				flag =1;
				
			}
			

	}
		if (flag==1) {
			return false;
		}
		else
			return true;
	}

}
