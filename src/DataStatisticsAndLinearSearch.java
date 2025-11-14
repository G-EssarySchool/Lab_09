import java.util.Random;
import java.util.Scanner;

public class DataStatisticsAndLinearSearch {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int[] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Data Points:");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(" ");

        int sum = 0;
        int max = dataPoints[0];
        int min = dataPoints[0];

        for (int value : dataPoints) {
            sum += value;
            if (value > max) max = value;
            if (value < min) min = value;
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("Sum of all values: " + sum);
        System.out.println("Average of values: " + average);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        int userValue1 = InputHelper.getRangedInt(scan,"Enter an int value between 1 and 100:", 1, 100);


        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue1) {
                count++;
            }
        }

        System.out.println("The value " + userValue1 + " was found " + count + " times in the array.");

        int userValue2 = InputHelper.getRangedInt(scan,"Enter another int value between 1 and 100:", 1, 100);

        int foundIndex = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue2) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("The value " + userValue2 + " was found at array index " + foundIndex + ".");
        } else {
            System.out.println("The value " + userValue2 + " was not found in the array.");
        }
    }
}
