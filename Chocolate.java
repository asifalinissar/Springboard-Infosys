
//problems :
//ABC Confectionary is a chocolate manufacturer.
//Every chocolate which is manufactured will be with a default weight and cost.
//The cost and weight might be modified later based on business needs.


//Chocolate(): In the constructor initialize the variables, barCode, name, weight and cost,
//according to the table given below:


//Attributes	Values
//barCode	101
//name	Cadbury
//weight	12
//cost	10

//Use the setter methods to modify the values as given :
//Attributes	Values
//barCode	102
//name	Hershey's
//weight	24
//cost	50



public class Chocolate {
	
	private String name;
	private int barcode;
	private int weight;
	private int cost;
	
	Chocolate(){
		
		name = "Cadbury";
		barcode = 101;
		weight = 12;
		cost = 10;
		
	}
	
	// setting method;
	
	public void setName(String Name) {
		this.name = Name;
	}
	public void setBarcode(int Barcode) {
		this.barcode = Barcode;
	}
	public void setWeight(int Weight) {
		this.weight = Weight;
	}
	public void setCost(int Cost) {
		this.cost = Cost;
	}
	
	// method for getting;
	
	public String getName() {
		 String Name = this.name;
		 return Name;
	}
	public int getBarcode() {
		int Barcode = this.barcode;
		 return Barcode;
	}
	public int getWeight() {
		int Weight = this.weight;
		 return Weight;
	}
	public int getCost() {
		int Cost = this.cost;
		 return Cost;
	}
	
	//method for this display
	
	public void display() {
		
		
		System.out.println(name);
		System.out.println(barcode);
		System.out.println(weight);
		System.out.println(cost);
	}
	
	// main method:
	
	public static void main (String [] args) {
		
		Chocolate ch = new Chocolate();
		// method for printing default values:
		ch.display();
		
		// giving value;
		ch.setBarcode(102);
		ch.setName("Hershey's");
		ch.setWeight(24);
		ch.setCost(50);
		
		ch.display();
	}
	

}










