package speed;

public class Operators {
	public static void main(String[] args) {
		int i = 152, j = 874;
		System.out.println("i is " + i + " and j is " +j);
		System.out.println(i==j); // expected false
		// != operator
	    System.out.println(i != j);  // true

	    // > operator
	    System.out.println(i > j);  // false

	    // < operator
	    System.out.println(i < j);  // true

	    // >= operator
	    System.out.println(i >= j);  // false

	    // <= operator
	    
	    System.out.print("Logical Operators.");
	    // && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
		
		

}
}
