import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class course{
	
          String courseName;
	public course(String courseName) {
		this.courseName = courseName;
	}
	
	
	public String toString() {
		return courseName;
	}
}

class Interface{
	
	public static void main(String [] args) {
		
		List<course>  courseName= new LinkedList<>();
		
		courseName.add(new course("java"));
		courseName.add(new course("Hibernate"));
		courseName.add(new course("Spring boot"));
		
		
		//accessing the value of the list using iterator
		
		Iterator<course> courseIterator  =  courseName.iterator();
		
		System.out.println("inside the iterator");
		
		while (courseIterator.hasNext()) {
			
			course c =  courseIterator.next();
			
			System.out.println(c);
					
			
		}
				
	}
}











