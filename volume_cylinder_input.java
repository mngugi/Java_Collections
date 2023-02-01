import java.util.Scanner; 

public class Main{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   double pi = 3.1456;
   int radius = input.nextInt();
   int length = input.nextInt();
   double Area = pi * (radius * radius);
   double Volume = Area * length;
   
   System.out.println("Enter the radius of a Cylinder: " +radius);
   System.out.println("Enter the length of a Cylinder: " +length);
   System.out.println("Area of the Cylinder is: " +Area);
   System.out.println("Volume of the Cylinder is: " +Volume);
      
   
   }


}


