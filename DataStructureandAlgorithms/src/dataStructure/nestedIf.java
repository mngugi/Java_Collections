package dataStructure;

public class nestedIf {
	public static void main(String[] args) {
		Double num1 = -2.4, num2 = 6.3, num3 = 8.5, largest_number ;
		
		// check and compare the largest number
		
		if( num1 >= num2) {
			largest_number = num1;
			System.out.println("Larger number is" + largest_number );
			
		}
		else {
			System.out.println("Lager number is " + num2);
		}
		
		else if (num2 >= num3) {
			System.out.println("Lager number is " + num2);
		}
	}

}
