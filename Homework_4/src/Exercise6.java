import java.util.Random;
import java.util.Arrays;

public class Exercise6 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] sourceArray = new int [40];

        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = random.nextInt(20 + 1) + (-10);
        }

        System.out.println("Исходный массив: " + Arrays.toString(sourceArray));

        int counterNegativeValues = 0;
        int counterPositiveValues = 0;

        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] < 0) {
                counterNegativeValues++;
            } else {
                counterPositiveValues++;
            }
        }

        int[] positiveArray = new int[counterPositiveValues];
        int[] negativeArray = new int[counterNegativeValues];

        int indexPositiveArray = 0;
        int indexNegativeArray = 0;

        for (int i = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] < 0) {
                negativeArray[indexNegativeArray++] = sourceArray[i];
            } else {
                positiveArray[indexPositiveArray++] = sourceArray[i];
            }
        }

        System.out.println("Массив с положительными значениями: " + Arrays.toString(positiveArray));
        System.out.println("Массив с отрицательными значениями: " + Arrays.toString(negativeArray));

    }

}
