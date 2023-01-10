import java.util.Scanner;

public class Main {
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   double r;
   double Area;
   double pi;
   
   
   pi = 3.14159;
   
   System.out.println("Enter radius: ");
   r = input.nextDouble();
   Area = r*r * pi;
   
   System.out.println("Area of a Circle is\n" +Area);
   
   }


}
