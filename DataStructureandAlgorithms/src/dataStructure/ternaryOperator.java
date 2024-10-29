package dataStructure;
import java.util.Scanner;

public class ternaryOperator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		double marks = input.nextDouble();
		
		String results = (marks >= 40)? "pass" : "fail";
		System.out.println("Exam" + results);
		input.close();
	}

}
