import java.util.Scanner;
public class Main {
        public static void main(String args[]){
        
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        
        if(number % 2== 0)
                System.out.println(number+ " Number is even");
        else
                System.out.println(number+ " Odd number");
        
        
        }



}
