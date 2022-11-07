import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int sizeArrayA = 0;
        int sizeArrayB = 0;

        System.out.print("Введите размер первого массива: ");
        sizeArrayA = scanner.nextInt();

        System.out.print("Введите размер второго массива: ");
        sizeArrayB = scanner.nextInt();

        int[] arrayA = new int[sizeArrayA];
        int[] arrayB = new int[sizeArrayB];
        int[] arrayC = new int[arrayA.length + arrayB.length];

        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextInt(20 + 1) + (-10);
        }

        Arrays.sort(arrayA);

        System.out.println("Первый массив: " + Arrays.toString(arrayA));

        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = random.nextInt(20 + 1) + (-10);
        }

        Arrays.sort(arrayB);

        System.out.println("Второй массив: " + Arrays.toString(arrayB));

        int indexArrayA = 0;
        int indexArrayB = 0;

        for (int indexArrayC = 0; indexArrayC < arrayC.length; indexArrayC++) {

            if (indexArrayB == arrayB.length || indexArrayA != arrayA.length
                && arrayA[indexArrayA] < arrayB[indexArrayB]) {

                arrayC[indexArrayC] = arrayA[indexArrayA++];

            } else {

                arrayC[indexArrayC] = arrayB[indexArrayB++];

            }

        }

        System.out.println("Результат слияния массивов: " + Arrays.toString(arrayC));

    }

}
