


public class PolymorphismOverloading {
	
	public static void main (String [] args) {
		
		playerRating PR = new playerRating();
		PR.playerDetails(1, " 	Beckham");
		PR.calculateRating(9f, 9.9f);
		PR.calculateCategory();
		PR.display();
		
		
		playerRating PR1 = new playerRating();
		PR1.playerDetails(1, " Oscar");
		PR1.calculateRating(1f, 1f, 1f);
		PR1.calculateCategory();
		PR1.display();
		
	}

}

class playerRating{
	
	public int playerPosition;
	
	public String playerName;
	
	public float citricRate1;
	public float citricRate2;
	public float citricRate3;
	
	public float averageRating;
	
	public char playerCategory;
	
	
	public void playerDetails( int playerPositions , String playerNames ) {
		
		playerPosition = playerPositions;
		
		playerName = playerNames;
		
	}
	
	public void calculateRating(float citricRate1, float citricRate2 ) {
		
		averageRating = (citricRate1 + citricRate2)/2;
		
	}
	
	public void calculateRating(float citricRate1 , float citricRate2 , float citricRate3) {
		
		averageRating = (citricRate1 + citricRate2 + citricRate3)/3;
		
	}
	
	public void calculateCategory() {
	    if (averageRating > 8) {
	        playerCategory = 'A';
	    } else if (averageRating > 5) {
	        playerCategory = 'B';
	    } else if (averageRating >= 0) {
	        playerCategory = 'C';
	    } else {
	        playerCategory = 'U'; // U for undefined (negative rating)
	    }
	}

	
	public void display() {
		
		System.out.println("player Name : " + playerName);
		System.out.println(" player postion :" + playerPosition);
		System.out.println("player rating : " + averageRating);
		System.out.println("player category :" + playerCategory);
	}
}









