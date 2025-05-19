



public class funCalcu {
	
	// method for checking the Armstrong number
	
	public void amstrongNum(int num) {
		
		
		int temp = num;
		
		int check = 0;
		
		while(num > 0) {
			 
			int digit = num % 10;
			int amg = digit * digit * digit;
			
			check += amg;
			
			num/=10;
			
			
		}
		if(temp == check) {
			System.out.println(" the number is Amstrong number");
		}else {
			System.out.println(" the number is not a Amstrong number");
			
		}
		
	
	}
	
	//method to find the lucky number
	
	public void luckyNum(String num) {
		
		int digit = 0;
		
		for(int i = 1; i<num.length() ; i+=2 ) {
			
			char c = num.charAt(i);
			
			int x = Character.getNumericValue(c);
			
			int y = x * x;
			
		     digit += y;
			
		}
		
		if(digit%9 == 0) {
			System.out.println(" the number is a lucky number");
			
		}else {
			System.out.println(" the number is not a lucky number");
		}
		
	}
	
	
	
	public static void main(String [] args) {
		
		funCalcu fn = new funCalcu();
		
		fn.amstrongNum(153);
		
		fn.luckyNum("1623");
		
	}

}
