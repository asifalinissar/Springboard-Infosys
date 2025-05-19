//Problem Statement:
//Objective: Develop a basic Java program to understand class and initialize the instance variable of a class.
//
//Problem Description: Develop a class "Rectangle". The class should have two instance variables with private access modifier.
//
//length: int (length is the variable and int is the data type)
//breadth: int
//Use setter methods to initialize the instance variables.


public class Rectangle{
	
	private int length;
	private int breadth;
	
	
	public void setLength(int len) {
		this.length = len;
	}
	
	public void setWidth(int wid) {
		this.breadth = wid;
	}
	public void display() {
		System.out.println(length);
		System.out.println(breadth);
	}
	
	// main method 
	
	public static void main (String [] args ) {
		
		Rectangle rect = new Rectangle();
		rect.setLength(10);
		rect.setWidth(30);
		
		rect.display();
	}
}
