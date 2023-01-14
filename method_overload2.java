public class Main {
static int addMethod(int numA , int numB)
{
return numA + numB;

}
static double addDouble(double numA , double numB)
{
return numA + numB;

}

public static void main(String[] args){
int num_intAdd_Answer = addMethod(4,5);
double num_doubleAdd_Answer = addDouble(3.12,6.12);
System.out.println("int answer:" + num_intAdd_Answer);
System.out.println("double answer: " + num_doubleAdd_Answer);

}


}
