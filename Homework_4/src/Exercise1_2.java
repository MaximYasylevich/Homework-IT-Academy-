import java.util.Arrays;
import java.util.Random;

public class Exercise1_2 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int [20];

        int maxElementIndex = 0;
        int minElementIndex = 0;

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(10 + 1) + (-5);

            if (i != 0) {

                if (array[maxElementIndex] < array[i]) {
                    maxElementIndex = i;
                }

                if (array[minElementIndex] > array[i]) {
                    minElementIndex = i;
                }

            }

        }

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Масимальный элемент массива: " + array[maxElementIndex]);
        System.out.println("Минимальный элемент массива: " + array[minElementIndex]);

    }

}
