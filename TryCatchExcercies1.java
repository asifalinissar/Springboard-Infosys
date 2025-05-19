





public class TryCatchExcercies1 {
	
	public static int calculateCube(int n) {
		
		int cube = n*n*n;
		
		return cube;
				
	}
	public static void main(String [] args) {
		
		TryCatchExcercies1 TE = new TryCatchExcercies1();
		
		try {
		
			int num = Integer.parseInt(args[0]);
			System.out.println(calculateCube(num));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	
				

		

	}

}
