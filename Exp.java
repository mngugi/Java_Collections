/******************************************************************************
 *  Compilation:  javac Exp.java
 *  Execution:    java Exp x
 *
 *  Prints out e^x using Taylor expansion.
 *
 *     e^x = 1 + x + x^2/2! + x^3/3! + x^4/4! + ..
 *
 *  % java Exp 1.0
 *  1.0
 *  1.0
 *
 *  % java Exp 1
 *  2.7182818284590455
 *  2.7182818284590455
 *
 *  % java Exp 10
 *  22026.465794806718
 *  22026.465794806714
 *
 *  % java Exp -10
 *  4.539992976248485E-5
 *  4.5399929762484854E-5
 *
 ******************************************************************************/

public class Exp {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.println(Math.exp(x));

        // for negative argument, use identity e^-x =  1/e^x
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        // compute e^x assuming x >= 0
        double term = 1.0;
        double sum = 0.0;
        for (int n = 1; sum != sum + term; n++) {
            sum += term;
            term *= x/n;
        }

        // print results
        if (isNegative)
            sum = 1.0 / sum;
        System.out.println(sum);
    }
}
