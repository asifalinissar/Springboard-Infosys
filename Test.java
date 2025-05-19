



 abstract class RRPaymentService {
	
	private double balance;
	private int customerId;
	
	
	
	RRPaymentService(double balance , int customerId){
		
		this.balance = balance;
		this.customerId = customerId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getCustomerId() {
		return customerId;
	}

	abstract void payBill (double amount);

}
 
  class ShoppingPayment extends RRPaymentService{
	  
	  private int counter;
	  private String paymentId;
	  
	  ShoppingPayment(double balance , int customerId){
		  
		  super(balance ,customerId);
		  
	  }
	    
	  public String getPaymentId() {
		  
		  String idPayment = this.paymentId;
		  return idPayment;
	  }
	  
	  public void  payBill (double amount) {
		  
		  if(amount > getBalance() ) {
			  
			  System.out.println(" Excess amount entered ! please try again  ");
			   
		  }else if(amount < getBalance()) {
			  
			  System.out.println("insuffiecent Balance");
		  }else {
			  
			  counter =  1000;
			  
			  this.paymentId = "S" + counter;
			  
			  System.out.println(" You have paid " + getBalance() + " successfull" );
			  
			  
			  counter++;
			  
		  }		  
		  
	  }
	  	 
 }
  
  class CreditCardPayment extends RRPaymentService{
	  
	  
	  private int counter = 1001;
	  private String paymentId;
	  
	  private double cashback;
	  private double balanceDue;
	  
	  CreditCardPayment(double balance , int customerId){
		  
		  super(balance , customerId);
	  }
	  
	  public String getPaymentId() {
		  
		  String idPayment = this.paymentId;
		  return idPayment;
	  }
	  public double getCashback() {
		  double cashBack = this.cashback;
		  return cashBack;
	  }
	  public double getBalanceDue() {
		  double balanceDue = this.balanceDue;
		  return balanceDue;
	  }
	  
	  void payBill(double amount) {
		  
		  if(amount > getBalance()) {
			  this.paymentId = "C" + counter;
			  counter++;
			  this.cashback = amount - getBalance();
			  balanceDue = 0;
			  
			 System.out.println(" coustomer details");
			 
			 System.out.println(" coustomer Id  :    " + getCustomerId());
			 System.out.println(" payment  Id   :    " + paymentId);
			 System.out.println(" previous Due  :    " + getBalance());
			 System.out.println(" Remaning Due  :    " + balanceDue);
			 System.out.println(" CashBack      :    " + getCashback());
		  }
		  
		  else if ( amount < getBalance()) {
			  
			  this.paymentId = "C" + counter;
			  counter++;
			  
			  balanceDue = getBalance() - amount;
			  cashback = 0;
			  
			  System.out.println(" coustomer details");
			  
			  System.out.println(" coustomer Id  :    " + getCustomerId());
				 System.out.println(" payment  Id   :    " + paymentId);
				 System.out.println(" previous Due  :    " + getBalance());
				 System.out.println(" Remaning Due  :    " + balanceDue);
				 System.out.println(" CashBack      :    " + getCashback());
			  
		  }
		  
		  
	  }
	  
	  
  }
  
  public class Test{
	  
	  public static void main (String [] args) {
		  
		  CreditCardPayment CC = new CreditCardPayment(10000.23, 5001);
		  
		  CC.payBill(15000);
		  
		  CC.payBill(0);
		  
		  RRPaymentService RR = new ShoppingPayment(5000, 5678);
		  RR.payBill(5000);
		  RR.payBill(400);
		  RR.payBill(10000);
		  
	  }
	  
  }

  
  
  
  
  
  
  
  
  
  
  