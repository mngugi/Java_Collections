/**
 * 1.2.30 Uniform random numbers. 
 * Write a program that prints five uniform random numbers between 0 and 1, 
 * their average value, and their minimum and maximum values. 
 * Use Math.random(), Math.min(), and Math.max().
 * ***/

public class RandomNumbers {

    public static void main(String[] args) {
        int count = 5;
        double sum = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        System.out.println("Generating " + count + " uniform random numbers between 0 and 1:");
        for (int i = 0; i < count; i++) {
            double randomNum = Math.random();
            sum += randomNum;
            min = Math.min(min, randomNum);
            max = Math.max(max, randomNum);
            System.out.println(randomNum);
        }

        double average = sum / count;
        System.out.println("\nAverage: " + average);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
