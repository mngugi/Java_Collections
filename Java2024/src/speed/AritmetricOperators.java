package speed;

public class AritmetricOperators {
	public static void main(String[] args) {
		// declare variables
		int i = 56, j = 20;
		int var;
		
		//Addition 
		System.out.println("i+j=  " + (i+j));
		// Subtraction
		System.out.println("i-j=  " + (i-j));
		// Multiplication
		System.out.println("i*j=  " + (i*j));
		// Division 
		System.out.println("i/j=  " + (i/j));
		// Modulo
		System.out.println("i%j=  " + (i%j));
		
		// Assignment operators
		var = i;
		System.out.println("var using =: " + var);
		
		var =+ j;
		System.out.println("var using =: " + var);
		
		var *= i;
		System.out.println("var using =: " + var);
		
	}

}
