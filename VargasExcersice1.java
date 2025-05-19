
import java.util.ArrayList;
import java.util.Arrays;

public class VargasExcersice1 {
	
	public static void displayList(int...input) {
		
		
		System.out.println("the List is :");
		
		for(int i : input) {
			
			System.out.println(i);
			
			
		}
		
	}
	
	public static void maxOfList(int...input) {
		
		String [] value = new String[input.length];
		 
		int temp =0;
             int j = 0;
		
		for(int i : input) {
			
			value[j] =  Integer.toString(i) ;
			
		   
		    
		    if(Integer.parseInt(value[j]) > temp) {
		    	temp = Integer.parseInt(value[j]);
		    	
		    }
		    
		    j++;
	}
		System.out.println(temp);
		
		
	}
	
	


	
	public static void main(String [] args) {
		
       
        maxOfList(36,454,23,64,624246,634,34);
		
	}

}
