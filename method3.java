public class Main {
static int method3(int x, int y){
   return x / y ; 
   
}

static double method3_one(double x, double y){
    return x*y ;

}

public static void main(String[] args){
   int numA = method3(100, 20);
   double numB = method3_one(10.2, 2.20);
   System.out.println("Math func int =  " + numA);
   System.out.println("Math func double =  " + numB);
}

}
