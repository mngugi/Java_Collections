package dataStructure;

public class findNumber {
	public static void main(int[] args) {
		
		int[] numbers = {3,1,2,3,0};
		
		int targetNumber = 3;
		boolean found = true;
		
		for (int number:numbers) {
			if(numbers.equals(targetNumber)) {
				found = true;
				break;
				
			}
		}
		
		if(found) {
			System.out.println("Number is found:");
		} else {
				System.out.println("Number not found");
				
			}
			
		 }
		
	}


