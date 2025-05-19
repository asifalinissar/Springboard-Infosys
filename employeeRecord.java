



public class employeeRecord {
	
	public  static double  averageSalary() {
		
		double avg =0;
		
		double [] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		
		for(int i = 0; i< salary.length; i++) {
			
		      avg = avg + salary[i];
		}
		
		double average = avg/5;
		
		System.out.println(average);
		
		return average;
	
	}
	
	public void employeeNum(double average) {
		
		int count = 0;
		
		
		double [] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		
		for(int i = 0; i< salary.length; i++) {
			
			if(average < salary[i] ) {
				 
				count ++;
			}
			      
		}
		System.out.println(" no : of people has salary greather than average" + count);
		System.out.println(" no : of people has salary less than average " + (5 - count));
		
		
		
		
	}
	
	public static void main (String [] args) {
		
		employeeRecord eR = new employeeRecord();
		
		eR.averageSalary();
		eR.employeeNum(averageSalary());
	}

}
