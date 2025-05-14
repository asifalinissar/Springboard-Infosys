


public class EmployeeRecords{
	
	public static void main(String [] args) {
		
		PermanentEmployee PE = new PermanentEmployee("Anil", 101, 10000, 1500, 3);
		
		System.out.println( "permanent employee : your salary " + PE.calculateSalary());
		
		ContractEmployee CE = new ContractEmployee("Ankit", 102, 500, 10);
		System.out.println("contract employee : your salary " + CE.CalculateSalary());
	}
	
}

class Employee{
	
	private int empId;
	private String name;
	private double salary;
	
	//set methods
	
	public void setId(int Id) {
		this.empId = Id;
	}
	public void setName(String Name) {
		this.name = Name;
	}
	public void setSalary(double Salary) {
		this.salary = Salary;
	}
	
	//get methods:
	
	public int getId() {
		int Id = this.empId;
		return Id;
	}
	public String getName() {
		String Name = this.name;
		return Name;
	}
	public double getSalary() {
		double Salary = this.salary;
		return Salary;
	}
	
	
}

class PermanentEmployee extends Employee{
	
	private double basicPay;
	private double hra;
	private int experience;
	
	// method for setting:
	
	public void setBasicpay(double basicPay) {
		this.basicPay = basicPay;
	}
	public void setExp(int exp) {
		this.experience = exp;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	
	//get methods:
	
	public double getBasicpay() {
		double Basicpay = this.basicPay;
		return Basicpay;
	}
	public int  getExp() {
		int  exp = this.experience;
		return exp;
	}
	public double getHra() {
		double hra = this.hra;
		return hra;
	}
	
	PermanentEmployee(String Name, int Id, double basicPay , double hra , int exp){
		
		setName(Name);
		setId(Id);
		setBasicpay(basicPay);
		setExp(exp);
		setHra(hra);
		
	}
	
	public double calculateSalary() {
		
		double variableComponent;
		
		if(experience < 3) {
			
			 variableComponent = 0;
			
		}else if(experience >= 3 && experience < 5) {
			
			variableComponent = basicPay * 5/100.0;
			
		}else if(experience >= 5 && experience <10) {
			
			variableComponent = basicPay * 7/100.0;
		}else {
			variableComponent = basicPay* 12/100.0;
		}
		
		double salary = variableComponent + basicPay + hra ;
		
		return salary;
	}
	
	
	
}

class ContractEmployee extends Employee{
	
	private  double wages;
	private int hours;
	
	//setter method:
	
	public void setWages(double wage) {
		this.wages = wage;
	}
	public void setHour(int hour) {
		this.hours = hour;
	}
	
//	getter method:
	
	public double getWages() {
		double Wage = this.wages;
		return Wage;
	}
	public int getHours() {
		int Hour = this.hours;
		return Hour;
	}
	
	ContractEmployee(String Name, int Id , double Wage , int Hour){
		
		setName(Name);
		setId(Id);
		setWages(Wage);
		setHour(Hour);
		
	}
	
	public double CalculateSalary() {
		
		double salary = wages * hours;
		return salary;
	}
	
	
	
}











