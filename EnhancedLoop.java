import java.util.Scanner;


public class EnhancedLoop {
	
	 int [] markSub = new int[5];
	 
	 public void initializeMark() {
		 
		 
		 // traditional for loop
		 for(int i = 0; i< markSub.length ; i++) {
			 System.out.println("enter the mark for the sub");
			 
			 Scanner sc = new Scanner(System.in);
			 
			 markSub[i] =  sc.nextInt();
			 
		 }
		  // enhCED LOOP
		 for(int mark : markSub) {
			 System.out.println();
		 }
	 }
	 
	 public static void main(String [] args) {
		 
		 EnhancedLoop EL = new EnhancedLoop();
		 
		 EL.initializeMark();
	 }


}
