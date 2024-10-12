package speed;

public class morgageInterest {
	// declare required variables
	String NAME = "Tom Dick Harry";
	double BALANCE = 520000.00;
	double RATE = 0.12;
	double INTEREST = BALANCE * RATE ;
	
	public static void main(String[] args) {
		
		
		
		morgageInterest morgage = new morgageInterest();
	
	System.out.println("Morgage Interest for " + morgage.NAME + " "+  morgage.INTEREST);
	
	}
	

}


