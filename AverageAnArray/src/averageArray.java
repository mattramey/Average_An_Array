import java.util.Scanner;

// Create two methods  that take input for an integer and double value and store in an array
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
// get user input for ten numbers
    public static void main(String[] args) {
        try (Scanner input = new java.util.Scanner(System.in)) {
            double[] doubleArray = new double[10];
// loop through each itteration until user enter 10 numerical values
            System.out.println("Enter ten double values:");
            for (int i = 0; i < 10; i++) {
                doubleArray[i] = input.nextDouble();
                
            }
//assign result
            double doubleAverage = average(doubleArray);
// Print result
            System.out.println("The average of the ten double values is: " + doubleAverage);
        }
    }
}

