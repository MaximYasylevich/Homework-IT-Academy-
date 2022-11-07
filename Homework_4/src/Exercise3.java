import java.util.Arrays;
import java.util.Random;

public class Exercise3 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[10];

        for(int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100 + 1);

        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        int sumDigits = 0;

        for (int i = 0; i < array.length; i++) {

            while(array[i] > 0) {

                sumDigits += array[i] % 10;
                array[i] /= 10;

            }

        }

        System.out.println("Сумма цифр массива: " + sumDigits);

    }

}
