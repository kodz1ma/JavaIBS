/**
 * @author Вячеслав Кузеванов
 */

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        int array[] = new int[20];

        int max = 10;
        int min = -10;

        int max_negative = Integer.MIN_VALUE;
        int min_positive = Integer.MAX_VALUE;
        int positive = 0, negative = 0;

        int temp;

        System.out.println("Input array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min, max + 1);

            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            if ((array[i] < 0) && (max_negative < array[i])) {
                max_negative = array[i];
                negative = i;
            }
            if ((array[i] > 0) && (min_positive > array[i])) {
                min_positive = array[i];
                positive = i;
            }
        }

        System.out.println("\nmaximum negative number: " + negative);
        System.out.println("minimum positive number: " + positive);

        temp = array[negative];
        array[negative] = array[positive];
        array[positive] = temp;

        System.out.println("\nSwitch positions of numers:");
        System.out.print(Arrays.toString(array));

    }
}
