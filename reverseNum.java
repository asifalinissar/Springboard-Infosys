
// Create a class ReverseCalculator and implement the logic to reverse a number 
// i.e., if the input is provided as 27, then the output should be displayed as 72,
// using appropriate control structures.

public class reverseNum {
	
	
	// method using while loop
	
	public int calcuReverse(int num) {
		
		int reverse = 0;
		
		
		while(num > 0) {
			
			reverse = reverse*10 + num % 10;
			
			 num /= 10;
		}
		return reverse;
	}
	
	// method using for loop
	
	public int forReverse(int num) {
		
		int reverse = 0;
		
		for(; num>0; num /= 10) {
			reverse = reverse *10 + num% 10;
		}
		return reverse;
	}
	
	// method using while loop
	
	public int whileReverse(int num) {
		
		int reverse = 0;
		
		
		if( num == 0) {
			return reverse;
		}
		
		
		do {
			
			reverse = reverse*10 + num%10;
			
			num /= 10;
			
		}while(num < 0);
		
		return reverse;
		
	}
	
	public static void main(String [] args) {
		reverseNum rNum = new reverseNum();
		System.out.println(rNum.calcuReverse(27));
		
		System.out.println(rNum.forReverse(56));
		
		System.out.println(rNum.forReverse(89));
		
	}

}
