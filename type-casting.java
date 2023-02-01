public class Main {
  public static void main(String[] args) {
    int myInt = 9;
    double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0
    
    double numDouble = 9.78d;
    int num = (int) numDouble;
    
    System.out.println(numDouble);      // 
    System.out.println(num); 
  }
}
