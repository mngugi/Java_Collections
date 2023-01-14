import java.util.Scanner;
public class Main{
	public static void main(String[]  args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter sum total: " );
	int sum = input.nextInt();
	
	
	if (sum > 250){
		System.out.println("Total sum is  " +sum+ " Greater than 249");
		
	}else if (sum < 250){
	 	System.out.println("Total of  " +sum+ " is less than 250");
	 		 	
	 	}else {
	 	System.out.println("Exact value is " +sum);
	 	
	 	}
	 	
	
	}


}
