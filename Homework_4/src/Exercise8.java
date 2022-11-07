import java.util.Random;
import java.util.Arrays;

public class Exercise8 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] sourceArray = new int[20];

        for (int i = 0; i < sourceArray.length; i++) {
            sourceArray[i] = random.nextInt(20 + 1) + (-10);
        }

        System.out.println("Исходный массив: " + Arrays.toString(sourceArray));

        int minElement = sourceArray[0];
        int maxElement = sourceArray[0];

        int indexMinElement = 0;
        int indexMaxElement = 0;

        for (int i = 1; i < sourceArray.length; i++) {

            if (sourceArray[i] < minElement) {
                minElement = sourceArray[i];
                indexMinElement = i;
            }

            if (sourceArray[i] > maxElement) {
                maxElement = sourceArray[i];
                indexMaxElement = i;
            }

        }

        System.out.println("Минимальный элемент массива: " + minElement + " (index: " + indexMinElement + ")");
        System.out.println("Максимальный элемент массива: " + maxElement + " (index: " + indexMaxElement + ")");

    }

}
