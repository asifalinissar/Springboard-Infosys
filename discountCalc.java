


public class discountCalc {
	
	int billid;
	int coustomerid;
	double discount;
	double billAmount;
	
	public void coustomerDetail(int billid, int coustomerid,int discountRate, double billAmount) {
		
		
		this.billid = billid ;
		this.coustomerid= coustomerid;
		this.discount = discountRate;
		this.billAmount = billAmount	;	
		
	}
	
	public double discountAmount() {
		
		
		double discountBillAmount = (billAmount - (billAmount*(discount/100)));
		
		return  discountBillAmount;
	}
	
	public static void main(String [] args) {
		discountCalc dis1 = new discountCalc();
		discountCalc dis2 = new discountCalc();
		
		
		dis1.coustomerDetail(1001, 101, 2, 199.9);
		
		dis2.coustomerDetail(1002, 102, 4, 210.5);
		
		
		
		System.out.println(dis1.discountAmount());
		System.out.println(dis2.discountAmount());
		
		
	}

}
