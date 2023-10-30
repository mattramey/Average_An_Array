import java.util.Scanner;

public class averageArray {
    public static int average(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        try (Scanner input = new java.util.Scanner(System.in)) {
            double[] doubleArray = new double[10];

            System.out.println("Enter ten double values:");
            for (int i = 0; i < 10; i++) {
                doubleArray[i] = input.nextDouble();
                
            }

            double doubleAverage = average(doubleArray);
            System.out.println("The average of the ten double values is: " + doubleAverage);
        }
    }
}

